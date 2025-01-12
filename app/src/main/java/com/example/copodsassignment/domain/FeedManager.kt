package com.example.copodsassignment.domain

import com.example.copodsassignment.data.models.FeedItem
import com.example.copodsassignment.data.repository.FeedRepository
import com.example.copodsassignment.domain.handler.InteractionHandler
import com.example.copodsassignment.domain.handler.InteractionType

class FeedManager(
    private val feedRepository: FeedRepository,
    private val clickHandlerChain: List<InteractionHandler>,
    private val longClickHandlerChain: List<InteractionHandler>
) : FeedFramework {

    private var interactionListener: InteractionListener? = null

    override fun registerInteractionListener(listener: InteractionListener) {
        interactionListener = listener
    }

    override fun getFeedItems(): List<FeedItem> {
        return feedRepository.getFeedData()
    }

    override fun handleItemClick(feedItem: FeedItem) {
        clickHandlerChain.forEach { handler ->
            if (handler.handle(feedItem, InteractionType.CLICK, interactionListener)) {
                return
            }
        }
    }

    override fun handleItemLongClick(feedItem: FeedItem) {
        longClickHandlerChain.forEach { handler ->
            if (handler.handle(feedItem, InteractionType.LONG_CLICK, interactionListener)) {
                return
            }
        }
    }

}