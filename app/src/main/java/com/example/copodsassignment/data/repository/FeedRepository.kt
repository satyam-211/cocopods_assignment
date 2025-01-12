package com.example.copodsassignment.data.repository

import com.example.copodsassignment.data.models.FeedItem

interface FeedRepository {
    fun getFeedData(): List<FeedItem>
    fun updateLikes(feedItem: FeedItem, likes: Int)
    fun addComment(feedItem: FeedItem, comment: String)
}