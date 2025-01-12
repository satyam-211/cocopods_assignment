package com.example.copodsassignment.data.models

sealed class FeedItem(
    open val postedTimestamp: Long,
    open val sourceInfo: String
)