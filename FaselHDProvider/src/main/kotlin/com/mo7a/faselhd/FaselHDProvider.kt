package com.mo7a.faselhd

import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.SearchResponse
import com.lagradost.cloudstream3.TvType

/**
 * Initial provider scaffold.
 *
 * Search and loadEpisodes are intentionally not implemented yet. The live site's
 * page structure and permitted playback endpoints must be inspected before adding
 * site-specific parsing. This avoids publishing a plugin that guesses selectors
 * or invents stream URLs.
 */
class FaselHDProvider : MainAPI() {
    override var mainUrl = "https://www.fasel-hd.co"
    override var name = "MO7A Fasel-HD"
    override var lang = "ar"
    override val supportedTypes = setOf(TvType.Movie, TvType.TvSeries)
    override val hasMainPage = false

    override suspend fun search(query: String): List<SearchResponse> = emptyList()
}
