package com.barajas.gridlayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.RelativeLayout;
import android.os.Build;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class MainActivity extends AppCompatActivity {
    androidx.gridlayout.widget.GridLayout migrid;
    Button b;
    LinkedHashMap<Integer, Button> mapa = new LinkedHashMap<Integer, Button>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anadirHijos();


    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public void anadirHijos() {
        migrid = (androidx.gridlayout.widget.GridLayout) findViewById(R.id.migrid);
        migrid.setPadding(30, 20, 20, 10);
        for (int i = 0; i < 18; i++) {
            RelativeLayout.LayoutParams rules = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

            b = new Button(this);
            if (i == 17) {
                b.setText("RESET");
            } else {
                b.setText("Botón " + i);
            }


            b.setTextColor(Color.WHITE);

            b.setBackgroundColor(Color.rgb((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));


            b.setId(i);
            b.setLayoutParams(rules);
            migrid.addView(b, i);

        }

        for (int i = 0; i < migrid.getChildCount(); i++) {
            View v = migrid.getChildAt(i);
            if (i != 17) {
                final int r=i;

                v.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mapa.put(r, (Button) v);
                        v.setBackgroundColor(Color.WHITE);


                    }
                });
            } else {
                v.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        recorrergrid();


                    }
                });
            }

        }


    }

    public void recorrergrid() {
       migrid.removeAllViews();
       anadirHijos();
    }
}