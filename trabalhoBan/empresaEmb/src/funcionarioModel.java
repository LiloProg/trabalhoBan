import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class funcionarioModel {
    public static void create(funcionarioBean f, Connection con) throws SQLException {
        PreparedStatement st;
        st = con.prepareStatement("INSERT INTO funcionario (codigofuncionario, nomefuncionario, telefone, email, salario) VALUES (?,?,?,?,?)");
        st.setInt(1, f.getCodigoFuncionario());
        st.setString(2, f.getNomeFuncionario());       
        st.setLong(3, f.getTelefone());
        st.setString(4, f.getEmail());
        st.setDouble(5, f.getSalario());
        st.execute();
        st.close();
    }
    
    static HashSet listAll(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
            st = con.createStatement();
            String sql = "SELECT codigofuncionario, nomefuncionario, telefone, email, salario FROM funcionario";
            ResultSet result = st.executeQuery(sql);
            while(result.next()) {
                list.add(new funcionarioBean(result.getInt(1), result.getString(2), result.getLong(3), result.getString(4), result.getDouble(5)));
            }
        return list;
    }
    
    public static void update(funcionarioBean f, Connection con) throws SQLException {
        PreparedStatement st;
        st = con.prepareStatement("UPDATE funcionario SET nomefuncionario=?, telefone =?, email = ?, salario = ?  WHERE codigofuncionario =?");
        st.setString(1, f.getNomeFuncionario());       
        st.setLong(2, f.getTelefone());
        st.setString(3, f.getEmail());
        st.setDouble(4, f.getSalario());
        st.setInt(5, f.getCodigoFuncionario());        
        st.executeUpdate();
        st.close();
    }
    
    public static void delete(funcionarioBean f, Connection con) throws SQLException {
        PreparedStatement st;
        st = con.prepareStatement("DELETE FROM funcionario WHERE codigofuncionario = ?");
        st.setInt(1, f.getCodigoFuncionario());        
        st.executeUpdate();
        st.close();
    }
    
}
