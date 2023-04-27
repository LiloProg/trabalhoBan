import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class produtoController {
    public void createProduto(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para registrar um produto: ");
        System.out.print("Codigo do produto: ");
        int codigoProduto = input.nextInt();
        System.out.print("Modelo: ");
        String modelo = input.next();
        System.out.print("Tamaho: ");
        String tamanho = input.next();
        System.out.print("Preço do produto: ");
        Double precoProduto = input.nextDouble();
        System.out.print("Estoque: ");
        int estoqueProduto = input.nextInt();
        System.out.print("Codigo do material: ");
        int codigoMaterial = input.nextInt();
        
        produtoBean pb = new produtoBean(codigoProduto, modelo, tamanho, precoProduto, estoqueProduto, codigoMaterial);
        produtoModel.create(pb, con);
        System.out.println("Produto registrado com sucesso");
    }    
    
    public void listarProduto(Connection con) throws SQLException {
        HashSet all = produtoModel.listAll(con);
        Iterator<produtoBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
    
    
    public void updateProduto(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para atualizar um produto: ");
        System.out.print("Codigo do produto: ");
        int codigoProduto = input.nextInt();
        System.out.print("Modelo: ");
        String modelo = input.next();
        System.out.print("Tamaho: ");
        String tamanho = input.next();
        System.out.print("Preço do produto: ");
        Double precoProduto = input.nextDouble();
        System.out.print("Estoque: ");
        int estoqueProduto = input.nextInt();
        System.out.print("Codigo do material: ");
        int codigoMaterial = input.nextInt();
        
        produtoBean pb = new produtoBean(codigoProduto, modelo, tamanho, precoProduto, estoqueProduto, codigoMaterial);
        produtoModel.update(pb, con);
        System.out.println("Produto atualizado com sucesso");
    } 
    
    public void deleteProduto(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para deletar um produto: ");
        System.out.print("Codigo do produto: ");
        int codigoProduto = input.nextInt();
        System.out.print("Modelo: ");
        String modelo = input.next();
        System.out.print("Tamaho: ");
        String tamanho = input.next();
        System.out.print("Preço do produto: ");
        Double precoProduto = input.nextDouble();
        System.out.print("Estoque: ");
        int estoqueProduto = input.nextInt();
        System.out.print("Codigo do material: ");
        int codigoMaterial = input.nextInt();
        
        produtoBean pb = new produtoBean(codigoProduto, modelo, tamanho, precoProduto, estoqueProduto, codigoMaterial);
        produtoModel.delete(pb, con);
        System.out.println("Produto deletado com sucesso");
    } 
    

    void listarProdutoMaterial(Connection con) throws SQLException {
        HashSet all = produtoModel.listAllWithMaterial(con);
        Iterator<produtoBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
    
    void relatorioProdutoMediano(Connection con) throws SQLException {
        HashSet all = produtoModel.relatorioProdutoMatMed(con);
        Iterator<relatorioProdMatMedBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toStringRel());
        }
    }
}
