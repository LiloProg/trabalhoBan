/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



/**
 *
 * @author Ryzen
 */
public class PrincipalTrab {
public static void main(String[] args) throws SQLException {
        Conexao c = new Conexao();
        Connection con = c.getConnection();
        int op = 0;
        do{
            op = menu();
            try {
                switch (op) {
                    case 1: new clienteController().createCliente(con);
                            break;
                    
                    case 2: new funcionarioController().createFuncionario(con);
                            break;
                    
                    case 3: new produtoController().createProduto(con);
                            break;
                            
                    case 4: new materialController().createMaterial(con);
                            break;
                           
                    case 5: new pedidoController().createPedido(con);
                            break;
                            
                    /**//**//**//**//**//**//**//**//**//**//**//**//**/
                    case 6: new clienteController().listarCliente(con);
                            break;
                            
                    case 7: new funcionarioController().listarFuncionario(con);
                            break;
                            
                    case 8: new produtoController().listarProduto(con);
                            break;
                            
                    case 9: new materialController().listarMaterial(con);
                            break;
                            
                    case 10: new pedidoController().listarPedido(con);
                            break;
                    /*UPDATE*//*UPDATE*//*UPDATE*//*UPDATE*//*UPDATE*//*UPDATE*/           
                    case 11: new clienteController().updateCliente(con);
                            break;
                    case 12: new funcionarioController().updateFuncionario(con);
                            break;
                    case 13: new produtoController().updateProduto(con);
                            break;
                    case 14: new materialController().updateMaterial(con);
                            break;
                    case 15: new pedidoController().updatePedido(con);
                            break;
                    /*delete*/
                    case 16: new clienteController().deleteCliente(con);
                            break;
                    case 17: new funcionarioController().deleteFuncionario(con);
                            break;
                    case 18: new produtoController().deleteProduto(con);
                            break;
                    case 19: new materialController().deleteMaterial(con);
                            break;
                    case 20: new pedidoController().deletePedido(con);
                            break;
                    /*ASSOCIATIVAS*//*ASSOCIATIVAS*//*ASSOCIATIVAS*//*ASSOCIATIVAS*/
                    case 21: new pedidoController().listarPedidoCliente(con);
                            break;
                    case 22: new produtoController().listarProdutoMaterial(con);  
                            break;
                    case 23: new pedidoController().listarPedidoFuncionario(con);
                            break;
                    case 24: new pedidoController().listarPedidoProduto(con);
                            break;
                    /*RELATORIO RELATORIO RELATORIO RELATORIO RELATORIO RELATORIO*/
                    case 25: new produtoController().relatorioProdutoMediano(con);
                            break;
                    case 26: new pedidoController().relatorioPedidoMurilos(con);
                            break;
                    case 27: new pedidoController().relatorioPedidoPequeno(con);
                            break;
                    /*ÚLTIMO RELATORIO ABAIXO*/
                }
            }catch(SQLException ex) {
                //ex.printStackTrace();
                System.out.println(ex.getMessage());
                continue;
            }
        } while(op>0 && op<28);  
        con.close();    
}
    private static int menu() {
        System.out.println("");
        System.out.println("Informe o número da opção que desejas executar: ");
        System.out.println("01 - Inserir um novo cliente");
        System.out.println("02 - Inserir um novo funcionário");
        System.out.println("03 - Inserir um novo produto");
        System.out.println("04 - Inserir um novo material");
        System.out.println("05 - Inserir um novo pedido");
        System.out.println("06 - Exibir todos os clientes");
        System.out.println("07 - Exibir todos os funcionários");
        System.out.println("08 - Exibir todos os produtos");
        System.out.println("09 - Exibir todos os materiais");
        System.out.println("10 - Exibir todos os pedidos");
        System.out.println("11 - Atualizar um cliente");
        System.out.println("12 - Atualizar um funcionario");
        System.out.println("13 - Atualizar um produto");
        System.out.println("14 - Atualizar um material");
        System.out.println("15 - Atualizar um pedido");
        System.out.println("16 - Deletar um cliente");
        System.out.println("17 - Deletar um funcionário");
        System.out.println("18 - Deletar um produto");
        System.out.println("19 - Deletar um materiai");
        System.out.println("20 - Deletar um pedido");        
        System.out.println("21 - Listar dados do cliente responsável pelo pedido ");
        System.out.println("22 - Listar dados materiais dos produtos ");
        System.out.println("23 - Listar dados do funcionário responsável pelo pedido ");
        System.out.println("24 - Listar dados do produto presente no pedido ");
        System.out.println("25 - Relatorio produto mediano ");
        System.out.println("26 - Relatorio pedidos dos clientes com nome murilo ");
        System.out.println("27 - Relatorio pedidos com produto de tamanho pequeno");
        System.out.println("Digite qualquer outro valor para sair");
        System.out.print("Sua opção: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
