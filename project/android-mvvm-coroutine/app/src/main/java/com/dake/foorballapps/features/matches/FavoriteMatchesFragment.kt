package com.dake.foorballapps.features.matches

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.dake.foorballapps.R
import com.dake.foorballapps.features.matchdetail.MatchDetailActivity
import com.dake.foorballapps.features.matches.adapter.MatchesAdapter
import com.dake.foorballapps.vo.Match
import com.dake.foorballapps.vo.Resource
import kotlinx.android.synthetic.main.list_items.*



class FavoriteMatchesFragment : Fragment() {

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

    private fun initData() {
        viewModel.favoriteMatches.observe(activity as MatchesActivity, Observer { res ->
            updateData(res)
        })
    }

    private fun updateData(res: Resource<List<Match>>?) {
        if (rv_list == null || res == null) return
        (rv_list.adapter as MatchesAdapter).submitData(res)
    }

    companion object {
        fun newInstance() = FavoriteMatchesFragment()
    }

    private fun setupList() {
        srl_list.isEnabled = false
        rv_list.layoutManager = LinearLayoutManager(context)
        rv_list.adapter = MatchesAdapter(context, Resource.loading(null)) {
            context?.startActivity(
                MatchDetailActivity.getStartIntent(context, it.idEvent, it.idHomeTeam, it.idAwayTeam)
            )
        }
    }


}