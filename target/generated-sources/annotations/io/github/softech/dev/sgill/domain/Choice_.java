package io.github.softech.dev.sgill.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Choice.class)
public abstract class Choice_ {

	public static volatile SingularAttribute<Choice, Question> question;
	public static volatile SingularAttribute<Choice, String> textChoice;
	public static volatile SingularAttribute<Choice, Boolean> isanswer;
	public static volatile SingularAttribute<Choice, Long> id;

}

