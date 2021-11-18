package com.example.runningapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class TitleSceneActivity extends AppCompatActivity {

    private Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_scene);

        initialize();
    }

    //初期化
    private void initialize(){
        //ボタン設定
        startButton = this.findViewById(R.id.AppStartButton);
        startButton.setOnClickListener(new StartButtonClickListener());
    }

    class StartButtonClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view){
            Intent intent = new Intent(getApplication(),MissionSelectActivity.class);
            startActivity(intent);
        }
    }

}