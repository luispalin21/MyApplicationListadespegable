package itics.luis.com.example.myapplicationlistadespegable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     Spinner listadespegable;
     GridView datosgv;
     RadioButton rb1,rb2,rb3,rb4,rb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] Elementossp = {"Suma", "Resta", "Multipliclacion", "Division", "Potencia"};
        String[] Elementosgv = {"Nombre", "Edad", "Correo", "Pablo", "22", "palito@escobar", "jose", "30", "pepetesoem@jfh", "carlos", "50", "carlitos@34"};

        listadespegable = (Spinner) findViewById(R.id.listadespegable);
        datosgv = (GridView) findViewById(R.id.datosgv);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton) findViewById(R.id.rb3);
        rb4 = (RadioButton) findViewById(R.id.rb4);
        rb5 = (RadioButton) findViewById(R.id.rb5);

        ArrayAdapter<String> elementossp = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Elementossp);
        ArrayAdapter<String> elementosgv = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Elementosgv);

        listadespegable.setAdapter(elementossp);
        datosgv.setAdapter(elementosgv);

    }
    public void checaRadioBoton(View view){
        if (rb1.isChecked()){
            Toast.makeText(this,"Se presiono suma",Toast.LENGTH_LONG).show();
        } else if (rb2.isChecked()) {
            Toast.makeText(this,"Se presiono resta",Toast.LENGTH_LONG).show();
        } else if (rb3.isChecked()) {
            Toast.makeText(this,"Se presiono multiplicacion",Toast.LENGTH_LONG).show();
        } else if (rb4.isChecked()) {
            Toast.makeText(this,"Se presiono division",Toast.LENGTH_LONG).show();
        }else if (rb5.isChecked()) {
            Toast.makeText(this,"Se presiono potencia",Toast.LENGTH_LONG).show();
        }

    }
}
