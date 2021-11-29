package com.example.mvvmkotlinexample.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ArticleDetail {

    /*"title": "【朗報】Nintendo SwitchにAndroid入れたンゴｗｗｗｗｗｗｗｗｗｗｗｗｗｗｗｗｗｗ",
    "description": "タブレット化か 1: 風吹けば名無し 2021/11/26(金) 15:07:41.34 ID:KD39lzwZd.net 快適になんｊできて草 2chMate 0.8.10.122 dev/NVIDIA/Switch/...",
    "url": "http://www.gadget2ch.com/archives/post-178716.html",
    "urlToImage": "https://i0.wp.com/www.gadget2ch.com/wp-content/uploads/2021/11/71FStcwzG-L._SL1500_-1.jpg?fit=300%2C300",
    "publishedAt": "2021-11-26T07:21:57Z",
    "content":
    */
    @SerializedName("author")
    @Expose
    val author: String? = null

    @SerializedName("title")
    @Expose
    val title: String? = null

    @SerializedName("description")
    @Expose
    val description: String? = null

    @SerializedName("url")
    @Expose
    val url: String? = null

    @SerializedName("urlToImage")
    @Expose
    val urlToImage: String? = null

    @SerializedName("publishedAt")
    @Expose
    val publishedAt: String? = null

    @SerializedName("content")
    @Expose
    val content: String? = null

 /*   @SerializedName("source")
    @Expose
    val detail: List<SourceDetail>? = null*/

}