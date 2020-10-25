package Entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Editora.class)
public abstract class Editora_ {

	public static volatile ListAttribute<Editora, Livros> livro;
	public static volatile SingularAttribute<Editora, String> nome;
	public static volatile SingularAttribute<Editora, Integer> id;

}

