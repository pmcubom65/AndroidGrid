package com.barajas.gridlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    RadioGroup rg;
    CheckBox z;
    RadioButton rb;
    Button mb;
    ImageView im;
    Button otro;
    int contador=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        rg=(RadioGroup) findViewById(R.id.miradiogroup);
        z=(CheckBox) findViewById(R.id.checkBox);
        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox micheck=(CheckBox) findViewById(v.getId());
                Toast.makeText(SecondActivity.this, micheck.getText(), Toast.LENGTH_LONG).show();
            }
        });
        rg=(RadioGroup) findViewById(R.id.miradiogroup);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb=(RadioButton) findViewById(group.getCheckedRadioButtonId());
                Toast.makeText(SecondActivity.this, rb.getText(), Toast.LENGTH_LONG).show();


            }
        });


        mb=(Button) findViewById(R.id.buttonimagen);
        mb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador++;
                im=(ImageView) findViewById(R.id.imageView);
                if (contador%2!=0) {
                    im.setImageResource(R.drawable.ic_launcher_foreground);
                } else {
                    im.setImageResource(R.drawable.ic_action_mouse);
                }
            }
        });
    otro=(Button) findViewById(R.id.webviewboton);

    otro.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent();
            intent.setAction("com.barajas.gridlayout.TerceraActividad");
            startActivity(intent);
        }
    });


    }
}
