
public class relatorioPedCliMurBean {
    private int codigoPedido;
    private int codigoCliente;
    
    public relatorioPedCliMurBean(int codigoPedido, int codigoCliente){
        this.codigoPedido = codigoPedido;
        this.codigoCliente = codigoCliente;
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
     * @return the codigoCliente
     */
    public int getCodigoCliente() {
        return codigoCliente;
    }

    /**
     * @param codigoCliente the codigoCliente to set
     */
    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    
    public String toStringRel(){
        return "Código Pedido: "+getCodigoPedido()+"|| Código Cliente: "+getCodigoCliente();  
    }
}
