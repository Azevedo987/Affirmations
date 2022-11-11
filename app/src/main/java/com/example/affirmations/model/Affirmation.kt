package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(val stringResourceId: Int, val imageResourceId: Int) {
    data class Affirmation(@StringRes val stringResourceId: Int, @DrawableRes val imageResourceId: Int)
}