package io.github.softech.dev.sgill.domain;

import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(QuizHistory.class)
public abstract class QuizHistory_ {

	public static volatile SingularAttribute<QuizHistory, Quiz> quiz;
	public static volatile SingularAttribute<QuizHistory, Instant> start;
	public static volatile SingularAttribute<QuizHistory, Long> id;
	public static volatile SingularAttribute<QuizHistory, Boolean> passed;
	public static volatile SingularAttribute<QuizHistory, Customer> customer;

}

