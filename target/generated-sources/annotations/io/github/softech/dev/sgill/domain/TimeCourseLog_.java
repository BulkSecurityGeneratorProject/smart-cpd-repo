package io.github.softech.dev.sgill.domain;

import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TimeCourseLog.class)
public abstract class TimeCourseLog_ {

	public static volatile SingularAttribute<TimeCourseLog, Long> timespent;
	public static volatile SingularAttribute<TimeCourseLog, Course> course;
	public static volatile SingularAttribute<TimeCourseLog, Long> id;
	public static volatile SingularAttribute<TimeCourseLog, Instant> recorddate;
	public static volatile SingularAttribute<TimeCourseLog, Customer> customer;

}

