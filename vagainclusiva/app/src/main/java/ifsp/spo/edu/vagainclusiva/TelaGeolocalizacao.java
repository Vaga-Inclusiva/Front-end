package ifsp.spo.edu.vagainclusiva;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.util.Objects;

public class TelaGeolocalizacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_geolocalizacao);
        Objects.requireNonNull(getSupportActionBar()).hide();

        Button btnPermitir = findViewById(R.id.btn_permitir);

        btnPermitir.setOnClickListener(v -> {
            // Caso o usuário permita o acesso à geolocalização, abrimos a próxima Activity
            Intent intent = new Intent(TelaGeolocalizacao.this, Map.class);
            startActivity(intent);
            finish();
        });
    }
}
