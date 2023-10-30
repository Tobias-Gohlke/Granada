package com.example.granada.data.provider

import com.example.granada.R
import com.example.granada.data.Recommendations

object RecommendationsItems {
    val recommendationsGranadas = listOf(
        Recommendations(
            optionNameResId = R.string.parks,
            placeNameResId = R.string.recommendationParkFrederico,
            stars = R.string.starsParkFrederico,
            descriptionResId = R.string.recommendationParkFredericoDes,
            picture = R.drawable.parkfrederico
        ),
        Recommendations(
            optionNameResId = R.string.parks,
            placeNameResId = R.string.recommendationParkGeneralife,
            stars = R.string.starsParkGeneralife,
            descriptionResId = R.string.recommendationParkGeneralifeDes,
            picture = R.drawable.generallife
        ),
        Recommendations(
            optionNameResId = R.string.parks,
            placeNameResId = R.string.recommendationParkJardines,
            stars = R.string.starsParkJardines,
            descriptionResId = R.string.recommendationParkJardinesDes,
            picture = R.drawable.jardines
        ),
        Recommendations(
            optionNameResId = R.string.parks,
            placeNameResId = R.string.recommendationParkMedina,
            stars = R.string.starsParkMedina,
            descriptionResId = R.string.recommendationParkMedinaDes,
            picture = R.drawable.medina
        ),
        Recommendations(
            optionNameResId = R.string.hiking,
            placeNameResId = R.string.recommendationHikingAlhambra,
            stars = R.string.starsHikingAlhambra,
            descriptionResId = R.string.recommendationHikingAlhambraDes,
            picture = R.drawable.hiking
        ),
        Recommendations(
            optionNameResId = R.string.hiking,
            placeNameResId = R.string.recommendationHikingMonachil,
            stars = R.string.starsHikingMonachil,
            descriptionResId = R.string.recommendationHikingMonachilDes,
            picture = R.drawable.hiking
        ),
        Recommendations(
            optionNameResId = R.string.hiking,
            placeNameResId = R.string.recommendationHikingCaminitoDelRey,
            stars = R.string.starsHikingCaminitoDelRey,
            descriptionResId = R.string.recommendationHikingCaminitoDelReyDes,
            picture = R.drawable.caminito
        ),
        Recommendations(
            optionNameResId = R.string.pizzaria,
            placeNameResId = R.string.recommendationPizzariaSantoro,
            stars = R.string.starsPizzariaSantoro,
            descriptionResId = R.string.recommendationPizzariaSantoroDes,
            picture = R.drawable.pizzaria
        ),
        Recommendations(
            optionNameResId = R.string.pizzaria,
            placeNameResId = R.string.recommendationPizzariaCiao,
            stars = R.string.starsPizzariaCiao,
            descriptionResId = R.string.recommendationPizzariaCiaoDes,
            picture = R.drawable.pizzaria
        ),
        Recommendations(
            optionNameResId = R.string.pizzaria,
            placeNameResId = R.string.recommendationPizzariaCiao,
            stars = R.string.starsPizzariaCiao,
            descriptionResId = R.string.recommendationPizzariaCiaoDes,
            picture = R.drawable.pizzaria
        ),
        Recommendations(
            optionNameResId = R.string.pizzaria,
            placeNameResId = R.string.recommendationPizzariaAmici,
            stars = R.string.starsPizzariaAmici,
            descriptionResId = R.string.recommendationPizzariaAmiciDes,
            picture = R.drawable.pizzaria
        ),
        Recommendations(
            optionNameResId = R.string.pizzaria,
            placeNameResId = R.string.recommendationPizzariaMille,
            stars = R.string.starsPizzariaMille,
            descriptionResId = R.string.recommendationPizzariaMilleDes,
            picture = R.drawable.pizzaria
        ),
        Recommendations(
            optionNameResId = R.string.parties,
            placeNameResId = R.string.recommendationPartiesMae,
            stars = R.string.starsPartiesMae,
            descriptionResId = R.string.recommendationPartiesMeaDes,
            picture = R.drawable.meawest
        ),
        Recommendations(
            optionNameResId = R.string.parties,
            placeNameResId = R.string.recommendationPartiesConfuso,
            stars = R.string.starsPartiesConfuso,
            descriptionResId = R.string.recommendationPartiesConfusoDes,
            picture = R.drawable.confuso
        ),
        Recommendations(
            optionNameResId = R.string.parties,
            placeNameResId = R.string.recommendationPartiesNocta,
            stars = R.string.starsPartiesNocta,
            descriptionResId = R.string.recommendationPartiesNoctaDes,
            picture = R.drawable.party
        ),
        Recommendations(
            optionNameResId = R.string.other,
            placeNameResId = R.string.recommendationOtherAlmeria,
            stars = R.string.starsOtherAlemria,
            descriptionResId = R.string.recommendationOtherAlmeriaDes,
            picture = R.drawable.party
        ),
        Recommendations(
            optionNameResId = R.string.other,
            placeNameResId = R.string.recommendationOtherMalaga,
            stars = R.string.starsOtherMalaga,
            descriptionResId = R.string.recommendationOtherMalagaDes,
            picture = R.drawable.party
        ),
        Recommendations(
            optionNameResId = R.string.other,
            placeNameResId = R.string.recommendationOtherRonda,
            stars = R.string.starsOtherRonda,
            descriptionResId = R.string.recommendationOtherRondaDes,
            picture = R.drawable.party
        ),
        Recommendations(
            optionNameResId = R.string.other,
            placeNameResId = R.string.recommendationOtherSevilla,
            stars = R.string.starsOtherSevilla,
            descriptionResId = R.string.recommendationOtherSevillaDes,
            picture = R.drawable.party
        ),
    )
    /**
     * Get the contact of the current user with the given [accountId].
     */
    /*
    fun getContactAccountById(accountId: Long): DataLayer {
        return allUserContactAccounts.firstOrNull { it.id == accountId }
            ?: allUserContactAccounts.first()
    }

     */
}
