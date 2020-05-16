package com.firatg.thost;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.firatg.thostlib.MixedThost;
import com.firatg.thostlib.Thost;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonSucces;
    Button buttonError;
    Button buttonWarning;
    Button buttonInfo;
    Button buttonCustom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonSucces = findViewById(R.id.button);
        buttonError = findViewById(R.id.button2);
        buttonWarning = findViewById(R.id.button3);
        buttonInfo = findViewById(R.id.button4);
        buttonCustom = findViewById(R.id.button5);

        buttonSucces.setOnClickListener(this);
        buttonError.setOnClickListener(this);
        buttonWarning.setOnClickListener(this);
        buttonInfo.setOnClickListener(this);
        buttonInfo.setOnClickListener(this);
        buttonCustom.setOnClickListener(this);

 /*       new Thost()
                .setContext(MainActivity.this)
                .setIcon(R.drawable.sde)//toast icon
                .setFont(R.font.pangolinregular)//toast font
                .seticonTintColor(R.color.colorPrimary)//icon rengi
                .setRadius(30.5f)//toast radius
                .setColor(getColor(R.color.colorAccent)) //toast renk
                .setTitle("Since it is clearly mentioned as 'impossible to lternative method and I clearly mentioned it as well.")
                .setTextSize(17)
                .setTextColor(R.color.colorPrimary)
                .setDuration(Toast.LENGTH_LONG)
                .create().thost().show();*/

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                MixedThost.success(MainActivity.this, "Success toast!").show();
                break;
            case R.id.button2:
                MixedThost.eror(MainActivity.this, "Error toast!").show();
                break;
            case R.id.button3:
                MixedThost.warning(MainActivity.this, "Warning toast!").show();
                break;
            case R.id.button4:
                MixedThost.info(MainActivity.this, "Info toast!").show();
                break;
            case R.id.button5:

                new Thost()
                        .setContext(MainActivity.this)
                        .setIcon(R.drawable.sde)//toast icon
                        .setFont(R.font.pangolinregular)//toast font
                        .seticonTintColor(R.color.colorPrimary)//icon rengi
                        .setRadius(50.5f)//toast radius
                        .setColor(getColor(R.color.colorAccent)) //toast renk
                        .setTitle("Since it is clearly mentioned as 'impossible to lternative method and I clearly mentioned it as well.")
                        .setTextSize(17)
                        .setTextColor(R.color.colorPrimary)
                        .setDuration(Toast.LENGTH_LONG)
                        .create().thost().show();

                break;
        }
    }
}
