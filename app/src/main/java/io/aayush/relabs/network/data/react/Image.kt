package io.aayush.relabs.network.data.react

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Image(
    val `2x`: String = String(),
    val normal: String = String()
)
