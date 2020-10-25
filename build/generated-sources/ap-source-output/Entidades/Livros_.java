package Entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Livros.class)
public abstract class Livros_ {

	public static volatile SingularAttribute<Livros, Float> custo;
	public static volatile SingularAttribute<Livros, String> titulo;
	public static volatile SetAttribute<Livros, Autores> Autor;
	public static volatile SingularAttribute<Livros, Integer> id;
	public static volatile SingularAttribute<Livros, String> edicao;
	public static volatile SingularAttribute<Livros, Editora> editora;

}

