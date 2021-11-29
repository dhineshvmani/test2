package com.example.mvvmkotlinexample.retrofit

import com.example.mvvmkotlinexample.model.ServicesSetterGetter
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("everything?q=android&sortBy=publishedAt&apiKey=d1129ee7cc7f409eb324c6228ce11726")
    fun getServices() : Call<ServicesSetterGetter>

}