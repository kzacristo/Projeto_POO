

package model;

import java.sql.*;

public class ConnectFactori{
    
    @SuppressWarnings("empty-statement")
    public static Connection getPostgresSQLConnection(){
        Connection connect = null;
        
        try{
            
            Class.forName("org.postgresql.Driver");      
            
            connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/campeonatoIFSP","postgres","0");
        
        }
        catch(ClassNotFoundException | SQLException Ex){
            
            System.out.println("Não estabelecido coneção");
        };
        
        return connect;
    }

    

   
    
    
    
}

