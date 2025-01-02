package SwingPackages;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookTicket extends JFrame implements ActionListener {
    private JTextField nameField, addressField;
    private JComboBox<String> fromComboBox, toComboBox, tripTypeComboBox;
    private JButton bookButton;

    public BookTicket() {
        // Frame setup
        setTitle("Book Ticket");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // Icon Panel with Resized Icon
        JPanel iconPanel = new JPanel(new BorderLayout());
        ImageIcon originalIcon = new ImageIcon(getClass().getResource("bookflighticon.png"));
        Image scaledImage = originalIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(scaledImage);
        JLabel iconLabel = new JLabel(resizedIcon, JLabel.CENTER);
        iconPanel.add(iconLabel, BorderLayout.CENTER);
        add(iconPanel, BorderLayout.WEST);

        // Form Panel
        JPanel formPanel = new JPanel(new GridLayout(6, 2, 10, 10));

        // Label Styling
        Font labelFont = new Font("Arial", Font.BOLD, 14);
        Color labelColor = Color.GREEN;

        // FROM ComboBox
        JLabel fromLabel = new JLabel("From:");
        fromLabel.setFont(labelFont);
        fromLabel.setForeground(Color.GREEN);
        formPanel.add(fromLabel);
        fromComboBox = new JComboBox<>(new String[]{"Dhaka", "Chittagong", "Sylhet"});
        fromComboBox.setBackground(Color.cyan);
        formPanel.add(fromComboBox);

        // TO ComboBox
        JLabel toLabel = new JLabel("To:");
        toLabel.setFont(labelFont);
        toLabel.setForeground(Color.GREEN);
        formPanel.add(toLabel);
        toComboBox = new JComboBox<>(new String[]{"Chittagong", "Sylhet", "Dhaka"});
        toComboBox.setBackground(Color.ORANGE);
        formPanel.add(toComboBox);

        // Trip Type ComboBox
        JLabel tripTypeLabel = new JLabel("Trip Type:");
        tripTypeLabel.setFont(labelFont);
        tripTypeLabel.setForeground(Color.GREEN);
        formPanel.add(tripTypeLabel);
        tripTypeComboBox = new JComboBox<>(new String[]{"One Way", "Round Trip"});
        tripTypeComboBox.setBackground(Color.cyan);
        formPanel.add(tripTypeComboBox);

        // Name Field
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setFont(labelFont);
        nameLabel.setForeground(Color.GREEN);
        formPanel.add(nameLabel);
        nameField = new JTextField();
        formPanel.add(nameField);
        nameField.setBackground(Color.MAGENTA);

        // Address Field
        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setForeground(Color.GREEN);
        addressLabel.setFont(labelFont);
        
        formPanel.add(addressLabel);
        addressField = new JTextField();
        addressField.setBackground(Color.orange);
        formPanel.add(addressField);

        // Book Button 
        bookButton = new JButton("Book Flight");
        bookButton.setFont(new Font("Arial", Font.BOLD, 16));
        bookButton.setBackground(Color.BLUE);
        bookButton.setForeground(Color.WHITE);
        bookButton.setFocusPainted(false);
        bookButton.setBorder(BorderFactory.createRaisedBevelBorder());
        bookButton.addActionListener(this);
        formPanel.add(new JLabel()); // Empty space for alignment
        formPanel.add(bookButton);

        add(formPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bookButton) {
            JOptionPane.showMessageDialog(
                this,
                "Your ticket is booked!\n" +
                "From: " + fromComboBox.getSelectedItem() + "\n" +
                "To: " + toComboBox.getSelectedItem() + "\n" +
                "Trip Type: " + tripTypeComboBox.getSelectedItem(),
                "Success",
                JOptionPane.INFORMATION_MESSAGE
            );
            nameField.setText("");
            addressField.setText("");
        }
    }

    public static void main(String[] args) {
        new BookTicket();
    }
}
