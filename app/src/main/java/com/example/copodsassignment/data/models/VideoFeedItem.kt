package com.example.copodsassignment.data.models

data class VideoFeedItem(
    override val postedTimestamp: Long,
    override val sourceInfo: String,
    val videoUrl: String
) : FeedItem(postedTimestamp, sourceInfo)