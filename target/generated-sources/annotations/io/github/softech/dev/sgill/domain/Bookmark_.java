package io.github.softech.dev.sgill.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Bookmark.class)
public abstract class Bookmark_ {

	public static volatile SingularAttribute<Bookmark, Integer> seconds;
	public static volatile SingularAttribute<Bookmark, Integer> slide;
	public static volatile SingularAttribute<Bookmark, String> module;
	public static volatile SingularAttribute<Bookmark, Section> section;
	public static volatile SingularAttribute<Bookmark, Long> id;
	public static volatile SingularAttribute<Bookmark, String> text;
	public static volatile SingularAttribute<Bookmark, String> timestamp;

}

