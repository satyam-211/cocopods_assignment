package com.example.copodsassignment.domain

import com.example.copodsassignment.data.models.FeedItem

interface FeedFramework {
    fun getFeedItems(): List<FeedItem>
    fun handleItemClick(feedItem: FeedItem)
    fun handleItemLongClick(feedItem: FeedItem)
    fun registerClickListener(listener: OnItemClickListener)
    fun registerLongClickListener(listener: OnItemLongClickListener)
}

interface OnItemClickListener {
    fun onItemClick(feedItem: FeedItem)
}

interface OnItemLongClickListener {
    fun onItemLongClick(feedItem: FeedItem)
}