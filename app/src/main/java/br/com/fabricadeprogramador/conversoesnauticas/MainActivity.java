package br.com.fabricadeprogramador.conversoesnauticas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    //injetando o objeto edt_valor - equivalante ao findById
    @Bind(R.id.edt_valor)
    EditText edtValor;


    @OnClick(R.id.btn_metros)
    public void calculoMetros(){

        //Convertendo o valor digitado no campo para Double
        Double metros = Double.parseDouble(edtValor.getText().toString());

        chamaResultado(metros);

    }


    @OnClick(R.id.btn_kilomotros)
    public void calculoKilometros(){

        //Convertendo o valor digitado no campo para Double
        Double km = Double.parseDouble(edtValor.getText().toString());

        //Transformar km em metros
        Double metros = Conversor.kilometros2metros(km);

        chamaResultado(metros);

    }

    @OnClick(R.id.btn_mnauticas)
    public void calculoMNauticas(){

        //Convertendo o valor digitado no campo para Double
        Double mn = Double.parseDouble(edtValor.getText().toString());

        //Transformar km em metros
        Double metros = Conversor.milhasNauticas2metros(mn);

        chamaResultado(metros);

    }

    @OnClick(R.id.btn_mterrestres)
    public void calculoMTerrestres(){

        //Convertendo o valor digitado no campo para Double
        Double mt = Double.parseDouble(edtValor.getText().toString());

        //Transformar km em metros
        Double metros = Conversor.milhasTerrestres2metros(mt);

        chamaResultado(metros);

    }


    public void chamaResultado (Double metros){
        //Criando um novo bando de parametros
        Bundle bundle = new Bundle();

        //Colocando o valor convertido no bando de parametros
        bundle.putDouble("metros", metros);

        //Criando a intenção de ir para a exibicao do resultado
        Intent irParaResultado = new Intent(MainActivity.this, ResultadoActivity.class);

        //Colocando o nosso bando de parametros na nossa intencao
        irParaResultado.putExtras(bundle);

        //iniciando a nossa nova activity com a nossa intencao e o bando de parametros
        startActivity(irParaResultado, bundle);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }
}
