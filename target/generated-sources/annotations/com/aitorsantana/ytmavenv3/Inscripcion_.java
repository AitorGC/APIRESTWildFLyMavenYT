package com.aitorsantana.ytmavenv3;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Inscripcion.class)
public abstract class Inscripcion_ {

	public static volatile SingularAttribute<Inscripcion, Date> fecha;
	public static volatile SingularAttribute<Inscripcion, Boolean> aceptado;
	public static volatile SingularAttribute<Inscripcion, Integer> id;
	public static volatile SingularAttribute<Inscripcion, Usuarios> usuarioId;
	public static volatile SingularAttribute<Inscripcion, Integer> actividadId;

}

