package com.example.mvvmnews.model

import com.example.mvvmnews.model.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)