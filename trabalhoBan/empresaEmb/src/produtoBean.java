
public class produtoBean {
    private int codigoProduto;
    private String modelo;
    private String tamanho;
    private double precoProduto;
    private int estoqueProduto;
    private int codigoMaterial;
    private materialBean material;
    
    public produtoBean(int codigoProduto, String modelo, String tamanho, double precoProduto, int estoqueProduto, int codigoMaterial){
        this.codigoProduto = codigoProduto;
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.precoProduto = precoProduto;
        this.estoqueProduto = estoqueProduto;
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
     * @return the tamanho
     */
    public String getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * @return the precoProduto
     */
    public double getPrecoProduto() {
        return precoProduto;
    }

    /**
     * @param precoProduto the precoProduto to set
     */
    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    /**
     * @return the estoqueProduto
     */
    public int getEstoqueProduto() {
        return estoqueProduto;
    }

    /**
     * @param estoqueProduto the estoque to set
     */
    public void setEstoqueProduto(int estoqueProduto) {
        this.estoqueProduto = estoqueProduto;
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
    public materialBean getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(materialBean material) {
        this.material = material;
    }    
    

    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("Codigo Prod: "+codigoProduto+"|| Modelo: "+modelo+"|| Tamanho: "+tamanho+
                "|| Preço Prod: "+precoProduto+"|| Estoque prod: "+estoqueProduto+"|| Codigo mat: "+codigoMaterial);
        if(material!= null)
            sb.append("|| Nome Mat: "+material.getNomeMaterial()+"|| Qualidade Mat: "+material.getQualidadeMaterial()+
                    "|| Estoque Mat: "+material.getEstoqueMaterial());
        return sb.toString(); 
    }

}