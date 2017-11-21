package javafxmvc.model.domain;

/**
 *
 * @author mateus_de-oliveira
 */
public class Categoria {
  private int cdCategoria;
  private String descricao;

    public Categoria() {
    }

    public Categoria(int cdCategoria, String descricao) {
        this.cdCategoria = cdCategoria;
        this.descricao = descricao;
    }

    public int getCdCategoria() {
        return cdCategoria;
    }

    public void setCdCategoria(int cdCategoria) {
        this.cdCategoria = cdCategoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
  
  
}
