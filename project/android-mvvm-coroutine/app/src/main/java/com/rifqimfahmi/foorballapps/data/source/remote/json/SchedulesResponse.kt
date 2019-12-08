package com.rifqimfahmi.foorballapps.data.source.remote.json

import com.rifqimfahmi.foorballapps.models.Match
import com.squareup.moshi.Json



data class SchedulesResponse(
    @Json(name = "events")
    val events: List<Match?>?
)