package soict.hedspi.aims;

import soict.hedspi.aims.media.DigitalVideoDisc;
import soict.hedspi.aims.media.Media;
import soict.hedspi.aims.order.Order;

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
    private int mediaCount;
    public AimsGUI() {
        // get this frame
        JFrame f = this;
        // containter
        Container parentContainer = getContentPane();
        parentContainer.setLayout(new BorderLayout()); // The content-pane sets its layout

        // header for create order button
        parentContainer.add(new JPanel() {
            {
                setLayout(new FlowLayout());
                add(orderBtn);
            }
        }, BorderLayout.NORTH);

        // footer for another button
        termField.setColumns(10);
        parentContainer.add(new JPanel() {
            {
                setLayout(new FlowLayout());
                add(addItemBtn);
                add(termField);
                add(searchItemBtn);
                add(deleteItemBtn);
            }
        }, BorderLayout.SOUTH);

        order = new Order();


        // display media
        displayPanel = new JPanel(new BorderLayout());
        displayPanel.add(new JLabel("Order " + SwingConstants.CENTER), BorderLayout.NORTH);
        mediaList = new JList<Media>(new Vector<Media>(order.getItemsOrdered()));
        mediaList.setFont(new Font("monospaced", Font.PLAIN, 15));
        scrollPane = new JScrollPane(mediaList, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        displayPanel.add(scrollPane);
        parentContainer.add(displayPanel);

        // create order event
        orderBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                order = new Order();
                if (order == null) {
                    JOptionPane.showMessageDialog(parentContainer, "Max orders reach!", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }
                displayPanel.removeAll();
                displayPanel.add(new JLabel("Order " + SwingConstants.CENTER), BorderLayout.NORTH);
                mediaList = new JList<Media>(new Vector<Media>(order.getItemsOrdered()));
                mediaList.setFont(new Font("monospaced", Font.PLAIN, 15));
                scrollPane = new JScrollPane(mediaList, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                        ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                displayPanel.add(scrollPane);
                displayPanel.revalidate();
                displayPanel.repaint();
            }
        });
    }
    public static void main(String[] args) {
        // Run the GUI construction in the Event-Dispatching thread for thread-safety
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AimsGUI(); // Let the constructor do the job
            }
        });
    }
}
