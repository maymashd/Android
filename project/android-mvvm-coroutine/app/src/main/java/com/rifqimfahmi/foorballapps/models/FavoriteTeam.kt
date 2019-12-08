package com.rifqimfahmi.foorballapps.models

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "favorite_teams")
data class FavoriteTeam(
    @PrimaryKey
    val idTeam: String
)