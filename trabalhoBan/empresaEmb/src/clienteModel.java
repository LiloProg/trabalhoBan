import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Ryzen
 */
public class clienteModel {
    
    public static void create(clienteBean c, Connection con) throws SQLException {
        PreparedStatement st;
        st = con.prepareStatement("INSERT INTO cliente (codigocliente, nomecliente, telefone, rua, numero, cep) VALUES (?,?,?,?,?,?)");
        st.setInt(1, c.getCodigoCliente());
        st.setString(2, c.getNomeCliente());       
        st.setLong(3, c.getTelefone());
        st.setString(4, c.getRua());
        st.setInt(5, c.getNumero());
        st.setLong(6, c.getCep());
        st.execute();
        st.close();
    }
    
    static HashSet listAll(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
            st = con.createStatement();
            String sql = "SELECT codigocliente, nomecliente, telefone, rua, numero, cep FROM cliente";
            ResultSet result = st.executeQuery(sql);
            while(result.next()) {
                list.add(new clienteBean(result.getInt(1), result.getString(2), result.getLong(3), result.getString(4), result.getInt(5), result.getLong(6)));
            }
        return list;
    }
    public static void update(clienteBean c, Connection con) throws SQLException {
        PreparedStatement st;
        st = con.prepareStatement("UPDATE cliente SET nomecliente = ?, telefone = ?, rua = ?, numero = ?, cep = ? WHERE codigocliente = ?;");
        st.setString(1, c.getNomeCliente());       
        st.setLong(2, c.getTelefone());
        st.setString(3, c.getRua());
        st.setInt(4, c.getNumero());
        st.setLong(5, c.getCep());
        st.setInt(6, c.getCodigoCliente());
        st.executeUpdate();
        st.close();
    }
    
    public static void delete(clienteBean c, Connection con) throws SQLException {
        PreparedStatement st;
        st = con.prepareStatement("DELETE FROM cliente WHERE codigocliente = ?;");
        st.setInt(1, c.getCodigoCliente());
        st.executeUpdate();
        st.close();
    }

    
}
        
