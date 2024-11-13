import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankingAppGUI extends JFrame {
    private User[] users = {
            new User(412435, 7452, "Chris Sandoval", 32000),
            new User(264863, 1349, "Marc Yim", 1000)
    };
    private User loggedUser;

    private JTextField idField;
    private JPasswordField pinField;
    private JLabel statusLabel;

    public BankingAppGUI() {
        // Set up frame
        setTitle("Banking App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new CardLayout());

        // Login Panel
        JPanel loginPanel = new JPanel(new GridLayout(4, 1));
        idField = new JTextField(15);
        pinField = new JPasswordField(15);
        JButton loginButton = new JButton("Login");
        statusLabel = new JLabel("", JLabel.CENTER);

        loginPanel.add(new JLabel("User ID:"));
        loginPanel.add(idField);
        loginPanel.add(new JLabel("PIN:"));
        loginPanel.add(pinField);
        loginPanel.add(loginButton);
        loginPanel.add(statusLabel);

        // Main Panel
        JPanel mainPanel = new JPanel(new GridLayout(5, 1));
        JButton balanceButton = new JButton("Check Balance");
        JButton depositButton = new JButton("Cash-In");
        JButton transferButton = new JButton("Transfer Money");
        JButton logoutButton = new JButton("Logout");

        mainPanel.add(balanceButton);
        mainPanel.add(depositButton);
        mainPanel.add(transferButton);
        mainPanel.add(logoutButton);

        // Add panels to frame
        add(loginPanel, "login");
        add(mainPanel, "main");

        CardLayout cl = (CardLayout) getContentPane().getLayout();

        // Action Listeners
        loginButton.addActionListener(e -> {
            int id = Integer.parseInt(idField.getText());
            int pin = Integer.parseInt(new String(pinField.getPassword()));
            loggedUser = login(id, pin);
            if (loggedUser != null) {
                statusLabel.setText("Welcome, " + loggedUser.getName());
                cl.show(getContentPane(), "main");
            } else {
                statusLabel.setText("Invalid login. Try again.");
            }
        });

        balanceButton.addActionListener(e -> JOptionPane.showMessageDialog(this,
                "Current balance: " + loggedUser.getBalance()));

        depositButton.addActionListener(e -> {
            String amountStr = JOptionPane.showInputDialog(this, "Enter amount to deposit:");
            double amount = Double.parseDouble(amountStr);
            loggedUser.deposit(amount);
            JOptionPane.showMessageDialog(this, "Deposit successful. New balance: " + loggedUser.getBalance());
        });

        transferButton.addActionListener(e -> {
            String recipientIdStr = JOptionPane.showInputDialog(this, "Enter recipient User ID:");
            int recipientId = Integer.parseInt(recipientIdStr);
            String amountStr = JOptionPane.showInputDialog(this, "Enter amount to transfer:");
            double amount = Double.parseDouble(amountStr);

            User recipient = findUserById(recipientId);
            if (recipient != null) {
                loggedUser.transfer(recipient, amount);
                JOptionPane.showMessageDialog(this, "Transfer successful.");
            } else {
                JOptionPane.showMessageDialog(this, "Recipient not found.");
            }
        });

        logoutButton.addActionListener(e -> {
            loggedUser = null;
            idField.setText("");
            pinField.setText("");
            statusLabel.setText("");
            cl.show(getContentPane(), "login");
        });
    }

    private User login(int id, int pin) {
        for (User user : users) {
            if (user.getId() == id && user.getPin() == pin) {
                return user;
            }
        }
        return null;
    }

    private User findUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BankingAppGUI app = new BankingAppGUI();
            app.setVisible(true);
        });
    }
}
