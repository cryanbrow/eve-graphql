package com.ordocorvi.eve.evegraphql.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class Star {
	@JsonProperty("age")
	private long age;
	@JsonProperty("luminosity")
	private float luminosity;
	@JsonProperty("name")
	private String name;
	@JsonProperty("radius")
	private long radius;
	@JsonProperty("solarSystemId")
	private long solarSystemId;
	@JsonProperty("spectral_class")
	private SpectralClass spectralClass;
	@JsonProperty("temperature")
	private int temperature;
	@JsonProperty("type_id")
	private long typeId;
	
	private ItemType itemType;
	private com.ordocorvi.eve.evegraphql.dto.System solarSystem;
	private long starId;
}
