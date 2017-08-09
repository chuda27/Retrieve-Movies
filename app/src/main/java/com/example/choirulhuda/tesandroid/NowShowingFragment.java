package com.example.choirulhuda.tesandroid;


import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class NowShowingFragment extends Fragment {
    private RecyclerView recyclerView;
    private NowShowingAdapter nowShowingAdapter;

    public NowShowingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_now_showing, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recview_now_showing);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        nowShowingAdapter = new NowShowingAdapter(getActivity(), getAllMovie());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(nowShowingAdapter);
        return rootView;
    }

    public List<Movie> getAllMovie() {
        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Wonder Woman", "", "141 mins,", "Release", "Family, Fantasy, Romance", "Contains Violence", 6.8, "2017-08-23",
                "Loren Ipsum", "Walt Disney Pictures", "England", R.drawable.pic_wonderwoman_bgd, R.drawable.pic_wonderwoman_profile));
        movieList.add(new Movie("Cars 3", "", "", "Release", "Family, Fantasy, Romance", "Subtitle for all ages", 6.8, "2017-08-23",
                "Loren Ipsum", "Walt Disney Pictures", "England", R.drawable.pic_wonderwoman_bgd, R.drawable.pic_wonderwoman_profile));
        movieList.add(new Movie("Transformer : The Last Knight", "", "141 mins", "Release", "Family, Fantasy, Romance", "Contains Violence and offense language", 6.8, "2017-08-23",
                "Loren Ipsum", "Walt Disney Pictures", "England", R.drawable.transformer_bgd, R.drawable.transformer_profile));
        movieList.add(new Movie("Wonder Woman", "", "", "Release", "Family, Fantasy, Romance", "Contains Supranatural theme", 6.8, "2017-08-23",
                "Loren Ipsum", "Walt Disney Pictures", "England", R.drawable.the_mummy_bgd, R.drawable.the_mummy_profile));

        return movieList;
    }

}
