package io.github.softech.dev.sgill.domain;

import io.github.softech.dev.sgill.domain.enumeration.TYPES;
import java.time.Instant;
import java.time.ZonedDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Customer.class)
public abstract class Customer_ {

	public static volatile SingularAttribute<Customer, String> country;
	public static volatile SingularAttribute<Customer, ZonedDateTime> cycledate;
	public static volatile SingularAttribute<Customer, String> city;
	public static volatile SingularAttribute<Customer, String> normalized;
	public static volatile SingularAttribute<Customer, Boolean> show;
	public static volatile SingularAttribute<Customer, String> stateProvince;
	public static volatile SingularAttribute<Customer, Instant> registered;
	public static volatile SingularAttribute<Customer, String> trades;
	public static volatile SingularAttribute<Customer, Instant> lastactive;
	public static volatile SingularAttribute<Customer, Integer> points;
	public static volatile SingularAttribute<Customer, String> phone;
	public static volatile SingularAttribute<Customer, String> monthYear;
	public static volatile SingularAttribute<Customer, String> postalcode;
	public static volatile SingularAttribute<Customer, String> areaserviced;
	public static volatile SingularAttribute<Customer, String> streetaddress;
	public static volatile SingularAttribute<Customer, String> licenseNumber;
	public static volatile SingularAttribute<Customer, Company> company;
	public static volatile SingularAttribute<Customer, Long> id;
	public static volatile SingularAttribute<Customer, User> user;
	public static volatile SingularAttribute<Customer, TYPES> specialities;

}

