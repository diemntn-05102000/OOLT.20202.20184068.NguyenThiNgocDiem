package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.media.*;
import hust.soict.hedspi.aims.order.Order;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class AimsGUI extends JFrame {
    private JPanel displayPanel;
    private JButton orderBtn = new JButton("New order");
    private JButton addItemBtn = new JButton("Add");
    private JTextField termField = new JTextField();
    private JButton searchItemBtn = new JButton("Search");
    private JButton deleteItemBtn = new JButton("Delete");
    private JScrollPane scrollPane;
    private JList<Media> mediaList;
    private Order order;

}
