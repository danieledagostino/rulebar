package org.dd.rulebar;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.dd.rulebar.draggableruler.DraggableRulerView;

import java.util.Arrays;
import java.util.List;

public class DraggableRulerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draggable_ruler);

        // Configurazione righello 1 (interi)
        DraggableRulerView rulerIntegers = findViewById(R.id.ruler_integers);
        setupRuler(rulerIntegers, Arrays.asList("10", "20", "30", "40", "50"), "Interi: ");

        // Configurazione righello 2 (stringhe)
        DraggableRulerView rulerStrings = findViewById(R.id.ruler_strings);
        setupRuler(rulerStrings, Arrays.asList("A", "B", "C", "D", "E"), "Stringhe: ");

        // Configurazione righello 3 (float)
        DraggableRulerView rulerFloats = findViewById(R.id.ruler_floats);
        setupRuler(rulerFloats, Arrays.asList("1.1", "2.2", "3.3", "4.4", "5.5"), "Float: ");

        // Configurazione righello 4 (alfanumerico)
        DraggableRulerView rulerAlphanumeric = findViewById(R.id.ruler_alphanumeric);
        setupRuler(rulerAlphanumeric, Arrays.asList("1A", "2B", "3C", "4D", "5E"), "Alfanumerico: ");
    }

    private void setupRuler(DraggableRulerView ruler, List<String> values, String label) {
        ruler.setCustomValues(values);
        ruler.setOnRulerPositionChangeListener(value -> {
            TextView labelView = findViewById(getLabelIdByRuler(ruler));
            labelView.setText(label + value);
        });
    }

    private int getLabelIdByRuler(DraggableRulerView ruler) {
        if (ruler.getId() == R.id.ruler_integers) {
            return R.id.label_integers;
        } else if (ruler.getId() == R.id.ruler_strings) {
            return R.id.label_strings;
        } else if (ruler.getId() == R.id.ruler_floats) {
            return R.id.label_floats;
        } else {
            return R.id.label_alphanumeric;
        }
    }
}
