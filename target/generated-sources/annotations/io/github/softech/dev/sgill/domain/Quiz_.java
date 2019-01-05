package io.github.softech.dev.sgill.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Quiz.class)
public abstract class Quiz_ {

	public static volatile SingularAttribute<Quiz, String> difficulty;
	public static volatile SingularAttribute<Quiz, Section> newSection;
	public static volatile SingularAttribute<Quiz, String> name;
	public static volatile SingularAttribute<Quiz, Integer> passingscore;
	public static volatile SingularAttribute<Quiz, Long> id;

}

