package io.github.softech.dev.sgill.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(QuizApp.class)
public abstract class QuizApp_ {

	public static volatile SingularAttribute<QuizApp, Quiz> quiz;
	public static volatile SingularAttribute<QuizApp, Section> newSection;
	public static volatile SetAttribute<QuizApp, Question> questions;
	public static volatile SingularAttribute<QuizApp, Section> currSection;
	public static volatile SingularAttribute<QuizApp, Long> id;

}

