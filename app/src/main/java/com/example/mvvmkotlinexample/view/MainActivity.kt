package com.example.mvvmkotlinexample.view

import android.content.Context
import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmkotlinexample.R
import com.example.mvvmkotlinexample.model.ServicesSetterGetter
import com.example.mvvmkotlinexample.repository.MainActivityRepository
import com.example.mvvmkotlinexample.retrofit.RetrofitClient
import com.example.mvvmkotlinexample.viewmodel.MainActivityViewModel
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private var mProgressDialog: ProgressDialog? = null
    private lateinit var context: Context
    private lateinit var mainActivityViewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        context = this@MainActivity
        mainActivityViewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        btnClick.setOnClickListener {
            showProgressDialog(this)
            mainActivityViewModel.getUser()!!.observe(this, Observer { serviceSetterGetter ->
                closeProgressDialog()
                val status = serviceSetterGetter.status
                val totalResults = serviceSetterGetter.totalResults
                Log.e("totalResults",totalResults)
                Log.e("status",status)
            })

        }

    }

    fun showProgressDialog(mContext: Context?) {
        try {
            if (mProgressDialog != null) {
                mProgressDialog!!.dismiss()
            }
            mProgressDialog = ProgressDialog(mContext)
            mProgressDialog!!.setMessage("Please wait...")
            mProgressDialog!!.setCancelable(false)
            mProgressDialog!!.show()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun closeProgressDialog() {
        try {
            if (mProgressDialog != null) {
                mProgressDialog!!.dismiss()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

}
