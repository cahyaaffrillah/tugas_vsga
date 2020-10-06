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
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Kalkulator extends AppCompatActivity {
    EditText txtangka1,txtangka2;
    Button btn_kali,btn_minus,btn_bagi,btn_plus;
    int angka1,angka2;
    int minus,bagi,kali,plus;
    TextView hasilnya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtangka1=findViewById(R.id.txt_angka1);
        txtangka2=findViewById(R.id.txt_angka2);
        btn_kali=findViewById(R.id.btnKali);
        btn_bagi=findViewById(R.id.btnBagi);
        btn_minus=findViewById(R.id.btnMinus);
        btn_plus=findViewById(R.id.btnPlus);
        hasilnya=findViewById(R.id.txt_hasil);
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

    public void minus(View view) {
        if (txtangka1.getText().toString().matches("")||txtangka2.getText().toString().matches("")){
            Toast.makeText(getApplicationContext(), "Masukkan Angka dengan benar",Toast.LENGTH_LONG).show();
        }else{
            angka1=Integer.parseInt(txtangka1.getText().toString());
            angka2=Integer.parseInt(txtangka2.getText().toString());
            minus = angka1-angka2;
            hasilnya.setText(String.valueOf(minus));
        }

    }

    public void perkalian(View view) {
        if (txtangka1.getText().toString().matches("")||txtangka2.getText().toString().matches("")){
            Toast.makeText(getApplicationContext(), "Masukkan Angka dengan benar",Toast.LENGTH_LONG).show();
        }else{
            angka1=Integer.parseInt(txtangka1.getText().toString());
            angka2=Integer.parseInt(txtangka2.getText().toString());
            kali = angka1*angka2;
            hasilnya.setText(String.valueOf(kali));
        }

    }

    public void pertambahan(View view) {
        if (txtangka1.getText().toString().matches("")||txtangka2.getText().toString().matches("")){
            Toast.makeText(getApplicationContext(), "Masukkan Angka dengan benar",Toast.LENGTH_LONG).show();
        }else{
            angka1=Integer.parseInt(txtangka1.getText().toString());
            angka2=Integer.parseInt(txtangka2.getText().toString());
            plus = angka1+angka2;
            hasilnya.setText(String.valueOf(plus));
        }

    }

    public void pembagian(View view) {
        if (txtangka1.getText().toString().matches("")||txtangka2.getText().toString().matches("")){
            Toast.makeText(getApplicationContext(), "Masukkan Angka dengan benar",Toast.LENGTH_LONG).show();
        }else{
            angka1=Integer.parseInt(txtangka1.getText().toString());
            angka2=Integer.parseInt(txtangka2.getText().toString());
            bagi = angka1/angka2;
            hasilnya.setText(String.valueOf(bagi));
        }

    }

    public void pembersihan(View view) {
        txtangka1.setText("");
        txtangka2.setText("");
        hasilnya.setText("0");
    }
}