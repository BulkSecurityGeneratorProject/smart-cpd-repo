package io.github.softech.dev.sgill.domain;

import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SectionHistory.class)
public abstract class SectionHistory_ {

	public static volatile SingularAttribute<SectionHistory, Boolean> watched;
	public static volatile SingularAttribute<SectionHistory, Integer> stamp;
	public static volatile SingularAttribute<SectionHistory, Instant> lastactivedate;
	public static volatile SingularAttribute<SectionHistory, Section> section;
	public static volatile SingularAttribute<SectionHistory, Long> id;
	public static volatile SingularAttribute<SectionHistory, Instant> startdate;
	public static volatile SingularAttribute<SectionHistory, Customer> customer;

}

