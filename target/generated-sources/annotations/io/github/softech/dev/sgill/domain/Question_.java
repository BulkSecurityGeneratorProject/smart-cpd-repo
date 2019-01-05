package io.github.softech.dev.sgill.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Question.class)
public abstract class Question_ {

	public static volatile SingularAttribute<Question, String> difficulty;
	public static volatile SingularAttribute<Question, Quiz> quiz;
	public static volatile SingularAttribute<Question, String> textQuestion;
	public static volatile SingularAttribute<Question, Long> id;
	public static volatile SingularAttribute<Question, Boolean> used;
	public static volatile SingularAttribute<Question, String> restudy;
	public static volatile SetAttribute<Question, Choice> choices;

}

