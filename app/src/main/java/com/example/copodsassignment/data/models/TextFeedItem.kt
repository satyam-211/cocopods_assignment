package com.example.copodsassignment.data.models

data class TextFeedItem(
    override val postedTimestamp: Long,
    override val sourceInfo: String,
    val content: String,
    override val likes: Int = 0,
    override val comments: List<String> = emptyList()
) : FeedItem(postedTimestamp, sourceInfo,likes,comments)