/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ryzen
 */
public class clienteBean {
    private int codigoCliente;
    private String nomeCliente;
    private long telefone;
    private String rua;
    private int numero;
    private long cep;

    public clienteBean(int codigoCliente, String nomeCliente, long telefone, String rua, int numero, long cep) {
        this.codigoCliente = codigoCliente;
        this.nomeCliente = nomeCliente;
        this.telefone = telefone;
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
       
   }

    /**
     * @return the nomeCliente
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
     * @return the codigoCliente
     */
    
    /**
     * @return the codigoClienteAtt
     */
    
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * @param nomeCliente the nomeCliente to set
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * @return the telefone
     */
    public long getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the cep
     */
    public long getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(long cep) {
        this.cep = cep;
    }
    
    public String toString() {
        return "Código: "+getCodigoCliente()+" Nome: "+getNomeCliente()+" telefone: "+getTelefone()+" rua: "+getRua()+" numero: "+getNumero()+" cep: "+getCep();
    }   
}    

