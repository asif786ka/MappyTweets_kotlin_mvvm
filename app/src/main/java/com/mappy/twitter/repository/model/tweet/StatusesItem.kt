package com.mappy.twitter.repository.model.tweet

import com.google.gson.annotations.SerializedName

data class StatusesItem(

	@field:SerializedName("created_at")
	val createdAt: String? = null,

	@field:SerializedName("id")
	val id: Long? = null,

	@field:SerializedName("id_str")
	val idStr: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("truncated")
	val truncated: Boolean? = null,

	@field:SerializedName("entities")
	val entities: Entities? = null,

	@field:SerializedName("extended_entities")
	val extendedEntities: ExtendedEntity? = null,

	@field:SerializedName("metadata")
	val metadata: Metadata? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("in_reply_to_status_id")
	val inReplyToStatusId: Long? = null,

	@field:SerializedName("in_reply_to_status_id_str")
	val inReplyToStatusIdStr: String? = null,

	@field:SerializedName("in_reply_to_user_id")
	val inReplyToUserId: Long? = null,

	@field:SerializedName("in_reply_to_user_id_str")
	val inReplyToUserIdStr: String? = null,

	@field:SerializedName("in_reply_to_screen_name")
	val inReplyToScreenName: String? = null,

	@field:SerializedName("user")
	val user: User? = null,

	@field:SerializedName("geo")
	val geo: Geo? = null,

	@field:SerializedName("coordinates")
	val coordinates: Any? = null,

	@field:SerializedName("place")
	val place: Place? = null,

	@field:SerializedName("contributors")
	val contributors: Any? = null,

	@field:SerializedName("is_quote_status")
	val isQuoteStatus: Boolean? = null,

	@field:SerializedName("retweet_count")
	val retweetCount: Int? = null,

	@field:SerializedName("favorite_count")
	val favoriteCount: Int? = null,

	@field:SerializedName("favorited")
	val favorited: Boolean? = null,

	@field:SerializedName("retweeted")
	val retweeted: Boolean? = null,

	@field:SerializedName("possibly_sensitive")
	val possiblySensitive: Boolean? = null,

	@field:SerializedName("lang")
	val lang: String? = null
)