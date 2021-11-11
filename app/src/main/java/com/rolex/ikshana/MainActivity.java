package com.rolex.ikshana;

import static java.util.logging.Logger.global;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import com.budiyev.android.codescanner.CodeScanner;
import com.budiyev.android.codescanner.CodeScannerView;
import com.budiyev.android.codescanner.DecodeCallback;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        CardView card_view = (CardView) findViewById(R.id.card1);CardView card_view2 = (CardView) findViewById(R.id.card2); // creating a CardView and assigning a value.
        CardView card_view3 = (CardView) findViewById(R.id.card3);CardView card_view4 = (CardView) findViewById(R.id.card4);CardView card_view5 = (CardView) findViewById(R.id.card5);
        CardView card_view6 = (CardView) findViewById(R.id.card6);


        card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:28.38,77.12 "))
Intent chosser =Intent.createChooser(intent,"Launch Maps")

                startActivity(chosser);
                // do whatever you want to do on click (to launch any fragment or activity you need to put intent here.)
            }
        });  card_view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:28.38,77.12 "))
                Intent chosser =Intent.createChooser(intent,"Launch Maps")

                startActivity(chosser);
                // do whatever you want to do on click (to launch any fragment or activity you need to put intent here.)
            }
        });  card_view3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:28.38,77.12 "))
                Intent chosser =Intent.createChooser(intent,"Launch Maps")

                startActivity(chosser);
                // do whatever you want to do on click (to launch any fragment or activity you need to put intent here.)
            }
        });  card_view4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Intent intent = new Intent( Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:28.38,77.12 "))
                Intent chosser =Intent.createChooser(intent,"Launch Maps")

                startActivity(chosser);
                // do whatever you want to do on click (to launch any fragment or activity you need to put intent here.)
            }
        });  card_view5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:28.38,77.12 "))
                Intent chosser =Intent.createChooser(intent,"Launch Maps")

                startActivity(chosser);
                // do whatever you want to do on click (to launch any fragment or activity you need to put intent here.)
            }
        });  card_view6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:28.38,77.12 "))
                Intent chosser =Intent.createChooser(intent,"Launch Maps")

                startActivity(chosser);
                // do whatever you want to do on click (to launch any fragment or activity you need to put intent here.)
            }
        });
    }}