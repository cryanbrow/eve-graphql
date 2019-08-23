package com.ordocorvi.eve.evegraphql.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class DogmaAttributeDetail {
	@JsonProperty("attribute_id")
	private long attributeId;
	@JsonProperty("default_value")
	private float defaultValue;
	@JsonProperty("description")
	private String description;
	@JsonProperty("display_name")
	private String displayName;
	@JsonProperty("high_is_good")
	private boolean highIsGood;
	@JsonProperty("icon_id")
	private long iconId;
	@JsonProperty("name")
	private String name;
	@JsonProperty("published")
	private boolean published;
	@JsonProperty("stackable")
	private boolean stackable;
	@JsonProperty("unit_id")
	private long unitId;
	
	//Non Json Properties
	private Icon icon;
	private Unit unit;
}
