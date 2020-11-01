package Entidades;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author eduar
 */
@Entity
@Table(name  = "Autores")

public class Autores {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "nome", length = 100, nullable = false)
    private String nome;
    
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "Autor_Livro",
            joinColumns = {@JoinColumn (name = "IDFK_AUTOR")},
            inverseJoinColumns = {@JoinColumn(name = "IDFK_LIVRO")}              
            )
    public Set<Livros> Livros = new HashSet<>();
    
    @OneToMany(
    cascade = CascadeType.ALL,
    orphanRemoval = true
    )
    @JoinColumn(name = "IDFK_AUTOR")
    public List<Email> email;
    
    
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
}
