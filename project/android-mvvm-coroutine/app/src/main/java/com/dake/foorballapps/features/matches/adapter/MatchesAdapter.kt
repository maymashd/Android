package com.dake.foorballapps.features.matches.adapter

import android.animation.AnimatorInflater
import android.content.Context
import android.content.Intent
import android.os.Build
import android.provider.CalendarContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dake.foorballapps.R
import com.dake.foorballapps.features.base.BaseRVAdapter
import com.dake.foorballapps.features.matches.MatchesListFragment
import com.dake.foorballapps.vo.Match
import com.dake.foorballapps.vo.Resource
import kotlinx.android.synthetic.main.item_match.view.*



class MatchesAdapter(ctx: Context?, resource: Resource<List<Match>>, private val clickListener: (Match) -> Unit) :
    BaseRVAdapter<Match>(ctx, resource) {

    override var errorMessage = "Failed to load events!"



    inner class MatchItem(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(nMatch: Match?, clickListener: (Match) -> Unit) {
            nMatch?.let { match ->
                with(itemView) {
                    tv_hour.text = match.getHour()
                    tv_date.text = match.getDate()
                    tv_club1.text = match.strHomeTeam
                    tv_score1.text = match.intHomeScore
                    tv_club2.text = match.strAwayTeam
                    tv_score2.text = match.intAwayScore
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        itemView.stateListAnimator =
                                AnimatorInflater.loadStateListAnimator(this.context, R.animator.lift_on_touch)
                    }
                    if (match.matchType == MatchesListFragment.TYPE_NEXT_MATCH) {
                        iv_notification.visibility = View.VISIBLE
                        iv_notification.setOnClickListener {
                            ctx?.startActivity(Intent(Intent.ACTION_INSERT).apply {
                                data = CalendarContract.Events.CONTENT_URI
                                putExtra(CalendarContract.Events.TITLE, "${match.strHomeTeam} vs ${match.strAwayTeam}")
                                putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, match.getStartTime())
                            })
                        }
                    }
                    setOnClickListener {
                        clickListener(match)
                    }
                }
            }
        }
    }
    override fun createDataViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return MatchItem(LayoutInflater.from(parent.context).inflate(R.layout.item_match, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MatchItem) {
            holder.bind(resource.data?.get(position), clickListener)
        }
    }
}
