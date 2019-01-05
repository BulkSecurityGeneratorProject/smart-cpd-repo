package io.github.softech.dev.sgill.domain;

import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CourseCartBridge.class)
public abstract class CourseCartBridge_ {

	public static volatile SingularAttribute<CourseCartBridge, Course> course;
	public static volatile SingularAttribute<CourseCartBridge, Long> id;
	public static volatile SingularAttribute<CourseCartBridge, Cart> cart;
	public static volatile SingularAttribute<CourseCartBridge, Instant> timestamp;

}

