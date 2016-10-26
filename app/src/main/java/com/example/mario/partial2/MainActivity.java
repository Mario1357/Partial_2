package com.example.mario.partial2;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Integer aa, bb;
    Button sta, chec, rest, nex;
    TextView tiempo;
    EditText txtb;
    CountDownTimer countDownTimer;


    public void start(View view) {
        txtb.setEnabled(true);


        rest.setEnabled(false);
        sta.setEnabled(false);
        txtb.setEnabled(true);
        nex.setEnabled(true);
        chec.setEnabled(true);
        int uno, dos, tres;
        uno = (int) (Math.random() * 100);
        dos = (int) (Math.random() * 100);

        TextView n1 = (TextView) findViewById(R.id.num1);
        TextView n2 = (TextView) findViewById(R.id.num2);

        final TextView tvResultado = (TextView) findViewById(R.id.resultado);
        String unoo, doss;
        unoo = String.valueOf(uno);
        doss = String.valueOf(dos);
        n1.setText(unoo);
        n2.setText(doss);

        tres = uno + dos;

        tvResultado.setText("" + tres);
        //contador

        countDownTimer = new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
                tiempo.setText("" + millisUntilFinished / 1000);

            }

            public void onFinish() {
                tiempo.setText("00");
                sta.setEnabled(false);
                rest.setEnabled(true);
                chec.setEnabled(false);
                txtb.setEnabled(false);
                nex.setEnabled(false);
            }
        }.start();


    }

    public void Next(View view) {
        nex.setEnabled(false);
        countDownTimer.cancel();
        chec.setEnabled(true);
        int uno, dos, tres;
        uno = (int) (Math.random() * 100);
        dos = (int) (Math.random() * 100);

        TextView n1 = (TextView) findViewById(R.id.num1);
        TextView n2 = (TextView) findViewById(R.id.num2);

        final TextView tResultado = (TextView) findViewById(R.id.resultado);
        String unoooo, doss;
        unoooo = String.valueOf(uno);
        doss = String.valueOf(dos);
        n1.setText(unoooo);
        n2.setText(doss);

        tres = uno + dos;

        tResultado.setText("" + tres);

        //contador
        countDownTimer = new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
                tiempo.setText("" + millisUntilFinished / 1000);
            }

            public void onFinish() {
                tiempo.setText("00");
                sta.setEnabled(false);
                rest.setEnabled(true);
                chec.setEnabled(false);
                txtb.setEnabled(false);
                nex.setEnabled(false);

            }
        }.start();

    }

    public void reset(View view) {
        sta.setEnabled(true);
        tiempo.setText("30");
        TextView incc = (TextView) findViewById(R.id.incorrect);
        TextView co = (TextView) findViewById(R.id.correct);
        incc.setText("0");
        co.setText("0");


    }

    public void check(View view) {


        TextView unoo, dossss;
        final TextView tvResultado = (TextView) findViewById(R.id.result_box);
        unoo = (TextView) findViewById(R.id.resultado);
        dossss = (TextView) findViewById(R.id.presult);


        String Pres, Mres;
        Pres = tvResultado.getText().toString();
        Mres = unoo.getText().toString();

        dossss.setText(Pres);


        TextView correct = (TextView) findViewById(R.id.correct);
        TextView incorect = (TextView) findViewById(R.id.incorrect);

        String inc, cor;
        cor = correct.getText().toString();
        inc = incorect.getText().toString();

        int incorrect, punto, corect, co;
        punto = 0;
        corect = Integer.valueOf(cor);
        co = 0;
        incorrect = Integer.valueOf(inc);


        if (Pres.equals("")) {
            Toast.makeText(this, "Ha dejado campos vacios",
                    Toast.LENGTH_LONG).show();
        } else {
            chec.setEnabled(false);
            nex.setEnabled(true);
            int pres, mres;
            pres = Integer.parseInt(Pres);
            mres = Integer.parseInt(Mres);

            if (pres == mres) {

                aa = corect + 1;
                co = aa;

                String coo = String.valueOf(co);

                correct.setText(coo);
            } else {
                bb = incorrect + 1;
                punto = bb;

                String incc = String.valueOf(punto);
                incorect.setText(incc);
            }

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sta = (Button) findViewById(R.id.button);
        nex = (Button) findViewById(R.id.next);
        rest = (Button) findViewById(R.id.reset);
        chec = (Button) findViewById(R.id.check);
        txtb = (EditText) findViewById(R.id.result_box);
        tiempo = (TextView) findViewById(R.id.time);

        nex.setEnabled(false);
        rest.setEnabled(false);
        sta.setEnabled(true);
        chec.setEnabled(false);
        txtb.setEnabled(false);

    }


}
