package com.dake.foorballapps.features.matches

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.dake.foorballapps.R
import com.dake.foorballapps.features.matches.adapter.TeamAdapter
import com.dake.foorballapps.features.teamdetail.TeamDetailActivity
import com.dake.foorballapps.vo.Resource
import com.dake.foorballapps.vo.Team
import kotlinx.android.synthetic.main.list_items.*



class FavoritesTeamsFragment : Fragment() {

    private lateinit var viewModel: MatchesViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.list_items, container, false).also {
            viewModel = (activity as MatchesActivity).obtainViewModel()
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        setupList()
        initData()
    }


    private fun setupList() {
        srl_list.isEnabled = false
        rv_list.layoutManager = LinearLayoutManager(context)
        rv_list.adapter = TeamAdapter(context, Resource.loading(null)) {
            startActivity(TeamDetailActivity.getStartIntent(context, it.idTeam))
        }
    }

    private fun initData() {
        viewModel.favoriteTeams.observe(activity as MatchesActivity, Observer { res -> updateData(res) })
    }

    private fun updateData(res: Resource<List<Team>>?) {
        if (rv_list == null || res == null) return
        (rv_list.adapter as TeamAdapter).submitData(res)
    }

    companion object {
        fun newInstance() = FavoritesTeamsFragment()
    }
}