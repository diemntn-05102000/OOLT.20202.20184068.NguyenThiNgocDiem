package OOP;

import javax.swing.*;

public class HelloNameDialog {
    public static void main(String[] args) {
        String result;
        result = JOptionPane.showInputDialog("Please enter your name:");
        JOptionPane.showConfirmDialog(null,"Hi"+result+"!");
        System.exit(0);
    }
}
