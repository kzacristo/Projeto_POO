
package model;

import controller.Time;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.*;

public class TimesDAO {
    
    public interface timesDAO{
        
        timesDAO create();
        
        void insert(timesDAO inserir);
        void update(timesDAO atualiza);
        void delete(timesDAO deleta);
        
         TimesDAO findByID (Integer id);
         TimesDAO finfByCustomerNumber ( String customerNumber ) ;
         
    }
    
    public class JDBCtimesDAO extends TimesDAO{
        
        public TimesDAO create(){
            return new TimesDAO();
            
         }
        public void inserir(Time novoTime){
            
            try{                    
                    ConnectFactori connect = new ConnectFactori();               
                
                    Statement st = connect.createStatement();
                    String insert = "INSERT INTO times VALUES (?,?,?);";
                   
                    PreparedStatement dic = (PreparedStatement) connect.prepareStatement(insert);
                    
                    dic.setInt(1,novoTime.getInscrisao());                  
                    dic.setString(2,novoTime.getNomeTime());
                    dic.setString(3,novoTime.sigla);

                    
            }catch(SQLException ex){
                Logger.getLogger(Time.class.getName()).log(Level.SEVERE, null, ex);
            }   
         }
        
        
    }
}
