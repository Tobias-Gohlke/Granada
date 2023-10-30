package com.example.granada.data.provider

import com.example.granada.R
import com.example.granada.data.Options

object OptionItems {

    val optionsGranada = listOf(
        Options(
            id = 1L,
            placeNameResId = R.string.parks,
            descriptionResId = R.string.descriptionParks,
            picture = R.drawable.craiyon_221309_park_with_flowers
        ),
        Options(
            id = 2L,
            placeNameResId = R.string.hiking,
            descriptionResId = R.string.descriptionHiking,
            picture = R.drawable.hiking
        ),
        Options(
            id = 3L,
            placeNameResId = R.string.pizzaria,
            descriptionResId = R.string.descriptionPizzaria,
            picture = R.drawable.pizzaria
        ),Options(
            id = 4L,
            placeNameResId = R.string.parties,
            descriptionResId = R.string.descriptionParty,
            picture = R.drawable.party
        ),
        Options(
            id = 5L,
            placeNameResId = R.string.other,
            descriptionResId = R.string.descriptionOther,
            picture = R.drawable.other
        ))
}