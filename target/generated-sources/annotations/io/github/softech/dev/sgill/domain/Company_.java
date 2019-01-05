package io.github.softech.dev.sgill.domain;

import java.time.ZonedDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Company.class)
public abstract class Company_ {

	public static volatile SingularAttribute<Company, String> country;
	public static volatile SingularAttribute<Company, String> notes;
	public static volatile SingularAttribute<Company, ZonedDateTime> cycledate;
	public static volatile SingularAttribute<Company, String> city;
	public static volatile SingularAttribute<Company, String> postalCode;
	public static volatile SingularAttribute<Company, Boolean> show;
	public static volatile SingularAttribute<Company, String> description;
	public static volatile SingularAttribute<Company, String> stateProvince;
	public static volatile SingularAttribute<Company, String> url;
	public static volatile SingularAttribute<Company, String> phone;
	public static volatile SingularAttribute<Company, String> streetAddress;
	public static volatile SingularAttribute<Company, String> name;
	public static volatile SingularAttribute<Company, Long> id;

}

