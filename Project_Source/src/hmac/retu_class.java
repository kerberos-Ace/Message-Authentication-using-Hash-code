/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class retu_class {
    
    
    
    
    public  String name_email( int id)
    {  
      String ret_val=null;
       try {
 Class.forName("com.mysql.jdbc.Driver");//loads driver
      
String url1="jdbc:mysql://localhost/hmac?user=root&password=india@123";
Connection cn; 
       
            cn = DriverManager.getConnection(url1); //connection established
                String sql = "select * from register where id='"+id+"'" ;
                PreparedStatement ps = cn.prepareStatement(sql);
               ResultSet rs = ps.executeQuery();
               if (rs.next()) {
                  
                ret_val=rs.getString(4)+"-"+rs.getString(2);
                  
                   
                   
                   
                 
                }
       } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }  
        
        
        
        return  ret_val;
        
        
    }
    
    
}
