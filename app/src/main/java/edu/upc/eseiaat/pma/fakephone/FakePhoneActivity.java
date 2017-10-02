package edu.upc.eseiaat.pma.fakephone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FakePhoneActivity extends AppCompatActivity {

    TextView txt_numbers;
    private String n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fake_phone);

    txt_numbers = (TextView) findViewById(R.id.txt_numbers);
    n = "";}

    public void clicnum (View v) {
        Button btn = (Button) v;
        String number = btn.getText().toString();
        n = number + n;
        txt_numbers.setText(n);
    }

    /*public void clicat (View v) {
        Button boto = (Button) v;
        Log.i("click", "Has clicat el botó!");
    }*/
}
