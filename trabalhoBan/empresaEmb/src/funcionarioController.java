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
public class funcionarioController {
    public void createFuncionario(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para registrar um funcionário: ");
        System.out.print("Codigo do funcionário: ");
        int codigoFuncionario = input.nextInt();
        System.out.print("Nome do funcionário ");
        String nomeFuncionario = input.next();
        System.out.print("Número de telefone: ");
        long telefone = input.nextLong();
        System.out.print("email: ");
        String email = input.next();
        System.out.print("Salário: ");
        double salario = input.nextDouble();
        funcionarioBean fb = new funcionarioBean(codigoFuncionario, nomeFuncionario, telefone, email, salario);
        funcionarioModel.create(fb, con);
        System.out.println("Funcionario registrado com sucesso");
    }    
    
    public void listarFuncionario(Connection con) throws SQLException {
        HashSet all = funcionarioModel.listAll(con);
        Iterator<funcionarioBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
   
    
    public void updateFuncionario(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para atualizar um funcionário: ");
        System.out.print("Codigo do funcionário: ");
        int codigoFuncionario = input.nextInt();
        System.out.print("Nome do funcionário ");
        String nomeFuncionario = input.next();
        System.out.print("Número de telefone: ");
        long telefone = input.nextLong();
        System.out.print("email: ");
        String email = input.next();
        System.out.print("Salário: ");
        double salario = input.nextDouble();
        funcionarioBean fb = new funcionarioBean(codigoFuncionario, nomeFuncionario, telefone, email, salario);
        funcionarioModel.update(fb, con);
        System.out.println("Funcionario atualizado com sucesso");
    }

    public void deleteFuncionario(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para deletar um funcionário: ");
        System.out.print("Codigo do funcionário: ");
        int codigoFuncionario = input.nextInt();
        System.out.print("Nome do funcionário ");
        String nomeFuncionario = input.next();
        System.out.print("Número de telefone: ");
        long telefone = input.nextLong();
        System.out.print("email: ");
        String email = input.next();
        System.out.print("Salário: ");
        double salario = input.nextDouble();
        funcionarioBean fb = new funcionarioBean(codigoFuncionario, nomeFuncionario, telefone, email, salario);
        funcionarioModel.delete(fb, con);
        System.out.println("Funcionario deletado com sucesso");
    }
    
    
}
