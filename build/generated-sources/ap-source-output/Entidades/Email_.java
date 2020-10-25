package Entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Email.class)
public abstract class Email_ {

	public static volatile SingularAttribute<Email, Integer> id;
	public static volatile SingularAttribute<Email, String> email;
	public static volatile SingularAttribute<Email, Autores> autor;

}

