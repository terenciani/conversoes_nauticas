package br.com.fabricadeprogramador.conversoesnauticas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by terenciani on 03/11/15.
 */
public class ResultadoActivity extends Activity {

    @Bind(R.id.edt_metros)
    TextView tvMetros;

    @Bind(R.id.edt_kilometros)
    TextView tvKilometros;

    @Bind(R.id.edt_mterrestre)
    TextView tvMterrestres;

    @Bind(R.id.edt_mnauticas)
    TextView tvMnauticas;


    @OnClick(R.id.btn_fechar)
    public void fechar(){
        finish();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        ButterKnife.bind(this);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Double metros = bundle.getDouble("metros");

        tvMetros.setText(metros.toString());
        tvKilometros.setText(Conversor.metros2Kilometros(metros).toString());
        tvMterrestres.setText(Conversor.metros2milhasTerrestres(metros).toString());
        tvMnauticas.setText(Conversor.metros2milhasNauticas(metros).toString());


    }
}
