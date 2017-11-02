package com.easytechhub.helloeyakub.bdinformation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button dhaka, ctg, rajshahi, barishal, sylhet, mymenshing, khulna, rangpur;
    TextView tv;
    ArrayList<City> cityArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dhaka = (Button) findViewById(R.id.dhaka);
        ctg = (Button) findViewById(R.id.ctg);
        rajshahi = (Button) findViewById(R.id.rajshahi);
        barishal = (Button) findViewById(R.id.barishal);
        sylhet = (Button) findViewById(R.id.sylhet);
        mymenshing = (Button) findViewById(R.id.mymensing);
        khulna = (Button) findViewById(R.id.khulna);
        rangpur = (Button) findViewById(R.id.rangpur);

        cityArrayList = new ArrayList<>();
        setImageAndDetails();

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.dhaka){

        }else if(v.getId() == R.id.ctg){

        }else if(v.getId() == R.id.rajshahi){

        }else if(v.getId() == R.id.barishal){

        }else if(v.getId() == R.id.khulna){

        }else if(v.getId() == R.id.sylhet){

        }else if(v.getId() == R.id.rangpur){

        }else if(v.getId() == R.id.mymensing){

        }
    }

    private void setImageAndDetails(){
        cityArrayList.add(new City("Dhaka",  R.drawable.hi));
        cityArrayList.add(new City("hi",  R.drawable.hi));
    }
}
