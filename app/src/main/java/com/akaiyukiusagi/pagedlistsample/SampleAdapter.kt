package com.akaiyukiusagi.pagedlistsample

import androidx.paging.PagedListAdapter

class SampleAdapter() : PagedListAdapter<Concert, ConcertViewHolder>(DIFF_CALLBACK) {

    override fun onBindViewHolder(holder: ConcertViewHolder, position: Int) {
        val concert: Concert? = getItem(position)

        // Note that "concert" is a placeholder if it's null.
        holder.bindTo(concert)
    }

    companion object {
        private val DIFF_CALLBACK = ... // See Implement the diffing callback section.
    }
}