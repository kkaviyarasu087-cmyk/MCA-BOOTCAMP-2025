/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shapedrawing;

/**
 *
 * @author Admin
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class ShapeDrawing extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw a line
        g.drawLine(20, 30, 200, 30);

        // Draw a rectangle
        g.drawRect(20, 50, 100, 60);

        // Draw an oval
        g.drawOval(150, 50, 100, 60);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Drawing Basic Shapes");
        ShapeDrawing panel = new ShapeDrawing();

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
    }
}
