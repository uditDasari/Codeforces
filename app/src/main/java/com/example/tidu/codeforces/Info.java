package com.example.tidu.codeforces;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.mikhaellopez.circularimageview.CircularImageView;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import de.hdodenhof.circleimageview.CircleImageView;

public class Info extends AppCompatActivity {
CircleImageView imageView;
TextView handle;
TextView rating;
TextView maxRating;
TextView country;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Intent i = getIntent();
        imageView= findViewById(R.id.profile_image);
        handle = findViewById(R.id.handle);
        rating = findViewById(R.id.rating);
        maxRating = findViewById(R.id.highestRating);
        country = findViewById(R.id.country);
        Picasso.with(this).load(i.getStringExtra("DP")).into(imageView);
        handle.setText(i.getStringExtra("H"));
        rating.setText(i.getStringExtra("R"));
        maxRating.setText(i.getStringExtra("MR"));
        country.setText(i.getStringExtra("C"));

    }
}
