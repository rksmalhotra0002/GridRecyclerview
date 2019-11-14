package com.example.shubham1.recyclershubhamm.gridrecyclerview.grids;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shubham1.recyclershubhamm.R;

public class Grids extends AppCompatActivity {
private ImageView iv_placedimage;
private TextView txt;
String name;
int image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grids);
        getids();
    }
    private void getids()
    {
        iv_placedimage=(ImageView)findViewById(R.id.iv_placedimage);
        txt=(TextView)findViewById(R.id.txt);
        name=getIntent().getStringExtra("text");
        image=getIntent().getIntExtra("images",0);
        iv_placedimage.setImageResource(image);
        txt.setText(name);
    }
}
