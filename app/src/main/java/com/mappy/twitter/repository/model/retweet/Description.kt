package com.mappy.twitter.repository.model.retweet

import com.google.gson.annotations.SerializedName

data class Description(

	@field:SerializedName("urls")
	val urls: List<Any?>? = null
)