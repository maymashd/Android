package com.rifqimfahmi.foorballapps.data.source.remote.json

import com.rifqimfahmi.foorballapps.vo.Match
import com.squareup.moshi.Json



data class SearchSchedulesResponse (
    @Json(name = "event")
    val event: List<Match?>?
)