package com.dake.foorballapps.data.source.remote.json

import com.dake.foorballapps.vo.Match
import com.squareup.moshi.Json


data class SchedulesResponse(
    @Json(name = "events")
    val events: List<Match?>?
)