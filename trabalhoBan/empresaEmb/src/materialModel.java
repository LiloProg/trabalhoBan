import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class materialModel {
    public static void create(materialBean m, Connection con) throws SQLException {
        PreparedStatement st;
        st = con.prepareStatement("INSERT INTO material (codigomaterial, nomematerial, qualidadematerial, estoquematerial) VALUES (?,?,?,?)");
        st.setInt(1, m.getCodigoMaterial());
        st.setString(2, m.getNomeMaterial());       
        st.setString(3, m.getQualidadeMaterial());
        st.setInt(4, m.getEstoqueMaterial());
        st.execute();
        st.close();
    }
    
    static HashSet listAll(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
            st = con.createStatement();
            String sql = "SELECT codigomaterial, nomematerial, qualidadematerial, estoquematerial FROM material";
            ResultSet result = st.executeQuery(sql);
            while(result.next()) {
                list.add(new materialBean(result.getInt(1), result.getString(2), result.getString(3), result.getInt(4)));
            }
        return list;
    }

    public static void update(materialBean m, Connection con) throws SQLException {
        PreparedStatement st;
        st = con.prepareStatement("UPDATE material SET nomematerial=?, qualidadematerial =?, estoquematerial = ? WHERE codigomaterial = ?");
        st.setString(1, m.getNomeMaterial());       
        st.setString(2, m.getQualidadeMaterial());
        st.setInt(3, m.getEstoqueMaterial());
        st.setInt(4, m.getCodigoMaterial());
        st.executeUpdate();
        st.close();
    }

    public static void delete(materialBean m, Connection con) throws SQLException {
        PreparedStatement st;
        st = con.prepareStatement("DELETE FROM material WHERE codigomaterial = ?");
        st.setInt(1, m.getCodigoMaterial());
        st.executeUpdate();
        st.close();
    }  
}
