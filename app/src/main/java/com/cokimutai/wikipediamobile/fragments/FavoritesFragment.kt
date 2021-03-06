package com.cokimutai.wikipediamobile.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.cokimutai.wikipediamobile.R
import com.cokimutai.wikipediamobile.adapters.ArticleCardRecyclerAdapter
import com.cokimutai.wikipediamobile.adapters.ArticleListItemRecyclerAdapter
import kotlinx.android.synthetic.main.fragment_favorites.*

/**
 * A simple [Fragment] subclass.
 */
class FavoritesFragment : Fragment() {

    var favorites_frg_recycler: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_favorites, container, false)

        favorites_frg_recycler = view.findViewById<RecyclerView>(R.id.favorites_frg_recycler)
        favorites_frg_recycler!!.layoutManager = LinearLayoutManager(context)
        favorites_frg_recycler!!.adapter = ArticleCardRecyclerAdapter()

        return view
    }


}
