package control;

import javax.swing.*;
import java.awt.*;

public class Toolbar extends JPanel {


private String[] borderColor={"red","blue","pink","orange","black","white"};

    JLabel sizeLabel = new JLabel("Stroke size: ");
    JLabel colorLabel = new JLabel("Border color:");
    JTextField shapesSize = new JFormattedTextField();
   JComboBox colorsValue = new JComboBox(borderColor);
    JButton drawLine = new JButton("Draw a line");
    JButton deleteShape = new JButton("Delete");

    public Toolbar(DrawingFrame frame) {
        this.setBorder(BorderFactory.createTitledBorder("control.Toolbar"));
        init();
        this.setLayout(new GridLayout(3,2, 20, 5));
    }

    private void init() {
        colorsValue.setSelectedIndex(1);
        shapesSize.setText("10");
        add(colorLabel);
        add(sizeLabel);
        add(colorsValue);
        add(shapesSize);
        add(drawLine);
        add(deleteShape);
    }
}
