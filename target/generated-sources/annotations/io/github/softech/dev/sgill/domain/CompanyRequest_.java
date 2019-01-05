package io.github.softech.dev.sgill.domain;

import java.time.ZonedDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CompanyRequest.class)
public abstract class CompanyRequest_ {

	public static volatile SingularAttribute<CompanyRequest, String> country;
	public static volatile SingularAttribute<CompanyRequest, ZonedDateTime> cycledate;
	public static volatile SingularAttribute<CompanyRequest, String> phone;
	public static volatile SingularAttribute<CompanyRequest, String> streetAddress;
	public static volatile SingularAttribute<CompanyRequest, String> city;
	public static volatile SingularAttribute<CompanyRequest, String> postalCode;
	public static volatile SingularAttribute<CompanyRequest, String> name;
	public static volatile SingularAttribute<CompanyRequest, String> description;
	public static volatile SingularAttribute<CompanyRequest, String> stateProvince;
	public static volatile SingularAttribute<CompanyRequest, Long> id;
	public static volatile SingularAttribute<CompanyRequest, String> email;
	public static volatile SingularAttribute<CompanyRequest, String> url;

}

