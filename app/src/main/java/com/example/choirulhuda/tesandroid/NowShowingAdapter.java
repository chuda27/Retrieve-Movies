package com.example.choirulhuda.tesandroid;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

/**
 * Created by choirul.huda on 8/9/2017.
 */

public class NowShowingAdapter extends RecyclerView.Adapter<NowShowingAdapter.NowShowingHolder>{

    private Context context;
    private List<Movie> movieList;

    public NowShowingAdapter(Context context, List<Movie> movieList) {
        this.context = context;
        this.movieList = movieList;
    }

    @Override
    public NowShowingHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_now_showing, null);
        NowShowingHolder nowShowingHolder = new NowShowingHolder(rootView);
        return nowShowingHolder;
    }

    @Override
    public void onBindViewHolder(NowShowingHolder holder, int position) {
        final Movie currentData = movieList.get(position);

        holder.txtTitle.setText(currentData.getTitle());
        holder.txtMinutes.setText(currentData.getMinutes()+" "+currentData.getCategory());
        holder.imgBackground.setImageResource(currentData.getBackground());
        holder.imgBackground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MainActivity.class);
                intent.putExtra("title", currentData.getTitle());
                intent.putExtra("subtitle", currentData.getSubtitle());
                intent.putExtra("minutes", currentData.getMinutes());
                intent.putExtra("status", currentData.getStatus());
                intent.putExtra("genre", currentData.getGenre());
                intent.putExtra("category", currentData.getCategory());
                intent.putExtra("rating", String.valueOf(currentData.getRating()));
                intent.putExtra("releaseDate", currentData.getReleaseDate());
                intent.putExtra("overview", currentData.getOverview());
                intent.putExtra("prodCompany", currentData.getProdCompany());
                intent.putExtra("prodCountries", currentData.getProdCountries());
                intent.putExtra("background", String.valueOf(currentData.getBackground()));
                intent.putExtra("profile", String.valueOf(currentData.getProfile()));

                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    class NowShowingHolder extends RecyclerView.ViewHolder {
        private TextView txtTitle;
        private TextView txtMinutes;
        private TextView txtGenre;
        private RatingBar ratbarMovie;
        private ImageView imgBackground;

        public NowShowingHolder(View itemView) {
            super(itemView);
            txtTitle = (TextView) itemView.findViewById(R.id.txt_title);
            txtMinutes = (TextView) itemView.findViewById(R.id.txt_minutes);
            ratbarMovie = (RatingBar) itemView.findViewById(R.id.ratingBar_cardview);
            imgBackground = (ImageView) itemView.findViewById(R.id.img_background_cardview);
        }
    }
}
