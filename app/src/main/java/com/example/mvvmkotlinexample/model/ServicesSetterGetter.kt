package com.example.mvvmkotlinexample.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.example.mvvmkotlinexample.model.ArticleDetail

class ServicesSetterGetter {

    @SerializedName("status")
    @Expose
    val status: String? = null

    @SerializedName("totalResults")
    @Expose
    val totalResults: String? = null

  /*  @SerializedName("articles")
    @Expose
    val detail: List<ArticlesDetail>? = null*/


}

