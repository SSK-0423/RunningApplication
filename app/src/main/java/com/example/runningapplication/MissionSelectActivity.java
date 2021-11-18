package com.example.runningapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MissionSelectActivity extends AppCompatActivity {

    private ListView missionList;
    private Button missionStartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission_select);
        initialize();
    }

    private void initialize(){
        //リストビュー設定
        missionList = findViewById(R.id.MissionList);
        String[] missions = {"MISSION:1","MISSION:2","MISSION:3","MISSION:4","MISSION:5","MISSION:6","MISSION:7","MISSION:8","MISSION:9","MISSION:10"};
        ArrayAdapter<String> ad = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,missions);

        missionList.setAdapter(ad);
        missionList.setOnItemClickListener(new MissionClickListener());

        missionStartButton = findViewById(R.id.MissionStartButton);
    }

    class MissionClickListener implements AdapterView.OnItemClickListener{
        public void onItemClick(AdapterView<?> v, View view, int pos, long id){
            Intent intent = new Intent(getApplication(),GameActivity.class);
            startActivity(intent);
        }
    }
}