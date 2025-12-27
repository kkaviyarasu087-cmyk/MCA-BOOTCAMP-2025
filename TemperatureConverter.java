/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperatureconverter;

/**
 *
 * @author Admin
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureConverter extends JFrame implements ActionListener {
    private JTextField celsiusField, fahrenheitField;
    private JButton convertToF, convertToC, clearButton;

    public TemperatureConverter() {
        setTitle("Temperature Converter");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        JLabel celsiusLabel = new JLabel("Celsius:");
        JLabel fahrenheitLabel = new JLabel("Fahrenheit:");

        celsiusField = new JTextField();
        fahrenheitField = new JTextField();

        convertToF = new JButton("Convert to Fahrenheit");
        convertToC = new JButton("Convert to Celsius");
        clearButton = new JButton("Clear");

        convertToF.addActionListener(this);
        convertToC.addActionListener(this);
        clearButton.addActionListener(this);

        add(celsiusLabel);
        add(celsiusField);
        add(fahrenheitLabel);
        add(fahrenheitField);
        add(convertToF);
        add(convertToC);
        add(clearButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == convertToF) {
                String celsiusText = celsiusField.getText();
                if (!celsiusText.isEmpty()) {
                    double celsius = Double.parseDouble(celsiusText);
                    double fahrenheit = (celsius * 9 / 5) + 32;
                    fahrenheitField.setText(String.format("%.2f", fahrenheit));
                }
            } else if (e.getSource() == convertToC) {
                String fahrenheitText = fahrenheitField.getText();
                if (!fahrenheitText.isEmpty()) {
                    double fahrenheit = Double.parseDouble(fahrenheitText);
                    double celsius = (fahrenheit - 32) * 5 / 9;
                    celsiusField.setText(String.format("%.2f", celsius));
                }
            } else if (e.getSource() == clearButton) {
                celsiusField.setText("");
                fahrenheitField.setText("");
            }
             } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TemperatureConverter());
    }
}