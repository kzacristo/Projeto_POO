
package model;

import controller.Jogador;
import controller.Time;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.*;

public class JogadorDAO {
    
     public interface jogadorDAO{
        
        jogadorDAO create();
        
        void insert(jogadorDAO inserir);
        void update(jogadorDAO atualiza);
        void delete(jogadorDAO deleta);
        
         JogadorDAO findByID (Integer id);
         JogadorDAO finfByCustomerNumber ( String customerNumber ) ;
         
    }
    
    public class JDBCjogadorDAO extends JogadorDAO{
        
        public JogadorDAO create(){
            return new JogadorDAO();
            
         }
        public void inserir(Jogador novoJogador){
            
            try{    
                
                    ConnectFactori connect = new ConnectFactori();               
                
                    Statement st = connect.createStatement();
                    String insert = "INSERT INTO times VALUES (?,?,?,?,?,?,?);";
                   
                    PreparedStatement dic = (PreparedStatement) connect.prepareStatement(insert);
                    
                    dic.setInt(1,novoJogador.getCodigo());
                    dic.setString(2,novoJogador.getNome());
                    dic.setString(3,novoJogador.getRg());
                    dic.setString(4,novoJogador.getNomeTime());
                    dic.setString(5,novoJogador.getSigla());
                    dic.setString(6,novoJogador.getCpf());
                    dic.setString(7,novoJogador.getTelefone());
                    dic.setInt(8,novoJogador.getNumeroCamisa());
                    dic.setString(9,novoJogador.getEndereco());
  
                    dic.setInt(1,novoJogador.getInscrisao());
                    dic.setString(2,novoJogador.getNomeTime());
                    dic.setString(3,novoJogador.getSigla());
                    
                
                    
                    
            }catch(SQLException ex){
                Logger.getLogger(Time.class.getName()).log(Level.SEVERE, null, ex);
            }   
         }
        
        
    }
}
