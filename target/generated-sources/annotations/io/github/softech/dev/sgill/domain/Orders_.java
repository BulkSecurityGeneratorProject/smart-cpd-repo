package io.github.softech.dev.sgill.domain;

import io.github.softech.dev.sgill.domain.enumeration.NOTIFICATIONS;
import io.github.softech.dev.sgill.domain.enumeration.PAYMENT;
import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Orders.class)
public abstract class Orders_ {

	public static volatile SingularAttribute<Orders, String> last4;
	public static volatile SingularAttribute<Orders, Double> amount;
	public static volatile SingularAttribute<Orders, Instant> createddate;
	public static volatile SingularAttribute<Orders, String> seller_message;
	public static volatile SingularAttribute<Orders, String> card_type;
	public static volatile SingularAttribute<Orders, String> gateway_id;
	public static volatile SingularAttribute<Orders, Cart> cart;
	public static volatile SingularAttribute<Orders, String> seller_type;
	public static volatile SingularAttribute<Orders, PAYMENT> payment;
	public static volatile SingularAttribute<Orders, String> network_status;
	public static volatile SingularAttribute<Orders, Long> id;
	public static volatile SingularAttribute<Orders, String> seller_status;
	public static volatile SingularAttribute<Orders, NOTIFICATIONS> status;
	public static volatile SingularAttribute<Orders, String> gateway_amt;

}

