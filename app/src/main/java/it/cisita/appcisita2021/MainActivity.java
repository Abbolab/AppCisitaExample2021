package it.cisita.appcisita2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // setting di un file di layout custom
        setContentView(R.layout.main_layout);

        // refenzio programmaticamente la TextView presente nel layout
        TextView myTextView = findViewById(R.id.textViewTest);
        myTextView.setText("Pulsante premuto: 0 volte");

        //refenzio pulsante
        Button myButton = findViewById(R.id.buttonTest);
        // implementando Listener per intercettare OnClick pulsante
        myButton.setOnClickListener(new View.OnClickListener() {

            int count = 0;

            @Override
            public void onClick(View view) {
                count++;
                myTextView.setText("Pulsante premuto: " + String.valueOf(count) + " volte");
                Log.i("CISITA", "Pulsante premuto!!!");

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);

            }
        });

    }
}