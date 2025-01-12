package com.example.copodsassignment.domain

interface InteractionListener {
    fun onImageExpand(imageUrl: String)
    fun onVideoPlay(videoUrl: String)
    fun onTextCopy(content: String)
}