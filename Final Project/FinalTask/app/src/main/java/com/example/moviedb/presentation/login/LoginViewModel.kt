package com.example.moviedb.presentation.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.moviedb.domain.repository.UserRepository
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

class LoginViewModel(private val userRepository: UserRepository) : ViewModel() {

    private val _liveData = MutableLiveData<State>()
    val liveData: LiveData<State>
        get() = _liveData
    //избежать ошибки
    private val job = SupervisorJob()
    private val coroutineContext: CoroutineContext = Dispatchers.Main + job
    private val uiScope: CoroutineScope = CoroutineScope(coroutineContext)


    fun login(username: String, password: String) {
        uiScope.launch {
            // Show State
            _liveData.value = State.ShowLoading
            val result = withContext(Dispatchers.IO) {
                // Создать токен и залогиниться
                userRepository.createToken()
                userRepository.login(username, password)
            }
                // Create Session
            val sessionId: String? = withContext(Dispatchers.Default) {
                    userRepository.createSession().body()?.getAsJsonPrimitive("session_id")?.asString
            }
            // Get Account id
            val accountId: Int? = withContext(Dispatchers.IO) {
                sessionId?.let{userRepository.getAccountDetails(sessionId)?.id}
            }
            //  Скрыть загрузку
            _liveData.value = State.HideLoading
            _liveData.postValue(sessionId?.let{State.ApiResult(result, sessionId, accountId)})
        }
    }

    override fun onCleared(){
        super.onCleared()
        job.cancel()
    }


    // Статус Загрузки
    sealed class State{
        object ShowLoading: State()
        object HideLoading: State()
        data class ApiResult(val success: Boolean, val session_id: String, val account_id: Int?): State()
    }
}



