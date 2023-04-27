
public class relatorioPedProPeqBean {
    private int codigoPedido;
    private int codigoProduto;
    
    public relatorioPedProPeqBean(int codigoPedido, int codigoProduto) {
        this.codigoPedido = codigoPedido;
        this.codigoProduto = codigoProduto;
    }
    /**
     * @return the codigoPedido
     */
    public int getCodigoPedido() {
        return codigoPedido;
    }

    /**
     * @param codigoPedido the codigoPedido to set
     */
    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
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
    //string
    public String toStringRel2(){
        return "Código Pedido: "+getCodigoPedido()+"|| Código Produto: "+getCodigoProduto();  
    }
}
