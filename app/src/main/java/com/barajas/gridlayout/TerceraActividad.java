package com.barajas.gridlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TerceraActividad extends AppCompatActivity {
Button b;
WebView wb;
EditText tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera_actividad);

        b=(Button) findViewById(R.id.botonweb);
        wb=(WebView) findViewById(R.id.miweb);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        //        wb=(WebView) findViewById(R.id.miweb);
                tv=(EditText) findViewById(R.id.textoweb);
                wb.flingScroll(10,10);
                wb.getSettings().setJavaScriptEnabled(true);
                wb.loadUrl(tv.getText().toString());
            }
        });



    }
}
