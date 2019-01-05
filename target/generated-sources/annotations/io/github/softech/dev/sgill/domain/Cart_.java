package io.github.softech.dev.sgill.domain;

import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Cart.class)
public abstract class Cart_ {

	public static volatile SingularAttribute<Cart, String> normCart;
	public static volatile SingularAttribute<Cart, Double> amount;
	public static volatile SingularAttribute<Cart, Instant> createddate;
	public static volatile SingularAttribute<Cart, Instant> lastactivedate;
	public static volatile SingularAttribute<Cart, Long> id;
	public static volatile SingularAttribute<Cart, Boolean> checkout;
	public static volatile SingularAttribute<Cart, Integer> points;
	public static volatile SingularAttribute<Cart, Customer> customer;

}

