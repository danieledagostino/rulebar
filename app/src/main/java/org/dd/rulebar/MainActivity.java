package org.dd.rulebar;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.dd.rulebar.draggableruler.DraggableRulerView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DraggableRulerView draggableRulerView = findViewById(R.id.draggableRulerView);

        // Imposta valori personalizzati
        List<String> values = Arrays.asList("1/25", "1/50", "1/100", "1", "30", "60");
        draggableRulerView.setCustomValues(values);

        // Aggiungi un listener per ottenere la posizione del righello e visualizzare un Toast
        draggableRulerView.setOnRulerPositionChangeListener(sv -> {
            Log.d("Ruler", "Valore selezionato: " + sv);
            Toast.makeText(this, "Valore selezionato: " + sv, Toast.LENGTH_SHORT).show();
        });
    }
}
