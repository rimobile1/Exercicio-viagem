package br.com.etechoracio.etec.viagem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        EditText txtTempoGasto;
        EditText txtVelMedia;
        EditText txtRendVeiculo;
        TextView lblDistancia2;
        TextView lblConsumo2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            txtTempoGasto = findViewById(R.id.txtTempoGasto);
            txtVelMedia = findViewById(R.id.txtVelMedia);
            txtRendVeiculo = findViewById(R.id.txtRendVeiculo);
            lblDistancia2 = findViewById(R.id.lblDistancia2);
            lblConsumo2 = findViewById(R.id.lblConsumo2);
    }
        public void  onCalcular(View v){

        double tg = Double.parseDouble(txtTempoGasto.getText().toString());
        int vm = Integer.parseInt(txtVelMedia.getText().toString());
        double rd = Double.parseDouble(txtRendVeiculo.getText().toString());
        double distancia = tg * vm;
        double consumo = distancia / rd;
            lblDistancia2.setText(distancia);
            lblConsumo2.setText(consumo);


        }
}
