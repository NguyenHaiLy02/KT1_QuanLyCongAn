package com.example.baikt1_quanlycongan;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvCongAn;
    ArrayList<Model> arrayModel;
    Adapter adapter;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        adapter = new Adapter(this,R.layout.item_congan,arrayModel);
        lvCongAn.setAdapter((ListAdapter) adapter);




    }
    private void AnhXa() {
        lvCongAn = (ListView) findViewById(R.id.listview_CongAn);
        arrayModel = new ArrayList<>();
        arrayModel.add(new Model("Nguyễn Văn A","Bậc 1","Quảng Nam","VN","1",R.drawable.congan));
        arrayModel.add(new Model("Nguyễn Văn B","Bậc 2","Quảng Trị","VN","1",R.drawable.congan));
        arrayModel.add(new Model("Nguyễn Văn C","Bậc 3","Quảng Bình","VN","1",R.drawable.congan));
        arrayModel.add(new Model("Nguyễn Văn D","Bậc 4","Quảng Ninh","VN","1",R.drawable.congan));
        arrayModel.add(new Model("Nguyễn Văn E","Bậc 5","Quảng Ninh","VN","1",R.drawable.congan));


    }



}
