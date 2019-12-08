package com.dake.foorballapps.util

import androidx.lifecycle.MutableLiveData
import com.dake.foorballapps.data.source.remote.ApiResponse
import com.dake.foorballapps.data.source.remote.json.SchedulesResponse
import retrofit2.Response


 
object ApiUtil {
    fun successScheduleCall(data: SchedulesResponse) = createScheduleCall(Response.success(data))

    fun createScheduleCall(response: Response<SchedulesResponse>) = MutableLiveData<ApiResponse<SchedulesResponse>>().apply {
        value = ApiResponse.create(response)
    }
}