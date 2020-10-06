package com.example.projecttanggal6;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class List_View extends AppCompatActivity {
    ListView listkota;
    ArrayList<String> list = new ArrayList<String>();
    Button btntampil;
    EditText txt_kota;
    String nama_kota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list__view);
        btntampil=findViewById(R.id.btn_tampol);
        txt_kota=findViewById(R.id.txt_kota);
        listkota=findViewById(R.id.list_kota);

        list.add("Jember");
        list.add("Malang");
        list.add("Surabaya");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(List_View.this,
                android.R.layout.simple_list_item_1,  list);
        listkota.setAdapter(adapter);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.nama_tampil){
            startActivity(new Intent(this, Tampil_Nama.class));
            finish();
        }else if (item.getItemId()==R.id.list_view){
            startActivity(new Intent(this, List_View.class));
            finish();
        }else if (item.getItemId()==R.id.kalkulator){
            startActivity(new Intent(this, Kalkulator.class));
            finish();
        }
        return true;
    }

    public void tampilin_kota(View view) {
        if (txt_kota.getText().toString().matches("")){
            Toast.makeText(getApplicationContext(), "Mohon isi nama kota terlebih dahulu",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getApplicationContext(), "Berhasil menambahkan kota",Toast.LENGTH_LONG).show();
            nama_kota=txt_kota.getText().toString();
            list.add(nama_kota);
            listkota.invalidateViews();

        }
    }
}