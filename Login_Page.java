package com.example.alik.anipco_co;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.balysv.materialripple.MaterialRippleLayout;
import com.example.alik.anipco_co.Utils.Utils;
import com.romainpiel.shimmer.Shimmer;
import com.romainpiel.shimmer.ShimmerTextView;

import java.util.HashMap;

public class Login_Page extends AppCompatActivity {
    private EditText ed_log,ed_pass;
    private MaterialRippleLayout materialRippleLayout_login,materialRippleLayout_register;
    private ShimmerTextView myShimmerTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__page);


        myShimmerTextView= (ShimmerTextView) findViewById(R.id.shimmer_tv);

        Shimmer shimmer = new Shimmer();
        shimmer.start(myShimmerTextView);
        shimmer.setDuration(5000);
        materialRippleLayout_login= (MaterialRippleLayout) findViewById(R.id.material_login);
        materialRippleLayout_register = (MaterialRippleLayout) findViewById(R.id.material_register);

        ed_log = (EditText) findViewById(R.id.editText2p);
        ed_pass = (EditText) findViewById(R.id.editText1p);


materialRippleLayout_login.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        click();
    }
});

        materialRippleLayout_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login_Page.this,Register_Page.class));
            }
        });
    }


    public void click() {



            String username = ed_log.getText().toString();
            String password = ed_pass.getText().toString();
if(username.equalsIgnoreCase("") || password.equalsIgnoreCase(""))
{
    Toast.makeText(getApplicationContext(), "خالی است", Toast.LENGTH_SHORT).show();
}
else
{new loginreqouest(username,password,getApplicationContext()).execute();
    startActivity(new Intent(Login_Page.this,Home_Page.class));


}

        }



    private class loginreqouest extends AsyncTask<Void,Void,String>
    {

        String Username,Password;
        Context context;

        public loginreqouest(String username, String password, Context context) {
            Username = username;
            Password = password;
            this.context = context;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(Void... params) {
            String Address = "http://bashirsalehi.ir/wia/login.php";
            HashMap hashMap = new HashMap();
            hashMap.put("username",Username);
            hashMap.put("password",Password);
            return Utils.sendData(Address,hashMap);
        }

        @Override
        protected void onPostExecute(String s) {
            Toast.makeText(context,s,Toast.LENGTH_SHORT).show();
        }
    }
}
