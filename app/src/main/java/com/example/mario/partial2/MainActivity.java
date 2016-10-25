package com.example.mario.partial2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void start (View view){
        EditText resultado = (EditText) findViewById(R.id.result_box);
        String Sresultado = resultado.getText().toString().trim();
        TextView tiempo = ()

        public void updateTimer(int secondsLeft) {

            int minutes = (int) secondsLeft / 60;
            int seconds = (int) secondsLeft % 60;

            String secondsString = Integer.toString(seconds);
            if (secondsString.length() < 2) {
                secondsString = "0" + secondsString;
            }

            String minutesString = Integer.toString(minutes);
            if (minutesString.length() < 2) {
                minutesString = "0" + minutesString;
            }

            time.setText(minutesString + ":" + secondsString);
        }
    }
}
