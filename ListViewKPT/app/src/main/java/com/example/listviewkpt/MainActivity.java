package com.example.listviewkpt;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvTraiCay;
    ArrayList<TraiCay> traiCayArrayList;
    TraiCayApdater traiCayApdater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        AnhXa();
        traiCayApdater = new TraiCayApdater(this,R.layout.dong_trai_cay,traiCayArrayList);
        lvTraiCay.setAdapter(traiCayApdater);
    }

    private void AnhXa() {
        lvTraiCay = findViewById(R.id.listViewTraiCay);
        traiCayArrayList = new ArrayList<>();

        traiCayArrayList.add(new TraiCay("Cam","Cam Quỳ Hợp",R.drawable.cam));
        traiCayArrayList.add(new TraiCay("Chuối", "Chuối vàng",R.drawable.chuoi));
        traiCayArrayList.add(new TraiCay("Dâu","Dâu Tây Hải Phòng",R.drawable.dau));
        traiCayArrayList.add(new TraiCay("Dưa hấu", "Dưa hấu tươi ngon",R.drawable.dua_hau));
        traiCayArrayList.add(new TraiCay("Đu đủ","Đủ đủ chín",R.drawable.du_du));


    }
}












