package javafxmvc.model.domain;

/**
 *
 * @author mateus_de-oliveira
 */
public class Cliente {

    private int cdCliente;
    private String nome;
    private String cpf;
    private String telefone;

    public Cliente() {
    }

    public Cliente(int codigo, String nome, String cpf, String telefone) {
        this.cdCliente = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    
    

    public int getCdCliente() {
        return cdCliente;
    }

    public void setCdCliente(int codigo) {
        this.cdCliente = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
