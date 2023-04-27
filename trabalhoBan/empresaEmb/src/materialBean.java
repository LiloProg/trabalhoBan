/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//materialBean mb = new materialBean(codigoMaterial, nomeMaterial, qualidadeMaterial, estoqueMaterial);
/**
 *
 * @author Ryzen
 */
public class materialBean {
    private int codigoMaterial;
    private String nomeMaterial;
    private String qualidadeMaterial;
    private int estoqueMaterial;
    
    public materialBean(int codigoMaterial, String nomeMaterial, String qualidadeMaterial, int estoqueMaterial){
        this.codigoMaterial = codigoMaterial;
        this.nomeMaterial = nomeMaterial;
        this.qualidadeMaterial = qualidadeMaterial;
        this.estoqueMaterial = estoqueMaterial;
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
     * @return the nomeMaterial
     */
    public String getNomeMaterial() {
        return nomeMaterial;
    }

    /**
     * @param nomeMaterial the nomeMaterial to set
     */
    public void setNomeMaterial(String nomeMaterial) {
        this.nomeMaterial = nomeMaterial;
    }

    /**
     * @return the qualidadeMaterial
     */
    public String getQualidadeMaterial() {
        return qualidadeMaterial;
    }

    /**
     * @param qualidadeMaterial the qualidadeMaterial to set
     */
    public void setQualidadeMaterial(String qualidadeMaterial) {
        this.qualidadeMaterial = qualidadeMaterial;
    }

    /**
     * @return the estoqueMaterial
     */
    public int getEstoqueMaterial() {
        return estoqueMaterial;
    }

    /**
     * @param estoqueMaterial the estoqueMaterial to set
     */
    public void setEstoqueMaterial(int estoqueMaterial) {
        this.estoqueMaterial = estoqueMaterial;
    }
    public String toString() {
        return "Código: "+getCodigoMaterial()+" Nome: "+getNomeMaterial()+" Qualidade: "+getQualidadeMaterial()+" Estoque: "+getEstoqueMaterial();
    }      
}

