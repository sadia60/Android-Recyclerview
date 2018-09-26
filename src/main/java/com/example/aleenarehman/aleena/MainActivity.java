package com.example.aleenarehman.aleena;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridLayout;
import android.widget.GridView;
import java.util.ArrayList;
import android.support.v7.widget.GridLayoutManager;
import static android.widget.GridLayout.VERTICAL;

public class MainActivity extends AppCompatActivity {
    MyAdapter flagAdapter;
    private RecyclerView countryList;
    ArrayList<Flag> flagList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countryList = (RecyclerView) findViewById(R.id.simpleGridView);


        flagList.add(new Flag("Afghanistan",R.drawable.af,"af"));
        flagList.add(new Flag("Albania",R.drawable.al,"al"));
        flagList.add(new Flag("Algeria",R.drawable.dz,"dz"));
        flagList.add(new Flag("Andorra",R.drawable.ad,"ad"));
        flagList.add(new Flag("Australia",R.drawable.au,"au"));
        flagList.add(new Flag("Austria",R.drawable.at,"at"));
        flagList.add(new Flag("Bahamas",R.drawable.bs,"bs"));
        flagList.add(new Flag("Bahrain",R.drawable.bh,"bh"));
        flagList.add(new Flag("Bangladesh",R.drawable.bd,"bd"));
        flagList.add(new Flag("Belarus",R.drawable.by,"by"));
        flagList.add(new Flag("Belgium",R.drawable.be,"be"));
        flagList.add(new Flag("Brazil",R.drawable.br,"br"));
        flagList.add(new Flag("Burundi",R.drawable.bi,"bi"));
        flagList.add(new Flag("Canada",R.drawable.ca,"ca"));
        flagList.add(new Flag("Chile",R.drawable.cl,"cl"));
        flagList.add(new Flag("China",R.drawable.cn,"cn"));
        flagList.add(new Flag("Congo",R.drawable.cg,"cg"));
        flagList.add(new Flag("India",R.drawable.in,"in"));
        flagList.add(new Flag("Ireland",R.drawable.ie,"ie"));
        flagList.add(new Flag("Jamaica",R.drawable.jm,"jm"));
        flagList.add(new Flag("Japan",R.drawable.jp,"jp"));
        flagList.add(new Flag("Jordon",R.drawable.jo,"jo"));
        flagList.add(new Flag("Burundi",R.drawable.bi,"bi"));
        flagList.add(new Flag("Kenya",R.drawable.ke,"ke"));
        flagList.add(new Flag("Luxembourg",R.drawable.lu,"lu"));
        flagList.add(new Flag("Pakistan",R.drawable.pk,"pk"));
        flagList.add(new Flag("Turkey",R.drawable.tr,"tr"));
        flagList.add(new Flag("UnitedKingdom",R.drawable.gb,"gb"));
        flagList.add(new Flag("UnitedStates",R.drawable.us,"us"));

        flagAdapter=new MyAdapter(flagList,this);
        countryList.setAdapter(flagAdapter);
        countryList.setLayoutManager(new GridLayoutManager(countryList.getContext(),4,VERTICAL,false));
    }



}