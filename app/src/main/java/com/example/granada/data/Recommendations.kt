package com.example.granada.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Recommendations(
    /** Unique ID of a user **/
    val optionNameResId: Int,
    /** User's first name **/
    @StringRes
    val placeNameResId: Int,
    /** User's last name **/
    @StringRes
    val stars: Int,
    /** User's email address **/
    @StringRes
    val descriptionResId: Int,
    /** User's avatar image resource id **/
    @DrawableRes
    val picture: Int
)