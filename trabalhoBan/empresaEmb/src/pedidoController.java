import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class pedidoController {
    public void createPedido(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para registrar um pedido: ");
        System.out.print("Codigo do pedido: ");
        int codigoPedido = input.nextInt();
        System.out.print("Preço do pedido: ");
        double precoPedido = input.nextDouble();
        System.out.print("Método de pagamento: ");
        String metdPagamento = input.next();
        System.out.print("Codigo do cliente: ");
        int codigoCliente = input.nextInt();
        System.out.print("Codigo do funcionario: ");
        int codigoFuncionario = input.nextInt();
        System.out.print("Codigo do produto: ");
        int codigoProduto = input.nextInt();
        pedidoBean pb = new pedidoBean(codigoPedido, precoPedido, metdPagamento, codigoCliente, codigoFuncionario, codigoProduto);
        pedidoModel.create(pb, con);
        System.out.println("Pedido registrado com sucesso");
    }    
    
    public void listarPedido(Connection con) throws SQLException {
        HashSet all = pedidoModel.listAll(con);
        Iterator<pedidoBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    } 
    
    
    
    
    public void updatePedido(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para atualizar um pedido: ");
        System.out.print("Codigo do pedido: ");
        int codigoPedido = input.nextInt();
        System.out.print("Preço do pedido: ");
        double precoPedido = input.nextDouble();
        System.out.print("Método de pagamento: ");
        String metdPagamento = input.next();
        System.out.print("Codigo do cliente: ");
        int codigoCliente = input.nextInt();
        System.out.print("Codigo do funcionario: ");
        int codigoFuncionario = input.nextInt();
        System.out.print("Codigo do produto: ");
        int codigoProduto = input.nextInt();
        pedidoBean pb = new pedidoBean(codigoPedido, precoPedido, metdPagamento, codigoCliente, codigoFuncionario, codigoProduto);
        pedidoModel.update(pb, con);
        System.out.println("Pedido atualizado com sucesso");
    }   
    
    public void deletePedido(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para deletar um pedido: ");
        System.out.print("Codigo do pedido: ");
        int codigoPedido = input.nextInt();
        System.out.print("Preço do pedido: ");
        double precoPedido = input.nextDouble();
        System.out.print("Método de pagamento: ");
        String metdPagamento = input.next();
        System.out.print("Codigo do cliente: ");
        int codigoCliente = input.nextInt();
        System.out.print("Codigo do funcionario: ");
        int codigoFuncionario = input.nextInt();
        System.out.print("Codigo do produto: ");
        int codigoProduto = input.nextInt();
        pedidoBean pb = new pedidoBean(codigoPedido, precoPedido, metdPagamento, codigoCliente, codigoFuncionario, codigoProduto);
        pedidoModel.delete(pb, con);
        System.out.println("Pedido deletado com sucesso");
    }
    
    void listarPedidoCliente(Connection con) throws SQLException {
        HashSet all = pedidoModel.listAllWithCliente(con);
        Iterator<pedidoBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
    
    void listarPedidoFuncionario(Connection con) throws SQLException {
        HashSet all = pedidoModel.listAllWithFuncionario(con);
        Iterator<pedidoBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
    
    void listarPedidoProduto(Connection con) throws SQLException {
        HashSet all = pedidoModel.listAllWithProduto(con);
        Iterator<pedidoBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
    //
    void relatorioPedidoMurilos(Connection con) throws SQLException {
        HashSet all = pedidoModel.relatorioPedidoMurilos(con);
        Iterator<relatorioPedCliMurBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toStringRel());
        }
    }
    
    void relatorioPedidoPequeno(Connection con) throws SQLException {
        HashSet all = pedidoModel.relatorioPedidoPequeno(con);
        Iterator<relatorioPedProPeqBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toStringRel2());
        }
    }
}


/*
public class pedidoController {
    public void createPedido(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para registrar um pedido: ");
        System.out.print("Codigo do pedido: ");
        int codigoPedido = input.nextInt();
        System.out.print("Preço do pedido: ");
        double precoPedido = input.nextDouble();
        System.out.print("Método de pagamento: ");
        String metdPagamento = input.next();
        System.out.print("Codigo do cliente: ");
        int codigoCliente = input.nextInt();
        System.out.print("Codigo do funcionario: ");
        int codigoFuncionario = input.nextInt();
        pedidoBean pb = new pedidoBean(codigoPedido, precoPedido, metdPagamento, codigoCliente, codigoFuncionario);
        pedidoModel.create(pb, con);
        System.out.println("Pedido registrado com sucesso");
    }    
    
    public void listarPedido(Connection con) throws SQLException {
        HashSet all = pedidoModel.listAll(con);
        Iterator<pedidoBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    } 

    void listarPedidoCliente(Connection con) throws SQLException {
        HashSet all = pedidoModel.listAllWithCliente(con);
        Iterator<pedidoBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
    
    void listarPedidoFuncionario(Connection con) throws SQLException {
        HashSet all = pedidoModel.listAllWithFuncionario(con);
        Iterator<pedidoBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}
*/