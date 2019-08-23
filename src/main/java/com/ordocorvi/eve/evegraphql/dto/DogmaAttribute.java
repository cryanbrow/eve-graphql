package com.ordocorvi.eve.evegraphql.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class DogmaAttribute {
	@JsonProperty("value")
	private float value;
	@JsonProperty("attribute_id")
	private long attributeId;
	
	//Non Json properties
	private DogmaAttributeDetail attribute;
}
