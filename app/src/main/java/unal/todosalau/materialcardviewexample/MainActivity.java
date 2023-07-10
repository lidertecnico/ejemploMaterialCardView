package unal.todosalau.materialcardviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    // Obtener referencia al botón "btn_back"
    MaterialButton btnBack = findViewById(R.id.btn_back);
    btnBack.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Acción a realizar cuando se hace clic en el botón "btn_back"
            Toast.makeText(MainActivity.this, "Llamar a la anterior tarjeta", Toast.LENGTH_SHORT).show();
        }
    });

// Obtener referencia al botón "btn_next"
    MaterialButton btnNext = findViewById(R.id.btn_next);
    btnNext.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Acción a realizar cuando se hace clic en el botón "btn_next"
            Toast.makeText(MainActivity.this, "Llamar a la siguiente tarjeta",
                    Toast.LENGTH_SHORT).show();

        }
    });
    }
}