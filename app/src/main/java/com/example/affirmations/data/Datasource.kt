package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource {
    fun loadAffirmations(): List<Affirmation>{
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.rock_Lee),
            Affirmation(R.string.affirmation2, R.drawable.itachi),
            Affirmation(R.string.affirmation3, R.drawable.itachi_Uchiha2),
            Affirmation(R.string.affirmation4, R.drawable.obito_Uchiha),
            Affirmation(R.string.affirmation5, R.drawable.kakashi_Hatake),
            Affirmation(R.string.affirmation6, R.drawable.jiraya),
            Affirmation(R.string.affirmation7, R.drawable.gaara),
            Affirmation(R.string.affirmation8, R.drawable.pain),
            Affirmation(R.string.affirmation9, R.drawable.pain2),
            Affirmation(R.string.affirmation10, R.drawable.Obito_Uchiha2)
        )

    }
}