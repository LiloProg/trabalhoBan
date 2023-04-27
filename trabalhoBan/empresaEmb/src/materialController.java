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

public class materialController {
    public void createMaterial(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para registrar o material: ");
        System.out.print("Codigo do material: ");
        int codigoMaterial = input.nextInt();
        System.out.print("Nome do Material: ");
        String nomeMaterial = input.next();
        System.out.print("Qualidade do material: ");
        String qualidadeMaterial = input.next();
        System.out.print("estoqueMaterial: ");
        int estoqueMaterial = input.nextInt();
        materialBean mb = new materialBean(codigoMaterial, nomeMaterial, qualidadeMaterial, estoqueMaterial);
        materialModel.create(mb, con);
        System.out.println("Material registrado com sucesso");
    }    
    
    public void listarMaterial(Connection con) throws SQLException {
        HashSet all = materialModel.listAll(con);
        Iterator<materialBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
    
    public void updateMaterial(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para ser atualizados: ");
        System.out.print("Codigo do material: ");
        int codigoMaterial = input.nextInt();
        System.out.print("Nome do Material: ");
        String nomeMaterial = input.next();
        System.out.print("Qualidade do material: ");
        String qualidadeMaterial = input.next();
        System.out.print("estoqueMaterial: ");
        int estoqueMaterial = input.nextInt();
        materialBean mb = new materialBean(codigoMaterial, nomeMaterial, qualidadeMaterial, estoqueMaterial);
        materialModel.update(mb, con);
        System.out.println("Material atualizado com sucesso");
    }

    public void deleteMaterial(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para deletar: ");
        System.out.print("Codigo do material: ");
        int codigoMaterial = input.nextInt();
        System.out.print("Nome do Material: ");
        String nomeMaterial = input.next();
        System.out.print("Qualidade do material: ");
        String qualidadeMaterial = input.next();
        System.out.print("estoqueMaterial: ");
        int estoqueMaterial = input.nextInt();
        materialBean mb = new materialBean(codigoMaterial, nomeMaterial, qualidadeMaterial, estoqueMaterial);
        materialModel.delete(mb, con);
        System.out.println("Material deletado com sucesso");
    }
}
