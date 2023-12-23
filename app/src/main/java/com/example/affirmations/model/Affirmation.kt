package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

//  The model package will contain the data model that will be represented by a data class. The data class will be comprised of properties that represent the information relevant to what will be an "Affirmation," which will consist of a string resource and an image resource.
data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
