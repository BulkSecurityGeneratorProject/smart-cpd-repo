package io.github.softech.dev.sgill.domain;

import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CourseHistory.class)
public abstract class CourseHistory_ {

	public static volatile SingularAttribute<CourseHistory, Boolean> access;
	public static volatile SingularAttribute<CourseHistory, Boolean> isactive;
	public static volatile SingularAttribute<CourseHistory, Course> course;
	public static volatile SingularAttribute<CourseHistory, Instant> lastactivedate;
	public static volatile SingularAttribute<CourseHistory, Long> id;
	public static volatile SingularAttribute<CourseHistory, Instant> startdate;
	public static volatile SingularAttribute<CourseHistory, Boolean> iscompleted;
	public static volatile SingularAttribute<CourseHistory, Customer> customer;

}

