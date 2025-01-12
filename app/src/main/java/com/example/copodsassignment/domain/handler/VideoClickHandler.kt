package com.example.copodsassignment.domain.handler

import com.example.copodsassignment.data.models.FeedItem
import com.example.copodsassignment.data.models.VideoFeedItem
import com.example.copodsassignment.domain.InteractionListener

class VideoClickHandler : InteractionHandler {
    override fun handle(feedItem: FeedItem, interactionType: InteractionType, listener: InteractionListener?): Boolean {
        if (interactionType == InteractionType.CLICK && feedItem is VideoFeedItem) {
            listener?.onVideoPlay(feedItem.videoUrl)
            return true
        }
        return false
    }
}