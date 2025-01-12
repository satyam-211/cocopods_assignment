package com.example.copodsassignment.data.models

data class TextFeedItem(
    override val postedTimestamp: Long,
    override val sourceInfo: String,
    val content: String
) : FeedItem(postedTimestamp, sourceInfo)