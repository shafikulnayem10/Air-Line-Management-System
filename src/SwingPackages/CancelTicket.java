package SwingPackages;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CancelTicket extends JFrame implements ActionListener {

    private JTextField nameField, flightCodeField, pnrField;

    public CancelTicket() {
        // Frame setup
        setTitle("Cancel Ticket");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Header
        JLabel headerLabel = new JLabel("Cancel Your Ticket", JLabel.CENTER);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 20));
        headerLabel.setForeground(Color.RED);
        add(headerLabel, BorderLayout.NORTH);

        // Center Panel
        JPanel centerPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setForeground(Color.GREEN);
        nameField = new JTextField();
        nameField.setBackground(Color.ORANGE);
        JLabel flightCodeLabel = new JLabel("Flight Code:");
        flightCodeLabel.setForeground(Color.GREEN);
        flightCodeField = new JTextField();
        flightCodeField.setBackground(Color.red);
        JLabel pnrLabel = new JLabel("PNR Number:");
        pnrLabel.setForeground(Color.GREEN);
        pnrField = new JTextField();
        pnrField.setBackground(Color.CYAN);
        centerPanel.add(nameLabel);
        centerPanel.add(nameField);
        centerPanel.add(flightCodeLabel);
        centerPanel.add(flightCodeField);
        centerPanel.add(pnrLabel);
        centerPanel.add(pnrField);

        add(centerPanel, BorderLayout.CENTER);

        // Icon Panel
        ImageIcon icon = new ImageIcon(getClass().getResource("cancelticketicon.png"));
        JLabel iconLabel = new JLabel(new ImageIcon(icon.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
        JPanel iconPanel = new JPanel();
        iconPanel.add(iconLabel);
        add(iconPanel, BorderLayout.EAST);

        // Cancel Button
        JButton cancelButton = new JButton("Cancel Ticket");
        cancelButton.addActionListener(this);
        add(cancelButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "Your ticket has been canceled!", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
        nameField.setText("");
        flightCodeField.setText("");
        pnrField.setText("");
    }

    public static void main(String[] args) {
        new CancelTicket();
    }
}
