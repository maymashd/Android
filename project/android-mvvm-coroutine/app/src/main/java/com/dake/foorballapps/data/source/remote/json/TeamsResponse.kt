package com.dake.foorballapps.data.source.remote.json

import com.dake.foorballapps.vo.Team
import com.squareup.moshi.Json

data class TeamsResponse (
    @Json(name = "teams")
    val teams: List<Team?>?
)