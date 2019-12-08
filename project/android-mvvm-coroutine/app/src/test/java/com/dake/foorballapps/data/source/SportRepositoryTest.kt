package com.dake.foorballapps.data.source

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.dake.foorballapps.data.source.local.SportDao
import com.dake.foorballapps.data.source.local.SportDb
import com.dake.foorballapps.data.source.remote.SportService
import com.dake.foorballapps.util.ApiUtil.successScheduleCall
import com.dake.foorballapps.util.TestContextProvider
import com.dake.foorballapps.util.TestUtil
import com.dake.foorballapps.util.mock
import com.dake.foorballapps.vo.Match
import com.dake.foorballapps.vo.Resource
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.ArgumentMatchers.any
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.MockitoAnnotations



@RunWith(JUnit4::class)
class SportRepositoryTest {

    @Rule
    @JvmField
    val instantExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var dao: SportDao
    @Mock
    private lateinit var service: SportService
    private lateinit var repository: SportRepository

    private val testMatchId = "576558"

    @Before
    fun init() {
        MockitoAnnotations.initMocks(this)

        val db = mock(SportDb::class.java)
        `when`(db.sportDao()).thenReturn(dao)
        `when`(db.runInTransaction(any())).thenCallRealMethod()

        repository = SportRepository(db, dao, service, TestContextProvider())
    }

    @Test
    fun loadMatchDetail() {
        val dbData = MutableLiveData<Match>()
        `when`(dao.getMatchDetail(testMatchId)).thenReturn(dbData)

        val match = TestUtil.createMatchDetailRes(testMatchId)
        val call = successScheduleCall(match)
        `when`(service.getMatchDetail(testMatchId)).thenReturn(call)

        val data = repository.getEventDetail(testMatchId)
        verify(dao).getMatchDetail(testMatchId)
        verifyNoMoreInteractions(service)

        val obs = mock<Observer<Resource<Match>>>()
        data.observeForever(obs)
        verifyNoMoreInteractions(service)
        verify(obs).onChanged(Resource.loading(null))

        val updateDbData = MutableLiveData<Match>()
        `when`(dao.getMatchDetail(testMatchId)).thenReturn(updateDbData)

        dbData.postValue(null)
        verify(service).getMatchDetail(testMatchId)
        verify(dao).saveMatches(match.events!!)

        updateDbData.postValue(match.events!![0])
        verify(obs).onChanged(Resource.success(match.events!![0]))
    }

}