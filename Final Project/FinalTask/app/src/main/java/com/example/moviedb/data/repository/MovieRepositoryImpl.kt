package com.example.moviedb.data.repository

import com.example.moviedb.data.models.MovieData
import com.example.moviedb.data.models.MovieResponseData
import com.example.moviedb.data.network.MovieApi
import com.example.moviedb.domain.repository.MovieRepository
import com.google.gson.JsonObject

class MovieRepositoryImpl(private val movieApi: MovieApi) : MovieRepository {

    //Popular films
    override suspend fun getPopularMovies(page: Int) =
        movieApi.getPopularMovies(page).await().body()

    // My Favouritve films
    override suspend fun getFavoriteMovies( accountId: Int, sessionId: String, page: Int
    ): MovieResponseData? =
        movieApi.getFavoriteMovies(accountId, sessionId, page).await().body()


    // Specific film by id
    override suspend fun getMovieById(movieId: Int): MovieData? =
        movieApi.getMovie(movieId).await().body()

    // оценить фильм
    override suspend fun rateMovie(movieId: Int, accountId: Int, sessionId: String, favorite: Boolean): Int? {
        val body = JsonObject().apply {
            addProperty("media_type", "movie")
            addProperty("media_id", movieId)
            addProperty("favorite", favorite)
        }
        val response = movieApi.rateMovie(accountId, sessionId, body).await()
        return response.body()?.getAsJsonPrimitive("status_code")?.asInt
    }

   // узнать статус фильма
    override suspend fun getState(movieId: Int, accountId: Int, sessionId: String, favoriteState: Boolean): Int? {
        val body = JsonObject().apply {
            addProperty("media_type", "movie")
            addProperty("media_id", movieId)
            addProperty("favorite", favoriteState)
        }
        val response = movieApi.rateMovie(accountId, sessionId, body).await()
        return response.body()?.getAsJsonPrimitive("status_code")?.asInt
    }
}