/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ryzen
 */
public class relatorioProdMatMedBean {
    private int codigoProduto;
    private String modelo;
    private int codigoMaterial;
    

    
    public relatorioProdMatMedBean(int codigoProduto, String modelo, int codigoMaterial){
        this.codigoProduto = codigoProduto;
        this.modelo = modelo;
        this.codigoMaterial = codigoMaterial;
    }
    /**
     * @return the codigoProduto
     */
    public int getCodigoProduto() {
        return codigoProduto;
    }

    /**
     * @param codigoProduto the codigoProduto to set
     */
    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the codigoMaterial
     */
    public int getCodigoMaterial() {
        return codigoMaterial;
    }

    /**
     * @param codigoMaterial the codigoMaterial to set
     */
    public void setCodigoMaterial(int codigoMaterial) {
        this.codigoMaterial = codigoMaterial;
    }

    /**
     * @return the material
     */


    public String toStringRel(){
        return "Código Produto: "+getCodigoProduto()+"|| Modelo: "+getModelo()+"||Codigo Material:  "+getCodigoMaterial();  
    }


    
}
