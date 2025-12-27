/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transformshapes;

/**
 *
 * @author Admin
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TransformShapes extends JPanel implements ActionListener {
    private int choice = 0;  // 1=translate, 2=scale, 3=rotate

    public TransformShapes() {
        JFrame frame = new JFrame("2D Transformations - Line & Rectangle");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Buttons for transformations
        JButton translateBtn = new JButton("Translate");
        JButton scaleBtn = new JButton("Scale");
        JButton rotateBtn = new JButton("Rotate");

        translateBtn.addActionListener(this);
        scaleBtn.addActionListener(this);
        rotateBtn.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(translateBtn);
        buttonPanel.add(scaleBtn);
        buttonPanel.add(rotateBtn);

        frame.add(this, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // Original shape
        g2.setColor(Color.BLUE);
        g2.drawRect(100, 100, 100, 50); // rectangle
        g2.drawLine(100, 200, 200, 250); // line
        g2.drawString("Original", 90, 90);

        // Apply transformations
        g2.setColor(Color.RED);
        switch (choice) {
            case 1: // Translation
                g2.translate(100, 50);
                g2.drawRect(100, 100, 100, 50);
                g2.drawLine(100, 200, 200, 250);
                g2.drawString("Translated", 90, 90);
                break;

            case 2: // Scaling
                g2.translate(100, 50);
                g2.scale(1.5, 1.5);
                g2.drawRect(100, 100, 100, 50);
                g2.drawLine(100, 200, 200, 250);
                g2.drawString("Scaled", 90, 90);
                break;

            case 3: // Rotation
                g2.translate(250, 150);
                g2.rotate(Math.toRadians(45));
                g2.drawRect(0, 0, 100, 50);
                g2.drawLine(0, 100, 100, 150);
                g2.drawString("Rotated", 10, -10);
                break;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.equals("Translate")) choice = 1;
        else if (cmd.equals("Scale")) choice = 2;
        else if (cmd.equals("Rotate")) choice = 3;
        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TransformShapes::new);
    }
}