package com.aitorsantana.ytmavenv3;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Usuarios.class)
public abstract class Usuarios_ {

	public static volatile SingularAttribute<Usuarios, String> apellidos;
	public static volatile SingularAttribute<Usuarios, Date> fechaNac;
	public static volatile SingularAttribute<Usuarios, String> password;
	public static volatile SingularAttribute<Usuarios, String> fotoPerfil;
	public static volatile SingularAttribute<Usuarios, String> municipio;
	public static volatile SingularAttribute<Usuarios, String> direccion;
	public static volatile SingularAttribute<Usuarios, Integer> id;
	public static volatile SingularAttribute<Usuarios, String> telefono;
	public static volatile SingularAttribute<Usuarios, String> nombre;
	public static volatile SingularAttribute<Usuarios, Integer> codPostal;
	public static volatile SingularAttribute<Usuarios, String> dni;
	public static volatile CollectionAttribute<Usuarios, Inscripcion> inscripcionCollection;

}

