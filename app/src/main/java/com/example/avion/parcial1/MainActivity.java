package com.example.avion.parcial1;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //This rounds the image
        ImageView imageView = (ImageView) findViewById(R.id.profile);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.profilepic);
        RoundedBitmapDrawable roundedBitmapDrawable = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        roundedBitmapDrawable.setCircular(true);
        imageView.setImageDrawable(roundedBitmapDrawable);
        }

    public void SummaryClick(View view){
        Intent summary = new Intent(this,SummaryActivity.class);
        startActivity(summary);
    }
    public void AccountsClick(View view){
        Intent accounts = new Intent(this,SummaryActivity.class);
        startActivity(accounts);
    }
}
