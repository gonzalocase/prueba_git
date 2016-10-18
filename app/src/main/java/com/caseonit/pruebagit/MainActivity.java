package com.caseonit.pruebagit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.caseonit.library.Asd;


public class MainActivity extends AppCompatActivity {

    /**
     * Algo de Javadoc.
     *
     * @param savedInstanceState savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //O.o
        //1
        //feature_01
        //feature_02
        //feature_a
        //feature_b
        //develop_2
        Asd asD= new Asd();
        asD.setAsd("asd");
    }
}
