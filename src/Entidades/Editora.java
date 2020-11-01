package Entidades;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author eduar
 */
@Entity
@Table(name = "Editora")
public class Editora {
    
    @Id
    private Integer id;
    
    @Column(name = "nome", length = 100, nullable = false)
    private String nome;
    
    @OneToMany(
    cascade = CascadeType.ALL,
    orphanRemoval = true   
    )
    @JoinColumn(name = "IDFK_EDITORA")
    public List<Livros> livro = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void AddLivro(Livros livro) {
        this.livro.add(livro);
        livro.editora = null;
    }
}
