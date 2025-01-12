package com.example.copodsassignment.data.repository

import com.example.copodsassignment.data.models.FeedItem

interface FeedRepository {
    fun getFeedData(): List<FeedItem>
}