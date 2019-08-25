package com.ordocorvi.eve.evegraphql.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class Faction {
	@JsonProperty("corporation_id")
	private long corporationId;
	@JsonProperty("description")
	private String description;
	@JsonProperty("faction_id")
	private long factionId;
	@JsonProperty("is_unique")
	private boolean isUnique;
	@JsonProperty("militia_corporation_id")
	private long militiaCorporationId;
	@JsonProperty("name")
	private String name;
	@JsonProperty("size_factor")
	private float sizeFactor;
	@JsonProperty("solar_system_id")
	private long solarSystemId;
	@JsonProperty("station_count")
	private int stationCount;
	@JsonProperty("station_system_count")
	private int stationSystemCount;
	
	//Non Json Values
	private Corporation corporation;
	private Corporation militiaCorporation;
	private com.ordocorvi.eve.evegraphql.dto.System solarSystem;
}
