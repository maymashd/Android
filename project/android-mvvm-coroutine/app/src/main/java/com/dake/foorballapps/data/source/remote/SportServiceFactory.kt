package com.dake.foorballapps.data.source.remote

import com.dake.foorballapps.util.LiveDataCallAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

 
class SportServiceFactory {
    companion object {

        @Volatile
        private var INSTANCE: SportService? = null

        private const val BASE_URL = "https://www.thesportsdb.com/api/v1/json/1/"

        private fun provideOkHttpClient(): OkHttpClient {
            val interceptor = HttpLoggingInterceptor()
            interceptor.level = HttpLoggingInterceptor.Level.BODY

            val client = OkHttpClient.Builder()
            client.addInterceptor(interceptor)
            return client.build()
        }

        fun getService() : SportService {
            return INSTANCE ?: synchronized(this) {
                val instance = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(provideOkHttpClient())
                    .addConverterFactory(MoshiConverterFactory.create())
                    .addCallAdapterFactory(LiveDataCallAdapterFactory())
                    .build()
                    .create(SportService::class.java)
                INSTANCE = instance
                instance
            }
        }


    }
}