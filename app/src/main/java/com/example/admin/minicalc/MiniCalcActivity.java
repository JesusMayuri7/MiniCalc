package com.example.admin.minicalc;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.admin.minicalc.model.Operacion;


public class MiniCalcActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini_calc);

        final EditText etNumber1=(EditText)findViewById(R.id.EdNumber1);
        final EditText etNumber2=(EditText)findViewById(R.id.EdNumber2);
        Button bSumar=(Button)findViewById(R.id.bSumar);
        Button bResta=(Button)findViewById(R.id.bResta);
        final TextView tvResultado= (TextView)findViewById(R.id.Resultado);

        final Operacion operacion = new Operacion();


        bSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1=Integer.valueOf(etNumber1.getText().toString());
                int number2=Integer.valueOf(etNumber2.getText().toString());
                int resultado = operacion.EjecutarSuma(number1, number2);
                tvResultado.setText(resultado+"");
            }
        });

        bResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1=Integer.valueOf(etNumber1.getText().toString());
                int number2=Integer.valueOf(etNumber2.getText().toString());
                int resultado = operacion.EjecutarResta(number1, number2);
                tvResultado.setText(resultado+"");
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mini_calc, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
