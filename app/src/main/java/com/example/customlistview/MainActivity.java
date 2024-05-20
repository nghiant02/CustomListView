package com.example.customlistview;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvTraiCay;
    ArrayList<TraiCay> arrayTraiCay;
    TraiCayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        adapter = new TraiCayAdapter(this, R.layout.dong_trai_cay, arrayTraiCay);
        lvTraiCay.setAdapter(adapter);
    }

    private void AnhXa() {
        lvTraiCay = findViewById(R.id.listviewTraiCay);
        arrayTraiCay = new ArrayList<>();
        arrayTraiCay.add(new TraiCay("Chuoi tieu", "Chuoi tieu Long An", R.drawable.ic_launcher_background));
        arrayTraiCay.add(new TraiCay("Thanh Long", "Thanh long ruot do", R.drawable.ic_launcher_foreground));
    }
}
