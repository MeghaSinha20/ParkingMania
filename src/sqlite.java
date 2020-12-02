
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ayushi
 */
public class sqlite {
    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    
    public static Connection ConnecrDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\hp\\Documents\\NetBeansProjects\\Parking final\\p.sqlite");
           // JOptionPane.showMessageDialog(null, "Connection Successfull ");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e); 
            return null;
        }
    }
          public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
}
