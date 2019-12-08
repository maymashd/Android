package com.rifqimfahmi.foorballapps.models

import androidx.room.Entity
import androidx.room.PrimaryKey



@Entity(tableName = "favorite_matches")
data class FavoriteMatch (
    @PrimaryKey
    val idMatch: String
) {

}