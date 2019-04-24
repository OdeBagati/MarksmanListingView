package com.example.listingview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailListActivity extends AppCompatActivity {

    TextView txtName, des;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list);

        txtName= findViewById(R.id.detail_list);
        des=findViewById(R.id.deskripsi);
        image=findViewById(R.id.gambar);

        Intent i = getIntent();

        String name= i.getStringExtra("name");
        String deskrip= i.getStringExtra("deskrip");
        String gambar = i.getStringExtra("gambar");

        txtName.setText(name);
        des.setText(deskrip);
        Glide.with(this)
                .load(gambar)
                .apply(new RequestOptions())
                .into(image);

    }
}
