package com.example.raraindira.aplikasibuku;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by RAFIKA on 5/21/2015.
 */
public class CustomArrayAdapter extends ArrayAdapter<Book> {
    public CustomArrayAdapter(Context context, ArrayList<Book> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Book user = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_book, parent, false);
        }
        // Lookup view for data population
        TextView judulBuku = (TextView) convertView.findViewById(R.id.judulBuku);
        TextView namaPengarang = (TextView) convertView.findViewById(R.id.namaPengarang);
        TextView jumlahHalaman = (TextView) convertView.findViewById(R.id.jumlahHalaman);
        // Populate the data into the template view using the data object
        judulBuku.setText(user.judulBuku);
        namaPengarang.setText(user.namaPengarang);
        jumlahHalaman.setText(user.jumlahHalaman);
        // Return the completed view to render on screen
        return convertView;
    }
}
