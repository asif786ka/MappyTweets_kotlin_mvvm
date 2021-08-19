package com.mappy.twitter.repository.model.tweet

import com.google.gson.annotations.SerializedName

data class Description(

	@field:SerializedName("urls")
	val urls: List<Any?>? = null
)