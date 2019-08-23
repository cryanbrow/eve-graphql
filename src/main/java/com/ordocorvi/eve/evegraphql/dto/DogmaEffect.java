package com.ordocorvi.eve.evegraphql.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class DogmaEffect {
	@JsonProperty("is_default")
	private boolean isDefault;
	@JsonProperty("effect_id")
	private long effectId;
	
	//Non Json properties
	private DogmaEffectDetail effect;
}
