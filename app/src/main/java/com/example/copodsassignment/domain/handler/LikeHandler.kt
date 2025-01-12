package com.example.copodsassignment.domain.handler

import com.example.copodsassignment.data.models.FeedItem
import com.example.copodsassignment.data.repository.FeedRepository
import com.example.copodsassignment.domain.InteractionListener

class LikeHandler(private val feedRepository: FeedRepository) : InteractionHandler {
    override fun handle(feedItem: FeedItem, interactionType: InteractionType, listener: InteractionListener?): Boolean {
        if (interactionType == InteractionType.CLICK) {
            feedRepository.updateLikes(feedItem, feedItem.likes + 1)
            listener?.onLike(feedItem)
            return true
        }
        return false
    }
}