package Entidades;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author eduar
 */
@Entity
@Table(name = "Livros")
public class Livros {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "edicao", length = 100, nullable = false)
    private String edicao;
    
    @Column(name = "custo", nullable = false)
    private float custo;
        
    @Column(name = "titulo", length = 100, nullable = false)
    private String titulo;
    
    @ManyToMany(mappedBy = "Livros")
    public Set<Autores> Autor = new HashSet<>();
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name = "IDFK_EDITORA")
    public Editora editora;
    
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Livros)) return false;
        return id != null && id.equals(((Editora)o).getId());
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
