package io.github.softech.dev.sgill.domain;

import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(QuestionHistory.class)
public abstract class QuestionHistory_ {

	public static volatile SingularAttribute<QuestionHistory, Boolean> correct;
	public static volatile SingularAttribute<QuestionHistory, Question> question;
	public static volatile SingularAttribute<QuestionHistory, Long> id;
	public static volatile SingularAttribute<QuestionHistory, Instant> timestamp;
	public static volatile SingularAttribute<QuestionHistory, Customer> customer;

}

