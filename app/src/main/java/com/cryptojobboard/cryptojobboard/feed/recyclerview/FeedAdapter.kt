package com.cryptojobboard.cryptojobboard.feed.recyclerview

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.cryptojobboard.cryptojobboard.R
import com.cryptojobboard.cryptojobboard.feed.Data
import com.cryptojobboard.cryptojobboard.feed.FeedType

final class FeedAdapter(private val data: Data, private val context: Context, private val feedType: FeedType): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int {
        return when (feedType) {
            is FeedType.Job -> data.jobs.size
            is FeedType.Candidate -> data.candidates.size
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (feedType) {
            is FeedType.Job -> {
                val view = LayoutInflater.from(context).inflate(R.layout.row_feed, parent, false)
                JobViewHolder(view)
            }
            is FeedType.Candidate -> {
                val view = LayoutInflater.from(context).inflate(R.layout.row_feed, parent, false)
                CandidateViewHolder(view)
            }
        }

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (feedType) {
            is FeedType.Job -> {

                // Check if its the lat position if so just return our padding view

                // Cast and bind
                val jobViewHolder = holder as JobViewHolder

                // Get data model
                val jobModel = data.jobs[position]

                // Bind
                jobViewHolder.bind(jobModel)

            }
            is FeedType.Candidate -> {

                // Cast and bind
                val candidateViewHolder = holder as CandidateViewHolder

                // Get data model
                val candidateModel = data.candidates[position];

                // Bind
                candidateViewHolder.bind(candidateModel)
            }
        }
    }
}