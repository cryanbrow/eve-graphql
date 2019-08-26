package com.ordocorvi.eve.evegraphql.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class Order {
	@JsonProperty("duration")
	private int duration;
	@JsonProperty("is_buy_order")
	private boolean isBuyOrder;
	@JsonProperty("issued")
	private String issued;
	@JsonProperty("location_id")
	private long locationId;
	@JsonProperty("min_volume")
	private int minVolume;
	@JsonProperty("order_id")
	private long orderId;
	@JsonProperty("price")
	private float price;
	@JsonProperty("range")
	private Range range;
	@JsonProperty("system_id")
	private long systemId;
	@JsonProperty("type_id")
	private long typeId;
	@JsonProperty("volumen_remain")
	private int volumeRemain;
	@JsonProperty("volume_total")
	private int volumeTotal;
	
	private com.ordocorvi.eve.evegraphql.dto.System system;
	private ItemType itemType;
	private Station location;
}
