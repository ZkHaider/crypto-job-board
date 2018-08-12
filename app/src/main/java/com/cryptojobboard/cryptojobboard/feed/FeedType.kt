package com.cryptojobboard.cryptojobboard.feed

sealed class FeedType {
    class Job: FeedType()
    class Candidate: FeedType()
}