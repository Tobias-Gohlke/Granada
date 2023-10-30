package com.example.granada.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Options(
    val id: Long,
    /** Option name **/
    @StringRes
    val placeNameResId: Int,
    /** Option name **/
    @StringRes
    val descriptionResId: Int,
    /** User's avatar image resource id **/
    @DrawableRes
    val picture: Int
)