package com.example.copodsassignment.domain

import com.example.copodsassignment.data.models.FeedItem

interface InteractionListener {
    fun onImageExpand(imageUrl: String)
    fun onVideoPlay(videoUrl: String)
    fun onTextCopy(content: String)
    fun onLike(feedItem: FeedItem)
    fun onComment(feedItem: FeedItem, comment: String)
}