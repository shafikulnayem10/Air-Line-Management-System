package SwingPackages;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CancelTicket extends JFrame implements ActionListener {

    private JTextField nameField;
    private JTextField flightCodeField;
    private JTextField pnrField;

    public CancelTicket() {
        // Frame setup
        setTitle("Cancel Ticket");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout(10, 10));
        setLocation(350, 150);

        // Header Panel
        JLabel headerLabel = new JLabel("Cancel Your Ticket", JLabel.CENTER);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 20));
        headerLabel.setForeground(Color.RED);
        add(headerLabel, BorderLayout.NORTH);

        // Center Panel
        JPanel centerPanel = new JPanel(new GridLayout(3, 2, 10, 10));

        // Name Field
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setForeground(Color.BLUE);
        centerPanel.add(nameLabel);
        nameField = new JTextField();
        centerPanel.add(nameField);

        // Flight Code Field
        JLabel flightCodeLabel = new JLabel("Flight Code:");
        flightCodeLabel.setForeground(Color.BLUE);
        centerPanel.add(flightCodeLabel);
        flightCodeField = new JTextField();
        centerPanel.add(flightCodeField);

        // PNR Field
        JLabel pnrLabel = new JLabel("PNR Number:");
        pnrLabel.setForeground(Color.BLUE);
        centerPanel.add(pnrLabel);
        pnrField = new JTextField();
        centerPanel.add(pnrField);

        add(centerPanel, BorderLayout.CENTER);

        // Cancel Button
        JButton cancelButton = new JButton("Cancel Ticket");
        cancelButton.addActionListener(this);
        add(cancelButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        CancelTicket cancelTicket = new CancelTicket();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Your ticket has been canceled.", "Success", JOptionPane.INFORMATION_MESSAGE);
            nameField.setText("");
            flightCodeField.setText("");
            pnrField.setText("");
    }
}

