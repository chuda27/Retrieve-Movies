package com.example.choirulhuda.tesandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txtTitle;
    private TextView txtSubtitle;
    private TextView txtMinutes;
    private TextView txtStatus;
    private TextView txtGenre;
    private TextView txtOverview;
    private TextView txtCategory;
    private TextView txtRating;
    private TextView txtReleaseDate;
    private TextView txtProdCompany;
    private TextView txtProdCountries;
    private ImageView bakcground;
    private ImageView profile;
    private RatingBar ratBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        double rating = 0;

        txtTitle = (TextView) findViewById(R.id.txt_title);
        txtMinutes = (TextView) findViewById(R.id.txt_minutes);
        txtCategory = (TextView) findViewById(R.id.txt_category);
        txtRating = (TextView) findViewById(R.id.txt_rating_number);
        txtReleaseDate = (TextView)findViewById(R.id.txt_release_date);
        txtProdCompany = (TextView) findViewById(R.id.txt_prod_company);
        txtProdCountries = (TextView) findViewById(R.id.txt_prod_countries);
        bakcground = (ImageView) findViewById(R.id.img_background);
        profile = (ImageView) findViewById(R.id.img_profile);
        txtOverview = (TextView) findViewById(R.id.txt_overview);
        ratBar = (RatingBar) findViewById(R.id.ratbar_film);

        Intent intent = getIntent();
        if (intent != null){
            txtTitle.setText(intent.getStringExtra("title"));
            txtMinutes.setText(intent.getStringExtra("minutes"));
            txtCategory.setText(intent.getStringExtra("category"));
            txtRating.setText(intent.getStringExtra("rating"));
            txtReleaseDate.setText(intent.getStringExtra("releaseDate"));
            txtProdCompany.setText(intent.getStringExtra("prodCompany"));
            txtProdCountries.setText(intent.getStringExtra("prodCountries"));
            txtOverview.setText(intent.getStringExtra("overview"));
            bakcground.setImageResource(intent.getIntExtra("background", 123));
            profile.setImageResource(intent.getIntExtra("profile", 123));
            ratBar.setRating((float)intent.getDoubleExtra("rating", 4.0));
        } else {
            Toast.makeText(this, "Data empty", Toast.LENGTH_SHORT).show();
        }
    }
}
