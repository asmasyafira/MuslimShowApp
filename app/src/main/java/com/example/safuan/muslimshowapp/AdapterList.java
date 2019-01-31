package com.example.safuan.muslimshowapp;


import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterList extends ArrayAdapter {
    private final Activity activity;
    private final String[] nama;
    private final int[] gambar;
    private final int[] keterangan;
    private final int[] gambar1;

    public AdapterList(Activity activity, String[] nama, int[] gambar, int[] keterangan, int[] gambar1) {
        super(activity, R.layout.activity_list_item,nama);
        this.activity = activity;
        this.nama = nama;
        this.gambar = gambar;
        this.keterangan = keterangan;
        this.gambar1 = gambar1;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.activity_list_item,null,true);
        TextView txt = view.findViewById(R.id.textItem);
        ImageView img = view.findViewById(R.id.imgItem);

        txt.setText(nama[position]);
        img.setImageResource(gambar1[position]);

        return view;
    }
}
