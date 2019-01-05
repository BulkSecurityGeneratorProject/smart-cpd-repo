package io.github.softech.dev.sgill.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Section.class)
public abstract class Section_ {

	public static volatile SingularAttribute<Section, Quiz> quiz;
	public static volatile SingularAttribute<Section, String> textcontent;
	public static volatile SingularAttribute<Section, String> notes;
	public static volatile SingularAttribute<Section, String> type;
	public static volatile SingularAttribute<Section, byte[]> content;
	public static volatile SetAttribute<Section, Tags> tags;
	public static volatile SingularAttribute<Section, String> pdfUrl;
	public static volatile SingularAttribute<Section, String> videoUrl;
	public static volatile SingularAttribute<Section, String> contentContentType;
	public static volatile SingularAttribute<Section, String> normSection;
	public static volatile SingularAttribute<Section, String> name;
	public static volatile SingularAttribute<Section, Integer> totalPages;
	public static volatile SingularAttribute<Section, Course> course;
	public static volatile SingularAttribute<Section, Long> id;

}

