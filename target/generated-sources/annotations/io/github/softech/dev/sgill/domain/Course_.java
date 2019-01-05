package io.github.softech.dev.sgill.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Course.class)
public abstract class Course_ {

	public static volatile SingularAttribute<Course, byte[]> image;
	public static volatile SingularAttribute<Course, String> country;
	public static volatile SingularAttribute<Course, Double> amount;
	public static volatile SingularAttribute<Course, String> description;
	public static volatile SingularAttribute<Course, String> section;
	public static volatile SingularAttribute<Course, String> title;
	public static volatile SingularAttribute<Course, Long> point;
	public static volatile SetAttribute<Course, Tags> tags;
	public static volatile SingularAttribute<Course, String> normCourses;
	public static volatile SingularAttribute<Course, String> imageContentType;
	public static volatile SingularAttribute<Course, Topic> topic;
	public static volatile SingularAttribute<Course, Long> id;
	public static volatile SingularAttribute<Course, String> state;
	public static volatile SingularAttribute<Course, String> credit;

}

