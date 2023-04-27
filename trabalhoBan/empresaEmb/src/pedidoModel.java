import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class pedidoModel {
    public static void create(pedidoBean p, Connection con) throws SQLException {
        PreparedStatement st;
        st = con.prepareStatement("INSERT INTO pedido (codigopedido, precoPedido, metdPagamento, codigocliente, codigofuncionario, codigoProduto) VALUES (?,?,?,?,?,?)");
        st.setInt(1, p.getCodigoPedido());      
        st.setDouble(2, p.getPrecoPedido());
        st.setString(3, p.getMetdPagamento());
        st.setInt(4, p.getCodigoCliente());
        st.setInt(5, p.getCodigoFuncionario());
        st.setInt(6, p.getCodigoProduto());
        st.execute();
        st.close();
    }
    
    static HashSet listAll(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
            st = con.createStatement();
            String sql = "SELECT codigopedido, precoPedido, metdPagamento, codigoCliente, codigofuncionario, codigoProduto FROM pedido";
            ResultSet result = st.executeQuery(sql);
            while(result.next()) {
                list.add(new pedidoBean(result.getInt(1), result.getDouble(2), result.getString(3),
                        result.getInt(4), result.getInt(5), result.getInt(6)));
            }
        return list;
    }
    
    public static void update(pedidoBean p, Connection con) throws SQLException {
        PreparedStatement st;
        st = con.prepareStatement("UPDATE pedido SET precopedido=?, metdpagamento=?, codigocliente=?, codigofuncionario=?, codigoproduto=?  WHERE codigopedido =?");     
        st.setDouble(1, p.getPrecoPedido());
        st.setString(2, p.getMetdPagamento());
        st.setInt(3, p.getCodigoCliente());
        st.setInt(4, p.getCodigoFuncionario());
        st.setInt(5, p.getCodigoProduto());
        st.setInt(6, p.getCodigoPedido()); 
        st.executeUpdate();
        st.close();
    }
    
    public static void delete(pedidoBean p, Connection con) throws SQLException {
        PreparedStatement st;
        st = con.prepareStatement("DELETE FROM pedido WHERE codigopedido =?");     
        st.setInt(1, p.getCodigoPedido()); 
        st.executeUpdate();
        st.close();
    }
    
    static HashSet listAllWithCliente(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
        st = con.createStatement();
        String sql = "SELECT codigopedido, precoPedido, metdPagamento, pedido.codigoCliente, codigofuncionario, codigoproduto, "
                + "nomecliente, telefone, rua, numero, cep FROM pedido NATURAL JOIN cliente";
        ResultSet result = st.executeQuery(sql);
        while(result.next()) {
            pedidoBean pb = new pedidoBean(result.getInt(1), result.getDouble(2), result.getString(3),
                    result.getInt(4), result.getInt(5), result.getInt(6));
            clienteBean c = new clienteBean(result.getInt(4), result.getString(7), result.getLong(8), 
                    result.getString(9), result.getInt(10), result.getLong(11));
            pb.setCliente(c);
            list.add(pb);
        }
        return list;
    }
    
    
    static HashSet listAllWithFuncionario(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
        st = con.createStatement();
        String sql = "SELECT codigopedido, precoPedido, metdPagamento, codigocliente, funcionario.codigofuncionario, codigoproduto,  "
                + "nomefuncionario, telefone, email, salario  FROM pedido NATURAL JOIN funcionario";
        ResultSet result = st.executeQuery(sql);
        while(result.next()) {
            pedidoBean pb = new pedidoBean(result.getInt(1), result.getDouble(2), result.getString(3), result.getInt(4),
                    result.getInt(5), result.getInt(6));
            funcionarioBean f = new funcionarioBean(result.getInt(5), result.getString(7), result.getLong(8), 
                    result.getString(9), result.getDouble(10));
            pb.setFuncionario(f);
            list.add(pb);
        }
        return list;
    }
    
    static HashSet listAllWithProduto(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
        st = con.createStatement();
        String sql = "SELECT codigopedido, precoPedido, metdPagamento, codigocliente, codigofuncionario, produto.codigoproduto, "
                + "modelo, tamanho, precoproduto, estoqueproduto, codigomaterial  FROM pedido NATURAL JOIN produto";
        ResultSet result = st.executeQuery(sql);
        while(result.next()) {
            pedidoBean pb = new pedidoBean(result.getInt(1), result.getDouble(2), result.getString(3), result.getInt(4),
                    result.getInt(5), result.getInt(6));
            produtoBean p = new produtoBean(result.getInt(6), result.getString(7), result.getString(8), 
                    result.getDouble(9), result.getInt(10), result.getInt(11));
            pb.setProduto(p);
            list.add(pb);
        }
        return list;
    }
    
    static HashSet relatorioPedidoMurilos(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
            st = con.createStatement();
            String sql = "SELECT codigopedido, codigocliente FROM pedido NATURAL JOIN cliente WHERE nomecliente='murilo';";
            ResultSet result = st.executeQuery(sql);
            while(result.next()) {
                list.add(new relatorioPedCliMurBean(result.getInt(1), result.getInt(2)));
            }
        return list;
    }
    
    static HashSet relatorioPedidoPequeno(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
            st = con.createStatement();
            String sql = "SELECT codigopedido, codigoproduto FROM pedido NATURAL JOIN produto WHERE tamanho='pequeno';";
            ResultSet result = st.executeQuery(sql);
            while(result.next()) {
                list.add(new relatorioPedProPeqBean(result.getInt(1), result.getInt(2)));
            }
        return list;
    }
}











/*

public class pedidoModel {
    public static void create(pedidoBean p, Connection con) throws SQLException {
        PreparedStatement st;
        st = con.prepareStatement("INSERT INTO pedido (codigopedido, precoPedido, metdPagamento, codigocliente, codigofuncionario) VALUES (?,?,?,?,?)");
        st.setInt(1, p.getCodigoPedido());      
        st.setDouble(2, p.getPrecoPedido());
        st.setString(3, p.getMetdPagamento());
        st.setInt(4, p.getCodigoCliente());
        st.setInt(5, p.getCodigoFuncionario());
        st.execute();
        st.close();
    }
    
    static HashSet listAll(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
            st = con.createStatement();
            String sql = "SELECT codigopedido, precoPedido, metdPagamento, codigoCliente, codigofuncionario FROM pedido";
            ResultSet result = st.executeQuery(sql);
            while(result.next()) {
                list.add(new pedidoBean(result.getInt(1), result.getDouble(2), result.getString(3),
                        result.getInt(4), result.getInt(5)));
            }
        return list;
    }

    static HashSet listAllWithCliente(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
        st = con.createStatement();
        String sql = "SELECT codigopedido, precoPedido, metdPagamento,codigofuncionario, pedido.codigoCliente, nomecliente, telefone, rua, numero, cep FROM pedido NATURAL JOIN cliente";
        ResultSet result = st.executeQuery(sql);
        while(result.next()) {
            pedidoBean pb = new pedidoBean(result.getInt(1), result.getDouble(2), result.getString(3),
                    result.getInt(4), result.getInt(5));
            clienteBean c = new clienteBean(result.getInt(5), result.getString(6), result.getLong(7), 
                    result.getString(8), result.getInt(9), result.getLong(10));
            pb.setCliente(c);
            list.add(pb);
        }
        return list;
    }
    
    
    static HashSet listAllWithFuncionario(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
        st = con.createStatement();
        String sql = "SELECT codigopedido, precoPedido, metdPagamento, codigocliente, funcionario.codigofuncionario, nomefuncionario, telefone, email, salario FROM pedido NATURAL JOIN funcionario";
        ResultSet result = st.executeQuery(sql);
        while(result.next()) {
            pedidoBean pb = new pedidoBean(result.getInt(1), result.getDouble(2), result.getString(3), result.getInt(4),
                    result.getInt(5));
            funcionarioBean f = new funcionarioBean(result.getInt(5), result.getString(6), result.getLong(7), 
                    result.getString(8), result.getDouble(9));
            pb.setFuncionario(f);
            list.add(pb);
        }
        return list;
    } 

}
*/