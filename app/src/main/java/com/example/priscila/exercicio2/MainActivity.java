package com.example.priscila.exercicio2;
import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;


public class MainActivity extends Activity {
    EditText textField; TextView label;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeButton = (Button)findViewById(R.id.change);
        changeButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                changeLabel = (TextView)findViewById(R.id.label);
                TextView texto = (TextView)findViewById(R.id.textField);
                changeLabel.setText(texto.getText().toString());
            }
        });
    }
    public Button changeButton;
    public TextView changeLabel;
}
