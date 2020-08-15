package com.Project.kidsy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class CartoonDetails extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartoon_details);

        imageView=(ImageView) findViewById(R.id.image_view);


        getSupportActionBar().setTitle("View Story");

        Intent in=getIntent();
        int i=in.getExtras().getInt("id");
        ImageAdapter imageAdapter=new ImageAdapter(this);

        imageView.setImageResource(imageAdapter.imageArray[i]);
    }
}