package com.example.projecttanggal6;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

public class Tampil_Nama extends AppCompatActivity {
    EditText txtNama;
    CheckBox chk_pasti;
    Button Tampil;
    TextView view_tampil;
    String nama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil__nama);
        txtNama=findViewById(R.id.txt_nama);
        chk_pasti=findViewById(R.id.chk_yakin);
        Tampil=findViewById(R.id.btn_ok);
        view_tampil=findViewById(R.id.txt_hasil);
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

    public void fungsi_tampil(View view) {
        if (chk_pasti.isChecked()==false){
            Toast.makeText(getApplicationContext(), "Mohon centang check box terlebih dahulu",Toast.LENGTH_LONG).show();
        }else{
            if (txtNama.getText().toString().matches("")){
                Toast.makeText(getApplicationContext(), "Mohon isi nama terlebih dahulu",Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(getApplicationContext(), "Berhasil menampilkan nama",Toast.LENGTH_LONG).show();
                nama=txtNama.getText().toString();
                view_tampil.setText(nama);
            }
        }
    }
}