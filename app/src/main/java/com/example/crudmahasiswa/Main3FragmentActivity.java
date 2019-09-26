package com.example.crudmahasiswa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.crudmahasiswa.R;

public class Main3FragmentActivity extends AppCompatActivity
        implements com.example.crudmahasiswa.ProteinFragment.SendMessage{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3_fragment);

        Button btnPress = findViewById(R.id.buttonTesFragment);
        btnPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                com.example.crudmahasiswa.ProteinFragment proteinFragment = com.example.crudmahasiswa.ProteinFragment.newInstance("Hai", "ParaProgmobers");
                ft.replace(R.id.FrameMain, proteinFragment);
                ft.commit();
            }
        });
    }

    @Override
    public void SendData(String Message) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        com.example.crudmahasiswa.ProteinFragment protein2Fragment = com.example.crudmahasiswa.ProteinFragment.newInstance(Message, "ParaProgmobers");
        ft.replace(R.id.FrameMain, protein2Fragment);
        ft.commit();
    }
}
