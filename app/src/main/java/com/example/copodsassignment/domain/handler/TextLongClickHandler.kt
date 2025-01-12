package com.example.copodsassignment.domain.handler

import com.example.copodsassignment.data.models.FeedItem
import com.example.copodsassignment.data.models.TextFeedItem
import com.example.copodsassignment.domain.InteractionListener

class TextLongClickHandler : InteractionHandler {
    override fun handle(feedItem: FeedItem, interactionType: InteractionType, listener: InteractionListener?): Boolean {
        if (interactionType == InteractionType.LONG_CLICK && feedItem is TextFeedItem) {
            listener?.onTextCopy(feedItem.content)
            return true
        }
        return false
    }
}