
# Draggable Ruler View for Android

A customizable Android view that simulates a draggable ruler with markers, values, and customizable behavior. This component allows you to create a draggable ruler where users can select values, and it supports custom values, text display, and adjustable appearance.

## Features

- Draggable ruler with customizable positions.
- Display custom values (strings or numbers) along the ruler.
- Configurable appearance (color, font size, selected value color).
- Handle touch events to move the ruler.
- Automatic snapping to values.
- Easy integration with Android projects.

## Requirements

- Android 4.0 (API level 14) or higher.

## Installation

To integrate this component into your project, follow these steps:

1. **Clone the repository**:
   ```
   git clone https://github.com/your-username/draggable-ruler-view.git
   ```

2. **Add the view to your layout XML**:
   In your `activity_main.xml` (or any other layout file), add the `DraggableRulerView`:

   ```xml
   <org.dd.rulebar.draggableruler.DraggableRulerView
       android:id="@+id/rulerView"
       android:layout_width="match_parent"
       android:layout_height="wrap_content"
       app:step="50"
       app:selectedValueColor="#FF5733"/>
   ```

   - **step**: Distance between each tick on the ruler.
   - **selectedValueColor**: Color for the selected value.

3. **Add the required attributes** in your `build.gradle` if necessary.

4. **Use in your Java/Kotlin code**:

   ```java
   DraggableRulerView rulerView = findViewById(R.id.rulerView);

   // Set custom values (optional)
   List<String> values = Arrays.asList("A", "B", "C", "D", "E", "F", "G");
   rulerView.setCustomValues(values);

   // Set selected value color
   rulerView.setSelectedValueColor(Color.RED);

   // Set listener to get selected value
   rulerView.setOnRulerPositionChangeListener(position -> {
       Log.d("Ruler", "Selected Value: " + position);
   });
   ```

## Customization

### 1. **Set Custom Values**

To display custom values on the ruler (e.g., letters, categories, etc.), you can pass a list of strings to the `setCustomValues()` method:

```java
List<String> values = Arrays.asList("A", "B", "C", "D", "E", "F", "G");
rulerView.setCustomValues(values);
```

### 2. **Change Selected Value Color**

You can change the color of the selected value on the ruler by calling the `setSelectedValueColor()` method:

```java
rulerView.setSelectedValueColor(Color.RED);
```

### 3. **Listener for Value Change**

You can set a listener to receive updates whenever the user changes the ruler’s position:

```java
rulerView.setOnRulerPositionChangeListener(position -> {
    // position will contain the selected value (string or number)
    Log.d("Ruler", "Selected Value: " + position);
});
```

### 4. **Set Step Size and Minimum/Maximum Values**

You can customize the step size and set the ruler's minimum and maximum range directly in your code.

```java
rulerView.setStep(50); // Set the distance between ticks
```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
