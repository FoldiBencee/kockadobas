package com.example.kockadobas;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private Button generalas;
    private ImageView kep1, kep2;
    private TextView eredmeny;
Random r = new Random();
int gondolt1;
int gondolt2;
int seged1=0;
int seged2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        gondolt1 = r.nextInt(6);
        gondolt2 = r.nextInt(6);

        generalas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (gondolt1 == gondolt2)
                {
                    seged1++;
                    eredmeny.setText("nyertel");
                    kocka1();
                    kocka2();

                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("");
                    alertDialog.setMessage("egyeztek, akarsz újat játszani?");
                    alertDialog.setCancelable(false);
                    alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Új játék!",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                    Intent main_activity = new Intent(MainActivity.this,MainActivity.class);
                                    finish();
                                    startActivity(main_activity);
                                }
                            });
                    alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "Kilépés",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                    finish();
                                }
                            });
                    alertDialog.show();
                }
                else
                {
                    seged2++;
                    eredmeny.setText("nem nyertel");
                    gondolt1 = r.nextInt(6);
                    gondolt2 = r.nextInt(6);
                    kocka1();
                    kocka2();
                }

            }

        });







    }
    public void init()
    {
        generalas=findViewById(R.id.generalas);
        kep1=findViewById(R.id.kep1);
        kep2=findViewById(R.id.kep2);
        eredmeny=findViewById(R.id.eredmeny);


    }



    public void kocka2()
    {
        if (gondolt2 == 1)
        {
            kep2.setImageResource(R.drawable.egy);
        }
        if (gondolt2 == 2)
        {
            kep2.setImageResource(R.drawable.ketto);
        }
        if (gondolt2 == 3)
        {
            kep2.setImageResource(R.drawable.harom);
        }
        if (gondolt2 == 4)
        {
            kep2.setImageResource(R.drawable.negy);
        }
        if (gondolt2 == 5)
        {
            kep2.setImageResource(R.drawable.ot);
        }
        if (gondolt2 == 6)
        {
            kep2.setImageResource(R.drawable.hat);
        }
    }
    public void kocka1()
    {
        if (gondolt1 == 1)
        {
            kep1.setImageResource(R.drawable.egy);
        }
        if (gondolt1 == 2)
        {
            kep1.setImageResource(R.drawable.ketto);
        }
        if (gondolt1 == 3)
        {
            kep1.setImageResource(R.drawable.harom);
        }
        if (gondolt1 == 4)
        {
            kep1.setImageResource(R.drawable.negy);
        }
        if (gondolt1 == 5)
        {
            kep1.setImageResource(R.drawable.ot);
        }
        if (gondolt1 == 6)
        {
            kep1.setImageResource(R.drawable.hat);
        }

    }

}
