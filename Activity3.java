package com.example.ferey.myapplication38;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.nightonke.boommenu.BoomButtons.ButtonPlaceEnum;
import com.nightonke.boommenu.BoomButtons.HamButton;
import com.nightonke.boommenu.BoomButtons.OnBMClickListener;
import com.nightonke.boommenu.BoomButtons.SimpleCircleButton;
import com.nightonke.boommenu.BoomMenuButton;
import com.nightonke.boommenu.ButtonEnum;
import com.nightonke.boommenu.Piece.PiecePlaceEnum;

public class Activity3 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);


       BoomMenuButton bmb = (BoomMenuButton) findViewById(R.id.bmb);
        bmb.getPiecePlaceEnum().pieceNumber();
        bmb.setButtonEnum(ButtonEnum.Ham);
        bmb.setPiecePlaceEnum(PiecePlaceEnum.HAM_3);
        bmb.setButtonPlaceEnum(ButtonPlaceEnum.HAM_3);
        bmb.addBuilder(new HamButton.Builder().listener(new OnBMClickListener()
        {
            @Override
            public void onBoomButtonClick(int index)
            {
                Toast.makeText(getApplication(), "Clicked 1" + index, Toast.LENGTH_SHORT).show();

            }
        })
                .normalImageRes(R.drawable.alarm)
                .normalText("buttom1")
                .subNormalText("hello buttom 1"));

        bmb.addBuilder(new HamButton.Builder().listener(new OnBMClickListener()
        {
            @Override
            public void onBoomButtonClick(int index)
            {
                Toast.makeText(getApplication(), "Clicked 2" + index, Toast.LENGTH_SHORT).show();
            }
        })
                .normalImageRes(R.drawable.butterfly)
                .normalText("buttom2")
               .subNormalText("hello buttom 2"));

        bmb.addBuilder(new HamButton.Builder().listener(new OnBMClickListener()
        {
            @Override
            public void onBoomButtonClick(int index)
            {
                Toast.makeText(getApplication(), "Clicked 3" + index, Toast.LENGTH_SHORT).show();
            }
        })
                .normalImageRes(R.drawable.butterfly)
                .normalText("buttom3")
                .subNormalText("hello buttom 3"));



  }

}

