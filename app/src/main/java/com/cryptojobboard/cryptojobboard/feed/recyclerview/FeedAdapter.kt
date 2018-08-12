package com.cryptojobboard.cryptojobboard.feed.recyclerview

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.cryptojobboard.cryptojobboard.R
import com.cryptojobboard.cryptojobboard.feed.Data
import com.cryptojobboard.cryptojobboard.feed.FeedType

final class FeedAdapter(private val data: Data, private val context: Context, private val feedType: FeedType): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val viewTypeFeed: Int = 0

    override fun getItemCount(): Int {
        return when (feedType) {
            is FeedType.Job -> data.jobs.size
            is FeedType.Candidate -> data.candidates.size
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            viewTypeFeed -> {
                val view = LayoutInflater.from(context).inflate(R.layout.row_feed, parent, false)
                FeedViewHolder(view)
            }
            else -> {
                val view = LayoutInflater.from(context).inflate(R.layout.row_feed, parent, false)
                FeedViewHolder(view)
            }
        }

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val feedViewHolder: FeedViewHolder = holder as FeedViewHolder

    }
}