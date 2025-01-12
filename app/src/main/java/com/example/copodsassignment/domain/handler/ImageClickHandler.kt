package com.example.copodsassignment.domain.handler

import com.example.copodsassignment.data.models.FeedItem
import com.example.copodsassignment.data.models.ImageFeedItem
import com.example.copodsassignment.domain.InteractionListener

class ImageClickHandler : InteractionHandler {
    override fun handle(feedItem: FeedItem, interactionType: InteractionType, listener: InteractionListener?): Boolean {
        if (interactionType == InteractionType.CLICK && feedItem is ImageFeedItem) {
            listener?.onImageExpand(feedItem.imageUrl)
            return true
        }
        return false
    }
}