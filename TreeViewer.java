/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class TreeViewer {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Tree Viewer Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create the root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");

        // Create child nodes
        DefaultMutableTreeNode branch1 = new DefaultMutableTreeNode("Branch 1");
        DefaultMutableTreeNode branch2 = new DefaultMutableTreeNode("Branch 2");

        // Add leaf nodes to branches
        branch1.add(new DefaultMutableTreeNode("Leaf 1.1"));
        branch1.add(new DefaultMutableTreeNode("Leaf 1.2"));

        branch2.add(new DefaultMutableTreeNode("Leaf 2.1"));
        branch2.add(new DefaultMutableTreeNode("Leaf 2.2"));

        // Add branches to root
        root.add(branch1);
        root.add(branch2);

        // Create the JTree using the root node
        JTree tree = new JTree(root);

        // Put the tree in a scroll pane
        JScrollPane scrollPane = new JScrollPane(tree);

        // Add the scroll pane to the frame
        frame.add(scrollPane, BorderLayout.CENTER);

        // Make the frame visible
        frame.setVisible(true);
    }
}
