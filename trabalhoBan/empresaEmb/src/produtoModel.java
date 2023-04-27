import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Ryzen
 */
public class produtoModel {
    public static void create(produtoBean p, Connection con) throws SQLException {
        PreparedStatement st;
        st = con.prepareStatement("INSERT INTO produto (codigoproduto, modelo, tamanho, precoproduto, estoqueproduto, codigomaterial) VALUES (?,?,?,?,?,?)");
        st.setInt(1, p.getCodigoProduto());
        st.setString(2, p.getModelo());       
        st.setString(3, p.getTamanho());
        st.setDouble(4, p.getPrecoProduto());
        st.setInt(5, p.getEstoqueProduto());
        st.setInt(6, p.getCodigoMaterial());
        st.execute();
        st.close();
    }
    
    static HashSet listAll(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
            st = con.createStatement();
            String sql = "SELECT codigoproduto, modelo, tamanho, precoproduto, estoqueproduto, codigomaterial FROM produto";
            ResultSet result = st.executeQuery(sql);
            while(result.next()) {
                list.add(new produtoBean(result.getInt(1), result.getString(2), result.getString(3), result.getDouble(4), result.getInt(5), result.getInt(6)));
            }
        return list;
    }

    public static void update(produtoBean p, Connection con) throws SQLException {
        PreparedStatement st;
        st = con.prepareStatement("UPDATE produto SET modelo = ?, tamanho = ?, precoproduto = ?, estoqueproduto = ?, codigomaterial = ?  WHERE codigoproduto =?");
        st.setString(1, p.getModelo());       
        st.setString(2, p.getTamanho());
        st.setDouble(3, p.getPrecoProduto());
        st.setInt(4, p.getEstoqueProduto());
        st.setInt(5, p.getCodigoMaterial());
        st.setInt(6, p.getCodigoProduto());
        st.executeUpdate();
        st.close();
    }
    
    public static void delete(produtoBean p, Connection con) throws SQLException {
        PreparedStatement st;
        st = con.prepareStatement("DELETE FROM produto WHERE codigoproduto = ?");
        st.setInt(1, p.getCodigoProduto());
        st.executeUpdate();
        st.close();
    }
    
    
    static HashSet listAllWithMaterial(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
        st = con.createStatement();
        String sql = "SELECT codigoproduto, modelo, tamanho, precoproduto, estoqueproduto, produto.codigomaterial, nomematerial, qualidadematerial, estoquematerial FROM produto NATURAL JOIN material";
        ResultSet result = st.executeQuery(sql);
        while(result.next()) {
            produtoBean pb = new produtoBean(result.getInt(1), result.getString(2), result.getString(3), 
        result.getDouble(4), result.getInt(5), result.getInt(6));
            materialBean m = new materialBean(result.getInt(6), result.getString(7), result.getString(8), result.getInt(9));
            pb.setMaterial(m);
            list.add(pb);
        }
        return list;
    }
    
    static HashSet relatorioProdutoMatMed(Connection con) throws SQLException {
        //String sql = "SELECT codigoproduto, modelo, codigoMaterial FROM  produto NATURAL JOIN material WHERE qualidadematerial='mediano';;";
        Statement st;
        HashSet list = new HashSet();
            st = con.createStatement();
            String sql = "SELECT codigoproduto, modelo, codigoMaterial FROM  produto NATURAL JOIN material WHERE qualidadematerial='mediano'";
            ResultSet result = st.executeQuery(sql);
            while(result.next()) {
                list.add(new relatorioProdMatMedBean(result.getInt(1), result.getString(2), result.getInt(3)));
            }
        return list;        
        }
    /*
    static HashSet relatorioProdutoMatMed(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
        st = con.createStatement();
        String sql = "SELECT p.codigoproduto, p.modelo, p.codigoMaterial FROM  produto p JOIN material m on p.codigomaterial=m.codigomaterial WHERE qualidadematerial='mediano';";
        ResultSet result = st.executeQuery(sql);
        while(result.next()) {
            produtoBean pb = new produtoBean(result.getInt(1), result.getString(2), result.getString(3), 
        result.getDouble(4), result.getInt(5), result.getInt(6));
            materialBean m = new materialBean(result.getInt(6), result.getString(7), result.getString(8), result.getInt(9));
            pb.setMaterial(m);
            list.add(pb);
        }
        */
     
} 
