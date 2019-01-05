package io.github.softech.dev.sgill.domain;

import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Certificate.class)
public abstract class Certificate_ {

	public static volatile SingularAttribute<Certificate, Course> courses;
	public static volatile SingularAttribute<Certificate, Long> id;
	public static volatile SingularAttribute<Certificate, Boolean> isEmailed;
	public static volatile SingularAttribute<Certificate, Instant> timestamp;
	public static volatile SingularAttribute<Certificate, Customer> customer;

}

