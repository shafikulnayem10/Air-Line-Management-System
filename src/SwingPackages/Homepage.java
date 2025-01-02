
package SwingPackages;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;

public class Homepage extends JFrame implements ActionListener{
    private final ImageIcon bdFlag;
    private final ImageIcon logoIcon;
    private final ImageIcon airplaneIcon;
    private final JPanel headerPanel;
    private final JLabel logoLabel;
    private final JLabel AirPlaneIconLabel;
    private final JLabel importantTextLabel;
    private final JLabel messageLabel;
    private final  JPanel messagePanel;
    private final Font f ;
    private final Cursor cursor;
    private final ImageIcon backgroundIcon;
    private final JPanel backgroundPanel;
    private final JButton bookTicketButton,ourSkiesButton,holidaysButton,helpButton ,addDetailsButton;
    private final JToggleButton cancelTicketButton; // Toggle Button for Cancel Ticket


    public Homepage()  {
        // frame creation starts here
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bdFlag = new ImageIcon(getClass().getResource("bdflag.png"));
        this.setIconImage(bdFlag.getImage());
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setTitle("BD");
        this.setLayout(new BorderLayout(20, 15));
       //frame creaton ends here
        
       // Header starts here
        headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(Color.WHITE);
        headerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        Border border= BorderFactory.createLineBorder(Color.BLUE,3);
                

        // Us-BanglaLogo in Left side 
        logoIcon = new ImageIcon(getClass().getResource("USBANGLAICON.png")); 
        logoLabel = new JLabel(logoIcon);
        headerPanel.add(logoLabel, BorderLayout.WEST);

        // Center Panel for "Important Text" section
         messagePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        messagePanel.setBackground(Color.WHITE);

        // Airplane Icon
        airplaneIcon = new ImageIcon(getClass().getResource("AirPlaneIcon.png")); 
        AirPlaneIconLabel = new JLabel(airplaneIcon);
        AirPlaneIconLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));

        // "Important" Text section
        importantTextLabel = new JLabel("Important");
        importantTextLabel.setFont(new Font("Arial", Font.BOLD, 24));
        importantTextLabel.setForeground(color.dark); // Dark red color

        // Message Text section
        messageLabel = new JLabel("Enjoy SELF CHECK-IN KIOSK in domestic terminal");
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 24));
        messageLabel.setForeground(Color.BLACK);

        // Adding AirpalneUcon and Messgaes in the message panel
        messagePanel.add(AirPlaneIconLabel);
        messagePanel.add(importantTextLabel);
        messagePanel.add(messageLabel);

        // Adding the message panel in the center of the header
        headerPanel.add(messagePanel, BorderLayout.CENTER);
        headerPanel.setBorder(border);

        // Add the header panel to the frame
        this.add(headerPanel, BorderLayout.NORTH);
        //header section ends here
        
        
       
        // Menu bar section starts here
        // Custom panel with background image
         backgroundIcon = new ImageIcon(getClass().getResource("AirPlanePic.jpg"));
         backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundIcon.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        backgroundPanel.setLayout(new GridLayout(1, 4)); // Grid layout for buttons

        // Font and cursor
        f = new Font("Arial", Font.BOLD, 18);
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // Creating and styling individual buttons
        bookTicketButton = new JButton("BOOK TICKET");
        bookTicketButton.setFont(f);
        bookTicketButton.setCursor(cursor);
        bookTicketButton.setForeground(Color.WHITE);
        bookTicketButton.setBackground(new Color(0, 0, 0, 100)); // Semi-transparent black
        bookTicketButton.setBorderPainted(false);
        bookTicketButton.setFocusPainted(false);
        bookTicketButton.setOpaque(false);
        bookTicketButton.addActionListener(this);
        bookTicketButton.setBorder(border);
        

         // Creating the toggle button for "Cancel Ticket"
        cancelTicketButton = new JToggleButton("CANCEL TICKET");
        cancelTicketButton.setFont(f);
        cancelTicketButton.setCursor(cursor);
        cancelTicketButton.setForeground(Color.WHITE);
        cancelTicketButton.setBackground(new Color(255, 0, 0, 150)); // Semi-transparent red
        cancelTicketButton.setBorderPainted(false);
        cancelTicketButton.setFocusPainted(false);
        cancelTicketButton.setOpaque(false);
        cancelTicketButton.setVisible(false); // Initially hidden
        cancelTicketButton.addActionListener(this);

        

        ourSkiesButton = new JButton("OUR SKIES");
        ourSkiesButton.setFont(f);
        ourSkiesButton.setCursor(cursor);
        ourSkiesButton.setForeground(Color.WHITE);
        ourSkiesButton.setBackground(new Color(0, 0, 0, 100));
        ourSkiesButton.setBorderPainted(false);
        ourSkiesButton.setFocusPainted(false);
        ourSkiesButton.setOpaque(false);
        ourSkiesButton.addActionListener(this);

        
        holidaysButton = new JButton("HOLIDAYS");
        holidaysButton.setFont(f);
        holidaysButton.setCursor(cursor);
        holidaysButton.setForeground(Color.WHITE);
        holidaysButton.setBackground(new Color(0, 0, 0, 100));
        holidaysButton.setBorderPainted(false);
        holidaysButton.setFocusPainted(false);
        holidaysButton.setOpaque(false);
        holidaysButton.addActionListener(this);
        
       addDetailsButton = new JButton("ADD DETAILS");
        addDetailsButton.setFont(f);
        addDetailsButton.setCursor(cursor);
        addDetailsButton.setForeground(Color.WHITE);
     addDetailsButton.setBackground(new Color(0, 0, 0, 100));
       addDetailsButton.setBorderPainted(false);
       addDetailsButton.setFocusPainted(false);
       addDetailsButton.setOpaque(false);
        addDetailsButton.addActionListener(this);
        
        
        
        
        
        
        helpButton = new JButton("HELP");
        helpButton.setFont(f);
        helpButton.setCursor(cursor);
        helpButton.setForeground(Color.WHITE);
        helpButton.setBackground(new Color(0, 0, 0, 100));
        helpButton.setBorderPainted(false);
        helpButton.setFocusPainted(false);
        helpButton.setOpaque(false);
        helpButton.addActionListener(this);
        
        
       

       
        
        
        
        // Adding buttons to the background panel
        backgroundPanel.add(bookTicketButton);
        backgroundPanel.add(ourSkiesButton);
        backgroundPanel.add(holidaysButton);
        backgroundPanel.add(helpButton);
         backgroundPanel.add(addDetailsButton);
       // Adding the toggle button separately
        backgroundPanel.add(cancelTicketButton);

        // Add the background panel to the frame
        this.add(backgroundPanel, BorderLayout.CENTER);
        
        // Menu bar section ends here
        
        
    }

    public static void main(String[] args) {
        Homepage home = new Homepage();
        home.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = e.getActionCommand();
         JOptionPane.showMessageDialog(null,text+"button clicked!");
      if(text.equals("BOOK TICKET")){
           new BookTicket();
           cancelTicketButton.setVisible(true); // Show the toggle button after booking
          }
       /* if(text.equals("HOLIDAYS")){
           new HoliDays();
          }
         if(text.equals("OUR SKIES")){
             new OurSkies();
         }
         if(text.equals("HELP")){
             new Help();
         }*/
         if(text.equals("CANCEL TICKET")){
             new CancelTicket();
         }
        /*if(text.equals("ADD DETAILS")){
             new AddDetails();
         }*/
         
         }
}
