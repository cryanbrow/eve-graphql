package com.ordocorvi.eve.evegraphql.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class SystemPlanet {
	@JsonProperty("asteroid_belts")
	private List<Long> asteroidBeltIds;
	@JsonProperty("moons")
	private List<Long> moonIds;
	@JsonProperty("planet_id")
	private long planetId;
	
	private List<AsteroidBelt> asteroidBelts;
	private List<Moon> moonList;
	private Planet planetProperties;
}
