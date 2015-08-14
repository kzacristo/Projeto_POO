

package Campeonato;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConnectFactori{
    
    public static Connection getPostgresSQLConnection(){
        Connection con = null;
        
        try{
            
            Class.forName("org.postgresql.Driver");      
            
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/campeonatoIFSP","postgres","0");
        
        }
        catch(Exception Ex){
            
            System.out.println("Não estabelecido coneção");
        };
        
        return con;
    }
    
    
    
}

