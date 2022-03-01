package bin;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.net.Socket;
import javax.swing.*;
import java.awt.*;
public class ATM extends JFrame{
    public static void main(String[] argv) {
        EventQueue.invokeLater(()->{
            ATM windows = new ATM();
            windows.setVisible(true);
            windows.setResizable(false);
            windows.setSize(500,500);
            windows.setTitle("Chat inside by d3vj0e Grazie! see more in github");
            windows.setDefaultCloseOperation(EXIT_ON_CLOSE);
        });
    }

    //add components
    public ATM(){
        //setting all tools
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
        Font fontWelcome = new Font("Serif",Font.BOLD,20);
        JLabel welcomeTag = new JLabel();
        JLabel username  = new JLabel("user name");
        JLabel userpassword = new JLabel("user password");
        JTextField userName = new JTextField();
        JPasswordField userPassword = new JPasswordField();
        JButton buttonLogin = new JButton("Login");


        welcomeTag.setText("WELCOME TO CHAT INSIDE BY d3vj0e");
        welcomeTag.setFont(fontWelcome);
        welcomeTag.setSize(500,100);
        welcomeTag.setHorizontalAlignment(JLabel.CENTER);
        welcomeTag.setVerticalAlignment(JLabel.TOP);
        panel.add(welcomeTag);

        username.setBounds(150,120,80,30);
        userName.setBounds(150,150,200,30);
        userName.setToolTipText("User name");
        userName.requestFocus();
        panel.add(userName);
        panel.add(username);

        userpassword.setBounds(150,170,150,30);
        userPassword.setBounds(150,200,200,30);
        userPassword.setToolTipText("User password");
        panel.add(userPassword);
        panel.add(userpassword);

        buttonLogin.setBounds(200,240,90,30);
        buttonLogin.addActionListener(e->{
            
        });
        panel.add(buttonLogin);

    }
}
