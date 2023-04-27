/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**pedidoBean cb = new pedidoBean(codigoPedido, dataPedido, precoPedido, metdPagamento);
 *
 * @author Ryzen
 */
public class pedidoBean {
    private int codigoPedido;
    private double precoPedido;
    private String metdPagamento;
    private int codigoCliente;
    private int codigoFuncionario;
    private int codigoProduto;
    
    private clienteBean cliente;
    private funcionarioBean funcionario;
    private produtoBean produto;
    
    public pedidoBean(int codigoPedido, double precoPedido, String metdPagamento, int codigoCliente, int codigoFuncionario, int codigoProduto){
        this.codigoPedido = codigoPedido;
        this.precoPedido = precoPedido;
        this.metdPagamento = metdPagamento;
        this.codigoProduto = codigoProduto;
        this.codigoCliente = codigoCliente;
        this.codigoFuncionario = codigoFuncionario;
        
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
     * @return the precoPedido
     */
    public double getPrecoPedido() {
        return precoPedido;
    }

    /**
     * @param precoPedido the precoPedido to set
     */
    public void setPrecoPedido(double precoPedido) {
        this.precoPedido = precoPedido;
    }

    /**
     * @return the metdPagamento
     */
    public String getMetdPagamento() {
        return metdPagamento;
    }

    /**
     * @param metdPagamento the metdPagamento to set
     */
    public void setMetdPagamento(String metdPagamento) {
        this.metdPagamento = metdPagamento;
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

    /**
     * @return the cliente
     */
    public clienteBean getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(clienteBean cliente) {
        this.cliente = cliente;
    }
    
    /**
     * @return the codigoFuncionario
     */
    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    /**
     * @param codigoFuncionario the codigoFuncionario to set
     */
    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
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
     * @return the funcionario
     */
    public funcionarioBean getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(funcionarioBean funcionario) {
        this.funcionario = funcionario;
    }

    /**
     * @return the produto
     */
    public produtoBean getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(produtoBean produto) {
        this.produto = produto;
    }
    
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("Codigo Pedido: "+codigoPedido+"|| Preço: "+precoPedido+"|| MetdPagamento: "+metdPagamento+"|| Código cliente: "+codigoCliente+
                "|| Código Func: "+codigoFuncionario+"|| Código Prod: "+codigoProduto);
        if(cliente!= null)
            sb.append("|| Nome cliente: "+cliente.getNomeCliente()+"|| telefone: "+cliente.getTelefone()+"|| Rua: "+cliente.getRua()+
                    "|| Numero: "+cliente.getNumero()+"|| Cep: "+cliente.getCep());
        if(funcionario!= null)
            sb.append("|| Nome func: "+funcionario.getNomeFuncionario()+"|| Telefone: "+funcionario.getTelefone()+"|| email: "+funcionario.getEmail()+
                    "|| Salario: "+funcionario.getSalario());
        if(produto!= null)
            sb.append("|| Modelo: "+produto.getModelo()+"|| tamanho: "+produto.getTamanho()+"|| Preço: "+produto.getPrecoProduto()+
                    "|| Estoque: "+produto.getEstoqueProduto()+"|| Material: "+produto.getCodigoMaterial());

        return sb.toString(); 
    }


}
