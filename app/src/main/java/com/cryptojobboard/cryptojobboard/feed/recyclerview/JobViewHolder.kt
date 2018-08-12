package com.cryptojobboard.cryptojobboard.feed.recyclerview

import android.support.v7.widget.RecyclerView
import android.view.View
import com.cryptojobboard.cryptojobboard.feed.JobModel
import kotlinx.android.synthetic.main.row_job.view.*
import java.text.DecimalFormat

final class JobViewHolder(view: View): RecyclerView.ViewHolder(view) {

    fun bind(model: JobModel) {
        itemView.tvTitle.text = model.title

        val decimalFormat = DecimalFormat("#,###,##0.00")
        itemView.tvCompensation.text = "$${decimalFormat.format(model.compensation)}"
    }

}