package com.example.crudmahasiswa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.crudmahasiswa.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_mhs);

        Button btnPress = findViewById(R.id.btnMahasiswa);
        btnPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.frameMain1, new com.example.crudmahasiswa.Mahasiswa1Fragment());
                ft.commit();
            }
        });

//        Button btnPress2 = findViewById(R.id.btnSimpan);
//        btnPress2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//                ft.replace(R.id.frameMain2, new Mahasiswa2Fragment());
//                ft.commit();
//            }
//        });
    }

    public void ToFragment(View view) {
        Intent intent = new Intent(MainActivity.this, com.example.crudmahasiswa.Main3FragmentActivity.class);
        startActivity(intent);
    }

    public void ToList(View view) {
        Intent intent = new Intent(MainActivity.this, com.example.crudmahasiswa.ListActivity.class);
        startActivity(intent);
    }

    public void GotoListMahasiswa(View view) {
        Intent intent = new Intent(MainActivity.this, com.example.crudmahasiswa.ListMahasiswaActivity.class);
        startActivity(intent);
    }
}
