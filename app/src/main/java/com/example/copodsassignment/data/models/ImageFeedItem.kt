package com.example.copodsassignment.data.models

data class ImageFeedItem(
    override val postedTimestamp: Long,
    override val sourceInfo: String,
    val imageUrl: String
) : FeedItem(postedTimestamp, sourceInfo)