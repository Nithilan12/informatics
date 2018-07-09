/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
import java.sql.*;

import javax.swing.JOptionPane;
public class connect {
    Connection con;

public static Connection ConnecrDb(){
    try {

     {Class.forName("java.sql.DriverManager");
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ipproject","root","Minecraft123");
      return con;
       }
    }catch(Exception e) {
        JOptionPane.showMessageDialog(null, e);
    return null;
    }

    }

}
