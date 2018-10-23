package io.qplayer.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class VideoModel(var videoUrl: String? = null) : Parcelable