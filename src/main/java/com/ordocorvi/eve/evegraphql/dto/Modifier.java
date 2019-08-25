package com.ordocorvi.eve.evegraphql.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class Modifier {
	@JsonProperty("domain")
	private String domain;
	@JsonProperty("effect_id")
	private int effectId;
	@JsonProperty("func")
	private String func;
	@JsonProperty("modified_attribute_id")
	private int modifiedAttributeId;
	@JsonProperty("modifying_attribute_id")
	private int modifyingAttributeId;
	@JsonProperty("operator")
	private int operator;
}
