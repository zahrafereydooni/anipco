package com.example.alik.anipco_co;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.balysv.materialripple.MaterialRippleLayout;
import com.example.alik.anipco_co.Utils.Document_Page;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;

public class Home_Page extends AppCompatActivity {
    private CardView cardView_1,cardView_2,cardView_3,cardView_4,cardView_5,cardView_6,cardView_7,cardView_8;
private MaterialRippleLayout materialRippleLayout,materialRippleLayout2,materialRippleLayout3,materialRippleLayout4
        ,materialRippleLayout5,materialRippleLayout6,materialRippleLayout7,materialRippleLayout8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__page);
        final int status = GooglePlayServicesUtil.isGooglePlayServicesAvailable(getBaseContext());

        materialRippleLayout = (MaterialRippleLayout)findViewById(R.id.material_1);
        materialRippleLayout2 = (MaterialRippleLayout)findViewById(R.id.material_2);
        materialRippleLayout3= (MaterialRippleLayout)findViewById(R.id.material_3);
        materialRippleLayout4 = (MaterialRippleLayout)findViewById(R.id.material_4);
        materialRippleLayout5 = (MaterialRippleLayout)findViewById(R.id.material_5);
        materialRippleLayout6 = (MaterialRippleLayout)findViewById(R.id.material_6);
        materialRippleLayout7 = (MaterialRippleLayout)findViewById(R.id.material_7);
        materialRippleLayout8 = (MaterialRippleLayout)findViewById(R.id.material_8);
        cardView_1 = (CardView) findViewById(R.id.card_1);
        cardView_2 = (CardView) findViewById(R.id.card_2);
        cardView_3 = (CardView) findViewById(R.id.card_3);
        cardView_4 = (CardView) findViewById(R.id.card_4);
        cardView_5 = (CardView) findViewById(R.id.card_5);
        cardView_6 = (CardView) findViewById(R.id.card_6);
        cardView_7 = (CardView) findViewById(R.id.card_7);
        cardView_8 = (CardView) findViewById(R.id.card_8);

        Animation animation1 = AnimationUtils.loadAnimation(this,R.anim.move_right);
        cardView_1.setAnimation(animation1);
        Animation animation2 = AnimationUtils.loadAnimation(this,R.anim.move_right);
        cardView_3.setAnimation(animation2);
        Animation animation3 = AnimationUtils.loadAnimation(this,R.anim.move_right);
        cardView_5.setAnimation(animation3);
        Animation animation7 = AnimationUtils.loadAnimation(this,R.anim.move_right);
        cardView_7.setAnimation(animation7);

        Animation animation4 = AnimationUtils.loadAnimation(this,R.anim.move_left);
        cardView_2.setAnimation(animation4);
        Animation animation5 = AnimationUtils.loadAnimation(this,R.anim.move_left);
        cardView_4.setAnimation(animation5);
        Animation animation6 = AnimationUtils.loadAnimation(this,R.anim.move_left);
        cardView_6.setAnimation(animation6);
        Animation animation8 = AnimationUtils.loadAnimation(this,R.anim.move_left);
        cardView_8.setAnimation(animation8);


        materialRippleLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_Page.this,Introduction_Page.class));
            }
        });
        materialRippleLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_Page.this,Services_Page.class));
            }
        });
        materialRippleLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_Page.this,Projects.class));
            }
        });
        materialRippleLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_Page.this,Introduction_Page.class));
            }
        });
        materialRippleLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_Page.this,Gallery2.class));
            }
        });
        materialRippleLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_Page.this,Article.class));
            }
        });
        materialRippleLayout7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(status== ConnectionResult.SUCCESS)
                {
                    startActivity(new Intent(Home_Page.this,Contact_Page.class));
                }else
                {
                    startActivity(new Intent(Home_Page.this,Contact_Page_offline.class));
                }

            }
        });
        materialRippleLayout8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_Page.this,Document_Page.class));
            }
        });

    }

//    public void click(View view) {
//
//        int id =view.getId();
//        if (id == R.id.card_1)
//        {
//           // startActivity(new Intent(Home_Page.this,Introduction_Page.class));
//        }
//        else if(id == R.id.card_2)
//        {
//            startActivity(new Intent(Home_Page.this,Services_Page.class));
//        }
//        else if(id == R.id.card_3)
//        {
//
//        }
//        else if(id == R.id.card_4)
//        {
//
//        }
//        else if(id == R.id.card_5)
//        {
//
//        }
//        else if(id == R.id.card_6)
//        {
//
//        }
//        else if(id == R.id.card_7)
//        {
//
//        }
//
//    }
}
