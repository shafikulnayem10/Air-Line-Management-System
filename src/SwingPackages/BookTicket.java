package SwingPackages;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookTicket extends JFrame implements ActionListener{

     JLabel headerLabel;
     JLabel fromLabel;
     JLabel toLabel;
     JLabel tripTypeLabel;
     JLabel passengersLabel;
     JLabel adressLabel ;
     JLabel nameLabel;
     JButton bookButton;
    JTextField nameField,addressField;
    
    public BookTicket() {
        // Frame setup
        setTitle("Book Ticket");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(600, 400);
        setLayout(new BorderLayout(10, 10));
        setLocation(350, 150);

        // Header Panel
        headerLabel = new JLabel("Book Your Ticket", JLabel.CENTER);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 20));
        headerLabel.setForeground(Color.BLUE);
        add(headerLabel, BorderLayout.NORTH);

        // Center Panel
        JPanel centerPanel = new JPanel(new GridLayout(6, 2, 10, 10));

        // From ComboBox
        fromLabel = new JLabel("From:");
        fromLabel.setForeground(Color.RED);
        centerPanel.add(fromLabel);
        JComboBox<String> fromComboBox = new JComboBox<>(new String[]{"Dhaka", "Chittagong", "Sylhet"});
        fromComboBox.setBackground(Color.LIGHT_GRAY);
        fromComboBox.setForeground(Color.BLUE);
        centerPanel.add(fromComboBox);

        // To ComboBox
        toLabel = new JLabel("To:");
        toLabel.setForeground(Color.GREEN);
        centerPanel.add(toLabel);
        JComboBox<String> toComboBox = new JComboBox<>(new String[]{"Chittagong", "Sylhet", "Dhaka"});
        toComboBox.setBackground(Color.LIGHT_GRAY);
        toComboBox.setForeground(Color.BLUE);
        centerPanel.add(toComboBox);

        // Trip Type
        tripTypeLabel = new JLabel("Trip Type:");
        tripTypeLabel.setForeground(Color.MAGENTA);
        centerPanel.add(tripTypeLabel);
        JComboBox<String> tripTypeComboBox = new JComboBox<>(new String[]{"One Way", "Round Trip"});
        tripTypeComboBox.setBackground(Color.LIGHT_GRAY);
        tripTypeComboBox.setForeground(Color.BLUE);
        centerPanel.add(tripTypeComboBox);

        // Departing Date
        nameLabel = new JLabel("Name:");
        nameLabel.setForeground(Color.ORANGE);
        centerPanel.add(nameLabel);
        nameField = new JTextField();
        centerPanel.add(nameField);
        //nameField.addActionListener(this); 

        // Returning Date
        adressLabel = new JLabel("Address:");
        adressLabel.setForeground(Color.CYAN);
        centerPanel.add(adressLabel);
        addressField = new JTextField();
        centerPanel.add(addressField);
        

        // Passenger Count
        passengersLabel = new JLabel("Passengers:");
        passengersLabel.setForeground(Color.PINK);
        centerPanel.add(passengersLabel);
        JComboBox<String> passengerComboBox = new JComboBox<>(new String[]{"1", "2", "3", "4"});
        passengerComboBox.setBackground(Color.LIGHT_GRAY);
        passengerComboBox.setForeground(Color.BLUE);
        centerPanel.add(passengerComboBox);

        add(centerPanel, BorderLayout.CENTER);

        // Search Button
        bookButton = new JButton("Book Flight");
        bookButton.addActionListener(this);
        add(bookButton, BorderLayout.SOUTH);
        
        setVisible(true);
    }

    public static void main(String[] args) {
         BookTicket bookTicket = new BookTicket();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Your ticket is booked!", "Success", JOptionPane.INFORMATION_MESSAGE);
         nameField.setText("");
         addressField.setText("");
        
    }
}