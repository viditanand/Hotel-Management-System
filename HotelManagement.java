// Main Frame

package hotel.management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HotelManagement extends JFrame implements ActionListener{
    public HotelManagement(){
    setBounds(200,90,800,600);
    ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("hotel/management/images/frist.jpg"));
    //image reduce
    
    Image i2 = img.getImage().getScaledInstance(800,600,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
    
    
    //upto this
        JLabel img2 = new JLabel(i3); 
        img2.setBounds(0,0,800,600);
        add(img2);
    JLabel l2= new JLabel("Hotel Management System");
       l2.setBounds(20, 500, 500, 60);
       l2.setForeground(Color.white); 
       l2.setFont(new Font("serif",Font.PLAIN,30));
       img2.add(l2);
    JButton b1=new JButton("Next");
       b1.setForeground(Color.white); 
       b1.setFont(new Font("serif",Font.PLAIN,25));
       b1.setOpaque(false);
       b1.setContentAreaFilled(false);
       b1.setBorderPainted(false);
       //b1.setBorder(null);
       b1.setForeground(Color.white);
       b1.setBounds(630,500,100,70);
       img2.add(b1);
       b1.addActionListener(this);
        
    
    setLayout(null);
    setVisible(true);
    
    while(true){
      l2.setVisible(false);
      try{
         Thread.sleep(500);
       }catch(Exception e){}
      l2.setVisible(true);
      try{
          Thread.sleep(500);
      }catch(Exception e){}
    
     
    
    }
     
    
    }
    public void actionPerformed(ActionEvent e){  
    new login().setVisible(true);
    this.setVisible(false);
    }
    
    public static void main(String[] args) {
        //System.out.println("Let try one more time");
        new HotelManagement();
    } 
      
}
