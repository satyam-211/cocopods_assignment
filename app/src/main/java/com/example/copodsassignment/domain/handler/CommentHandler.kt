package com.example.copodsassignment.domain.handler

import com.example.copodsassignment.data.models.FeedItem
import com.example.copodsassignment.data.repository.FeedRepository
import com.example.copodsassignment.domain.InteractionListener

class CommentHandler(private val feedRepository: FeedRepository) : InteractionHandler {
    override fun handle(feedItem: FeedItem, interactionType: InteractionType, listener: InteractionListener?): Boolean {
        if (interactionType == InteractionType.CLICK) {
            val comment = "New comment" // This should be dynamically provided by the UI
            feedRepository.addComment(feedItem, comment)
            listener?.onComment(feedItem, comment)
            return true
        }
        return false
    }
}