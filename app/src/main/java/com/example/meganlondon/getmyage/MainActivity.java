package com.example.meganlondon.getmyage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText etYear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etYear = (EditText) findViewById(R.id.etYear);
    }

    public void buGetAge(View view) {
        int CurrentYear = Calendar.getInstance().get(Calendar.YEAR);
        int year = Integer.parseInt(etYear.getText().toString());
        int oldAge = CurrentYear - year;
        Toast.makeText(getApplicationContext(),"your age : " + String.valueOf(oldAge),
                Toast.LENGTH_LONG).show();

    }
}
