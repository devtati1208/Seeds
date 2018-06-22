package com.example.c4q.seeds;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.example.c4q.seeds.model.Seeds;
import com.example.c4q.seeds.rv.SeedsAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         button = findViewById(R.id.english_button);

         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent = new Intent(MainActivity.this, SeedsActivity.class);
                 startActivity(intent);
             }
         });

    }
}
