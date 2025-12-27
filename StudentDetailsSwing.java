/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentdetailsswing;

import javax.swing.*;
import java.awt.*;

public class StudentDetailsSwing extends JFrame {

    public StudentDetailsSwing() {
        setTitle("Student Details");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2, 10, 10));

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        JLabel regLabel = new JLabel("Register No:");
        JTextField regField = new JTextField();

        JLabel deptLabel = new JLabel("Department:");
        JTextField deptField = new JTextField();

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();

        JButton submitBtn = new JButton("Submit");
        JButton clearBtn = new JButton("Clear");

        add(nameLabel); add(nameField);
        add(regLabel); add(regField);
        add(deptLabel); add(deptField);
        add(emailLabel); add(emailField);
        add(submitBtn); add(clearBtn);

        // Action for Submit
        submitBtn.addActionListener(e -> {
            String name = nameField.getText();
            String reg = regField.getText();
            String dept = deptField.getText();
            String email = emailField.getText();

            if (name.isEmpty() || reg.isEmpty() || dept.isEmpty() || email.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill all fields.");
            } else {
                String info = "Name: " + name + "\nRegister No: " + reg +
                              "\nDepartment: " + dept + "\nEmail: " + email;
                JOptionPane.showMessageDialog(this, info, "Student Details", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Action for Clear
        clearBtn.addActionListener(e -> {
            nameField.setText("");
            regField.setText("");
            deptField.setText("");
            emailField.setText("");
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(StudentDetailsSwing::new);
    }
}