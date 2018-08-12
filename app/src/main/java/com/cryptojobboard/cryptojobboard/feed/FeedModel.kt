package com.cryptojobboard.cryptojobboard.feed

import com.google.gson.annotations.SerializedName

data class Data(@SerializedName("jobs") val jobs: Array<JobModel>,
                @SerializedName("candidates") val candidates: Array<CandidateModel>)

data class JobModel(@SerializedName("id") val id: String,
                    @SerializedName("type") val type: Int,
                    @SerializedName("image") val image: String,
                    @SerializedName("title") val title: String,
                    @SerializedName("description") val description: String,
                    @SerializedName("compensation") val compensation: Double,
                    @SerializedName("skills") val skills: Array<String>)

data class CandidateModel(@SerializedName("id") val id: String,
                    @SerializedName("type") val type: Int,
                    @SerializedName("image") val image: String,
                    @SerializedName("name") val title: String,
                    @SerializedName("skills") val skills: Array<String>)
