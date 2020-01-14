package com.thilux.notes.model

import android.os.Parcelable
import kotlinx.android.parcel.IgnoredOnParcel
import kotlinx.android.parcel.Parcelize
import java.util.*

/**
 * Created by tsantana on 03/03/18.
 */
@Parcelize
data class Note(val id: Long, val title: String, val content: String): Parcelable{
    @IgnoredOnParcel
    var creationDate: Date = Date()
}