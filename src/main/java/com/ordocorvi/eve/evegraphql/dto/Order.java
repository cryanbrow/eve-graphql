package com.ordocorvi.eve.evegraphql.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class Order {
	private int duration;
	private boolean is_buy_order;
	private Long issued;
	private Station location;
	private int min_volume;
	private long order_id;
	private float price;
	private Range range;
	private com.ordocorvi.eve.evegraphql.dto.System system;
	private ItemType item_type;
	private int volume_remain;
	private int volume_total;
}
