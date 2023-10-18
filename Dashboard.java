package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    
    Dashboard(){
        setBounds(0, 0, 1550, 1000);
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 1000);
        add(image);
        
        JLabel text = new JLabel("THE NAGOOR GROUP WELCOMES YOU");
        text.setBounds(400, 80, 8000, 50);
        text.setFont(new Font("Tahoma", Font.PLAIN, 45));
        text.setForeground(Color.WHITE);
        image.add(text);
        
        JMenuBar mb = new JMenuBar();
        mb.setBounds(0, 0, 1550, 30);
        image.add(mb);
        
        JMenu hotel = new JMenu("HOTEL MANAGEMENT");
        hotel.setForeground(Color.RED);   
        mb.add(hotel);
        
        JMenuItem reception = new JMenuItem("RECEPTION");
        reception.addActionListener(this);
        hotel.add(reception);
        
        
        JMenu admin = new JMenu("ADMIN");
        admin.setForeground(Color.GREEN);   
        mb.add(admin);
        
        JMenuItem addemployee = new JMenuItem("ADD EMPLOYEE");
        addemployee.addActionListener(this);
        admin.add(addemployee);
        
        JMenuItem addrooms = new JMenuItem("ADD ROOMS");
        addrooms.addActionListener(this);
        admin.add(addrooms);
        
        JMenuItem adddrives = new JMenuItem("ADD DRIVERS");
        adddrives.addActionListener(this);
        admin.add(adddrives);
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getActionCommand().equals("ADD EMPLOYEE")){
            new AddEmployee();
        } else if(ae.getActionCommand().equals("ADD ROOMS")){
            new AddRooms();
            
        }else if(ae.getActionCommand().equals("ADD DRIVERS")){
            new AddDriver();
        }else if(ae.getActionCommand().equals("RECEPTION")){
            new Reception();
        }
    }
    
    public static void main(String[] args){
        new Dashboard();
    }
    
}
