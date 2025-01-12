package com.example.copodsassignment.data.models

data class VideoFeedItem(
    override val postedTimestamp: Long,
    override val sourceInfo: String,
    val videoUrl: String,
    override val likes: Int = 0,
    override val comments: List<String> = emptyList()
) : FeedItem(postedTimestamp, sourceInfo, likes, comments)