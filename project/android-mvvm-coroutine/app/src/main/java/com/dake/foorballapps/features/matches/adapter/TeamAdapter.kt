package com.dake.foorballapps.features.matches.adapter

import android.animation.AnimatorInflater
import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dake.foorballapps.R
import com.dake.foorballapps.features.base.BaseRVAdapter
import com.dake.foorballapps.vo.Resource
import com.dake.foorballapps.vo.Team
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.iteam_team.view.*



class TeamAdapter(ctx: Context?, resource: Resource<List<Team>>, private val clickListener: (Team) -> Unit)
    : BaseRVAdapter<Team>(ctx, resource) {

    override fun createDataViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return TeamItem(LayoutInflater.from(ctx).inflate(R.layout.iteam_team, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is TeamItem) {
            holder.bind(resource.data?.get(position), clickListener)
        }
    }

    inner class TeamItem(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(nTeam: Team?, clickListener: (Team) -> Unit) {
            nTeam?.let { team ->
                with(itemView) {
                    if (!team.strTeamBadge.isNullOrEmpty()) { Picasso.get().load(team.strTeamBadge).into(iv_club) }
                    tv_club.text = team.strTeam
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        itemView.stateListAnimator =
                                AnimatorInflater.loadStateListAnimator(this.context, R.animator.lift_on_touch)
                    }
                    setOnClickListener {
                        clickListener(team)
                    }
                }
            }
        }
    }
}