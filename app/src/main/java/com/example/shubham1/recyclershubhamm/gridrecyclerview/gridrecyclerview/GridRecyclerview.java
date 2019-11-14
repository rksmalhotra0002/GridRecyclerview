package com.example.shubham1.recyclershubhamm.gridrecyclerview.gridrecyclerview;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Bundle;

import com.example.shubham1.recyclershubhamm.R;
import com.example.shubham1.recyclershubhamm.gridrecyclerview.adapter.MyAdapter;
import com.example.shubham1.recyclershubhamm.gridrecyclerview.model.Model;

import java.util.ArrayList;

public class GridRecyclerview extends AppCompatActivity {
private AlertDialog.Builder builder;
private RecyclerView recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
          getids();
    }
    private void getids()
    {
        recyclerview=(RecyclerView)findViewById(R.id.recyclerview);
      builder=new AlertDialog.Builder(this);
        ArrayList<Model>a=new ArrayList<>();
        a.add(new Model("shubham",R.drawable.downloa));
        a.add(new Model("raman",R.drawable.downloa));
        a.add(new Model("arshdeep",R.drawable.downloa));
        a.add(new Model("arjun",R.drawable.downloa));
        a.add(new Model("shubham",R.drawable.downloa));
        a.add(new Model("harshdeep",R.drawable.download));
        a.add(new Model("ramandeep",R.drawable.download));
        a.add(new Model("karan",R.drawable.download));
        a.add(new Model("karan",R.drawable.download));
        a.add(new Model("karan",R.drawable.download));

        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        gridLayoutManager.setOrientation(GridLayoutManager.VERTICAL);
        MyAdapter adapter=new MyAdapter(a,this);
        recyclerview.setHasFixedSize(true);
        recyclerview.setLayoutManager(gridLayoutManager);
        recyclerview.setAdapter(adapter);
    }

    @Override
    public void onBackPressed() {
        builder.setMessage("Do you want to close this Application ?")
                .setCancelable(false)
        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        })
          .setNegativeButton("No", new DialogInterface.OnClickListener() {
              @Override
              public void onClick(DialogInterface dialog, int which) {
                  dialog.cancel();
              }
          });

  AlertDialog alertDialog=builder.create();
  alertDialog.setTitle("GridRecyclerview");
  alertDialog.show();
    }
}