package com.ordocorvi.eve.evegraphql.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class Character {
	@JsonProperty("alliance_id")
	private Alliance allianceId;
	@JsonProperty("ancestry_id")
	private Ancestry ancestryId;
	@JsonProperty("birthday")
	private String birthday;
	@JsonProperty("bloodline_id")
	private Bloodline bloodlineId;
	@JsonProperty("corporation_id")
	private Corporation corporationId;
	@JsonProperty("description")
	private String description;
	@JsonProperty("faction_id")
	private Faction factionId;
	@JsonProperty("gender")
	private Gender gender;
	@JsonProperty("name")
	private String name;
	@JsonProperty("race_id")
	private Race raceId;
	@JsonProperty("security_status")
	private float securityStatus;
	@JsonProperty("title")
	private String title;
	
	//Non Json properties
	private Alliance alliance;
	private Ancestry ancestry;
	private Bloodline bloodline;
	private Corporation corporation;
	private Faction faction;
	private Race race;
}
