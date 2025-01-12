package com.example.copodsassignment.domain

import com.example.copodsassignment.data.models.FeedItem

interface FeedFramework {
    fun getFeedItems(): List<FeedItem>
    fun handleItemClick(feedItem: FeedItem)
    fun handleItemLongClick(feedItem: FeedItem)
    fun registerInteractionListener(listener: InteractionListener)
}