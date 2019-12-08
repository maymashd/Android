package com.dake.foorballapps.features.searchteam

import androidx.lifecycle.Observer
import com.dake.foorballapps.features.base.BaseSearchActivity
import com.dake.foorballapps.features.matches.adapter.TeamAdapter
import com.dake.foorballapps.features.teamdetail.TeamDetailActivity
import com.dake.foorballapps.util.obtainViewModel
import com.dake.foorballapps.vo.Resource
import com.dake.foorballapps.vo.Team
import kotlinx.android.synthetic.main.list_items.*

class SearchTeamActivity : BaseSearchActivity<Team>() {

    private lateinit var viewModel: SearchTeamViewModel

    override fun setupAdapter() {
        rv_list.adapter = TeamAdapter(this, Resource.loading(null)) {
            startActivity(TeamDetailActivity.getStartIntent(this, it.idTeam))
        }
    }

    override fun setupData() {
        viewModel = obtainViewModel()
        with (viewModel) {
            submitQuery(sQuery)
            result.observe(this@SearchTeamActivity, Observer { data -> updateData(data) })
        }
    }

    override fun submitQuery(query: String?) {
        viewModel.submitQuery(query)
    }

    override fun updateData(data: Resource<List<Team>>?) {
        if (data == null || rv_list == null) return
        (rv_list.adapter as TeamAdapter).submitData(data)
    }

    private fun obtainViewModel() = obtainViewModel(SearchTeamViewModel::class.java)
}
