package com.example.mvvmkotlinexample.repository

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mvvmkotlinexample.model.ServicesSetterGetter
import com.example.mvvmkotlinexample.retrofit.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object MainActivityRepository {

    val serviceSetterGetter = MutableLiveData<ServicesSetterGetter>()
    fun getServicesApiCall(): MutableLiveData<ServicesSetterGetter> {
        val call = RetrofitClient.apiInterface.getServices()

        call.enqueue(object: Callback<ServicesSetterGetter> {
            override fun onFailure(call: Call<ServicesSetterGetter>, t: Throwable) {
                Log.e("onFailure", t.message.toString())
            }

            override fun onResponse(
                call: Call<ServicesSetterGetter>,
                response: Response<ServicesSetterGetter>
            ) {
                Log.e("response", response.body().toString())
                val data = response.body()
                val status = data!!.status
                val totalResults = data!!.totalResults
            }
        })

        return serviceSetterGetter
    }
}