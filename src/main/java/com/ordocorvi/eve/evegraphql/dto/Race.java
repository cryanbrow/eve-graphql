package com.ordocorvi.eve.evegraphql.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class Race {
	@JsonProperty("alliance_id")
	private long allianceId;
	@JsonProperty("description")
	private String description;
	@JsonProperty("name")
	private String name;
	@JsonProperty("race_id")
	private long raceId;
	
	
	private Alliance alliance;
}
