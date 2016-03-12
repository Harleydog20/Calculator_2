package com.example.robbie.calculator_2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //private variables
    private TextView _resultView;
    private Button _1;
    private Button _2;
    private Button _3;
    private Button _4;
    private Button _5;
    private Button _6;
    private Button _7;
    private Button _8;
    private Button _9;
    private Button _0;
    private Button _AC;
    private Button _equals;
    private Button _plus;
    private Button _minus;
    private Button _divide;
    private Button _mult;
    private Button _dot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //create reference
        this._resultView = (TextView) findViewById(R.id.resultView);
        this._1 = (Button) findViewById(R.id.button3);
        this._2 = (Button) findViewById(R.id.button4);
        this._3 = (Button) findViewById(R.id.button5);
        this._4 = (Button) findViewById(R.id.button7);
        this._5 = (Button) findViewById(R.id.button8);
        this._6 = (Button) findViewById(R.id.button9);
        this._7 = (Button) findViewById(R.id.button11);
        this._8 = (Button) findViewById(R.id.button12);
        this._9 = (Button) findViewById(R.id.button13);
        this._0 = (Button) findViewById(R.id.button15);
        this._AC = (Button) findViewById(R.id.button);
        this._equals = (Button) findViewById(R.id.button2);
        this._plus = (Button) findViewById(R.id.button6);
        this._minus = (Button) findViewById(R.id.button10);
        this._divide = (Button) findViewById(R.id.button17);
        this._mult = (Button) findViewById(R.id.button14);
        this._dot = (Button) findViewById(R.id.button16);


        //create onClick
        _1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                _resultView.append(_1.getText());
            }
        });
        _2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                _resultView.append(_2.getText());
            }
        });
        _3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                _resultView.append(_3.getText());
            }
        });
        _4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                _resultView.append(_4.getText());
            }
        });
        _5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                _resultView.append(_5.getText());
            }
        });
        _6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                _resultView.append(_6.getText());
            }
        });
        _7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                _resultView.append(_7.getText());
            }
        });
        _8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                _resultView.append(_8.getText());
            }
        });
        _9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                _resultView.append(_9.getText());
            }
        });
        _0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                _resultView.append(_0.getText());
            }
        });
        _dot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                _resultView.append(_dot.getText());
            }
        });

        _AC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });
        _equals.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });
        _plus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });
        _minus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });
        _mult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });
        _divide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });

    }


}
