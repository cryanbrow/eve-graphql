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
public class System {
	@JsonProperty("constellation_id")
	private long constellationId;
	@JsonProperty("name")
	private String name;
	@JsonProperty("planets")
	private List<SystemPlanet> planets;
	@JsonProperty("position")
	private Position position;
	@JsonProperty("security_class")
	private String securityClass;
	@JsonProperty("star_id")
	private long starId;
	@JsonProperty("stargates")
	private List<Long> stargateIds;
	@JsonProperty("stations")
	private List<Long> stationIds;
	@JsonProperty("system_id")
	private long systemId;

	
	private Constellation constellation;
	private Star star;
	private List<Stargate> stargateList;
	private List<Station> stationList;
}
