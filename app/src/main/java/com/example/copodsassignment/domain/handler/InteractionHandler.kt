package com.example.copodsassignment.domain.handler

import com.example.copodsassignment.data.models.FeedItem
import com.example.copodsassignment.domain.InteractionListener

enum class InteractionType { CLICK, LONG_CLICK }

interface InteractionHandler {
    fun handle(feedItem: FeedItem, interactionType: InteractionType, listener: InteractionListener?): Boolean
}