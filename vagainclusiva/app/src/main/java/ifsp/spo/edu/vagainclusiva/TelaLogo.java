package ifsp.spo.edu.vagainclusiva;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.util.Objects;

public class TelaLogo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_logo);
        Objects.requireNonNull(getSupportActionBar()).hide();

        int tempoDeExibicao = 2000;

        new Handler().postDelayed(() -> {
            Intent proximaTela = new Intent(TelaLogo.this, TelaConexaoInternet.class);
            startActivity(proximaTela);
            finish();
        }, tempoDeExibicao);
    }
}