package com.example.alik.anipco_co;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.nightonke.boommenu.BoomButtons.ButtonPlaceEnum;
import com.nightonke.boommenu.BoomButtons.HamButton;
import com.nightonke.boommenu.BoomButtons.OnBMClickListener;
import com.nightonke.boommenu.BoomMenuButton;
import com.nightonke.boommenu.ButtonEnum;
import com.nightonke.boommenu.Piece.PiecePlaceEnum;

public class Contact_Page extends AppCompatActivity {
    MapView mMapView;
    private GoogleMap googleMap;
    private TextView tel1,tel2,tel3,tel4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact__page);

        tel1=(TextView)findViewById(R.id.txttel1);
        tel2=(TextView)findViewById(R.id.txttel2);
        tel3=(TextView)findViewById(R.id.txttel3);
        tel4=(TextView)findViewById(R.id.txttel4);

        mMapView = (MapView)findViewById(R.id.mapView);
        mMapView.onCreate(savedInstanceState);

        mMapView.onResume();// needed to get the map to display immediately

        try {
            MapsInitializer.initialize(this);
        } catch (Exception e) {
            e.printStackTrace();
        }

        googleMap = mMapView.getMap();
        // latitude and longitude
        double latitude = 35.792169;
        double longitude = 51.430356;

        // create marker
        MarkerOptions marker = new MarkerOptions().position(
                new LatLng(latitude, longitude));

        // Changing marker icon
        marker.icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_ROSE));

        // adding marker
        googleMap.addMarker(marker);
        CameraPosition cameraPosition = new CameraPosition.Builder()
                .target(new LatLng(35.792169, 51.430356)).zoom(16).build();
        googleMap.animateCamera(CameraUpdateFactory
                .newCameraPosition(cameraPosition));


        tel1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                makeCall1();
            }
        });
        tel2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                makeCall2();
            }
        });

        tel3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                makeCall3();
            }
        });


        tel4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                makeCall4();
            }
        });





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
                String url ="https://www.instagram.com/novincode/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        })
                .normalImageRes(R.drawable.instagram_01)
                .normalText("Instagram")
                .subNormalText("hello buttom 1"));

        bmb.addBuilder(new HamButton.Builder().listener(new OnBMClickListener()
        {
            @Override
            public void onBoomButtonClick(int index)
            {
                String url ="https://t.me/novincode95";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        })
                .normalImageRes(R.drawable.telegram_01)
                .normalText("Telegram")
                .subNormalText("hello buttom 2"));

        bmb.addBuilder(new HamButton.Builder().listener(new OnBMClickListener()
        {
            @Override
            public void onBoomButtonClick(int index)
            {
                String url ="http://www.anipco.com/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        })
                .normalImageRes(R.drawable.domain_96)
                .normalText("Website")
                .subNormalText("www.anipco.com"));



    }
    protected void makeCall1()
    {
        Log.i("Make call", "");
        Intent phoneIntent = new Intent(Intent.ACTION_CALL);
        phoneIntent.setData(Uri.parse("tel:02122249800"));
        try
        {
            startActivity(phoneIntent);


        } catch (android.content.ActivityNotFoundException ex)
        {
            Toast.makeText(getApplication(),
                    "Call faild, please try again later.", Toast.LENGTH_SHORT).show();
        }
    }

    protected void makeCall2()
    {
        Log.i("Make call", "");
        Intent phoneIntent = new Intent(Intent.ACTION_CALL);
        phoneIntent.setData(Uri.parse("tel:02122249801"));
        try
        {
            startActivity(phoneIntent);


        } catch (android.content.ActivityNotFoundException ex)
        {
            Toast.makeText(getApplication(),
                    "Call faild, please try again later.", Toast.LENGTH_SHORT).show();
        }
    }

    protected void makeCall3()
    {
        Log.i("Make call", "");
        Intent phoneIntent = new Intent(Intent.ACTION_CALL);
        phoneIntent.setData(Uri.parse("tel:02122249802"));
        try
        {
            startActivity(phoneIntent);


        } catch (android.content.ActivityNotFoundException ex)
        {
            Toast.makeText(getApplication(),
                    "Call faild, please try again later.", Toast.LENGTH_SHORT).show();
        }
    }

    protected void makeCall4()
    {
        Log.i("Make call", "");
        Intent phoneIntent = new Intent(Intent.ACTION_CALL);
        phoneIntent.setData(Uri.parse("tel:02122249803"));
        try
        {
            startActivity(phoneIntent);


        } catch (android.content.ActivityNotFoundException ex)
        {
            Toast.makeText(getApplication(),
                    "Call faild, please try again later.", Toast.LENGTH_SHORT).show();
        }
    }
}

