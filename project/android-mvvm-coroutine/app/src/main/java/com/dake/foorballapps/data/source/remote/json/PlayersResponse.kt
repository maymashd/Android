package com.dake.foorballapps.data.source.remote.json

import com.dake.foorballapps.vo.Player
import com.squareup.moshi.Json

data class PlayersResponse(
    @Json(name = "player")
    val player: List<Player?>?
)