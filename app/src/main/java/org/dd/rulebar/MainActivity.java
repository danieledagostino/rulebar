package org.dd.rulebar;

import android.os.Bundle;
import android.util.Log;
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
        List<String> values = Arrays.asList("10", "20", "30", "40", "50", "60");
        draggableRulerView.setCustomValues(values);

        // Aggiungi un listener per ottenere la posizione del righello
        draggableRulerView.setOnRulerPositionChangeListener(selectedValue -> {
            Log.d("Ruler", "Valore selezionato: " + selectedValue);
        });
    }
}