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
public class Constellation {
	@JsonProperty("constellation_id")
	private long constellationId;
	@JsonProperty("name")
	private String name;
	@JsonProperty("position")
	private Position position;
	@JsonProperty("region_id")
	private long regionId;
	@JsonProperty("systems")
	private long systemIds;
	
	//Non Json properties
	private Region region;
	private List<com.ordocorvi.eve.evegraphql.dto.System> solarSystems;
}
