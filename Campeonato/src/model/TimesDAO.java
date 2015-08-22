package model;

import controller.Time;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.*;
import org.postgresql.core.ConnectionFactory;
import view.JFCadastroFuncionario;

public class TimesDAO {

    public interface timesDAO {

        timesDAO create();

        void insert(timesDAO inserir);

        void update(timesDAO atualiza);

        void delete(timesDAO deleta);

        TimesDAO findByID(Integer id);

        TimesDAO finfByCustomerNumber(String customerNumber);

    }

    public class JDBCtimesDAO extends TimesDAO {

        public TimesDAO create() {
            return new TimesDAO();

        }

        public void inserir(Time novoTime) throws SQLException {
            try {
                Connection connec = ConnectFactori.getPostgresSQLConnection();

                Statement st = connec.createStatement();

                String insert = "INSERT INTO club VALUES (?,?,?);";

                PreparedStatement sql = connec.prepareStatement(insert);

                sql.setString(1, novoTime.getNomeTime());
                sql.setString(2, novoTime.getSigla());
                sql.setInt(3, novoTime.getInscrisao());

            } catch (SQLException ex) {
                Logger.getLogger(Time.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        public void update(Time updateTime) throws SQLException {

            String nomeNovo = JFCadastroFuncionario.jtfNome.getText();

            try {

                Connection connec = ConnectFactori.getPostgresSQLConnection();

                Statement st = connec.createStatement();

                String update = "UPDATE club"
                              + "SET c_nome = ?"
                              + "WHERE c_nome = ?";

                PreparedStatement stm = connec.prepareStatement(update);

                stm.setString(1, nomeNovo);
                stm.setString(2, updateTime.getNomeTime());

            } catch (SQLException ex) {
                Logger.getLogger(Time.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
