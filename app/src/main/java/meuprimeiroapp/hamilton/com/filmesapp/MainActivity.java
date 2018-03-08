package meuprimeiroapp.hamilton.com.filmesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton imbCad;
    final  int TELA_CADASTRO = 123432345;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding();

        imbCad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(),SegundaActivity.class);

                startActivityForResult(itn, TELA_CADASTRO);
            }
        });
    }

    private void binding() {

        imbCad = findViewById(R.id.botaoCadastro);
    }
}
