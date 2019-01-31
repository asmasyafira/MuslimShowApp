package com.example.safuan.muslimshowapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String nama[] = {
        "Berbagi","Dosa","Harta","Penggosip","Api","Keadaan","Lemah Lembut","Kesabaran","Sepertiga Malam",
            "Kebaikan"
    };
    int gambar[] = {
        R.drawable.satu, R.drawable.dua, R.drawable.tiga, R.drawable.empat, R.drawable.lima,
            R.drawable.enam, R.drawable.tujuh, R.drawable.delapan, R.drawable.sembilan, R.drawable.sepuluh
    };
    int keterangan[] = {
    R.string.ketSatu, R.string.ketDua, R.string.ketTiga, R.string.ketEmpat, R.string.ketLima, R.string.ketEnam,
            R.string.ketTujuh, R.string.ketDelapan, R.string.ketSembilan, R.string.ketSepuluh
    };
    int gambar1[] = {
            R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f,
            R.drawable.g, R.drawable.h, R.drawable.i, R.drawable.j  };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

         AdapterList adapterList = new AdapterList(this, nama, gambar, keterangan, gambar1);
         listView.setAdapter(adapterList);
         listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 Intent q = new Intent(getApplicationContext(), detail.class);
                 q.putExtra("nama", nama[position]);
                 q.putExtra("gambar", gambar[position]);
                 q.putExtra("keterangan", keterangan[position]);
                 startActivity(q);
             }

         });


    }
}
