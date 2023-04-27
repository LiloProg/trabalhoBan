import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Ryzen
 */
public class clienteController {
    public void createCliente(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para registrar um cliente: ");
        System.out.print("Codigo do cliente: ");
        int codigoCliente = input.nextInt();
        System.out.print("Nome do cliente: ");
        String nomeCliente = input.next();
        System.out.print("Número de telefone: ");
        long telefone = input.nextLong();
        System.out.print("Rua onde mora: ");
        String rua = input.next();
        System.out.print("Número do estabelecimento: ");
        int numero = input.nextInt();
        System.out.print("CEP: ");
        long cep = input.nextLong();
        clienteBean cb = new clienteBean(codigoCliente, nomeCliente, telefone, rua, numero, cep);
        clienteModel.create(cb, con);
        System.out.println("Cliente registrado com sucesso");
    }    
    
    public void listarCliente(Connection con) throws SQLException {
        HashSet all = clienteModel.listAll(con);
        Iterator<clienteBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
    public void updateCliente(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para atualizar um cliente: ");
        System.out.print("Codigo do cliente: ");
        int codigoCliente = input.nextInt();
        System.out.print("Nome do cliente: ");
        String nomeCliente = input.next();
        System.out.print("Número de telefone: ");
        long telefone = input.nextLong();
        System.out.print("Rua onde mora: ");
        String rua = input.next();
        System.out.print("Número do estabelecimento: ");
        int numero = input.nextInt();
        System.out.print("CEP: ");
        long cep = input.nextLong();
        clienteBean cb = new clienteBean(codigoCliente, nomeCliente, telefone, rua, numero, cep);
        clienteModel.update(cb, con);
        System.out.println("Cliente atualizado com sucesso");
    }
    
    public void deleteCliente(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para deletar um cliente: ");
        System.out.print("Codigo do cliente: ");
        int codigoCliente = input.nextInt();
        System.out.print("Nome do cliente: ");
        String nomeCliente = input.next();
        System.out.print("Número de telefone: ");
        long telefone = input.nextLong();
        System.out.print("Rua onde mora: ");
        String rua = input.next();
        System.out.print("Número do estabelecimento: ");
        int numero = input.nextInt();
        System.out.print("CEP: ");
        long cep = input.nextLong();
        clienteBean cb = new clienteBean(codigoCliente, nomeCliente, telefone, rua, numero, cep);
        clienteModel.delete(cb, con);
        System.out.println("Cliente deletado com sucesso");
    }
}

