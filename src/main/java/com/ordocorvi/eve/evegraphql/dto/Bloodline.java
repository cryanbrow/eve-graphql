package com.ordocorvi.eve.evegraphql.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class Bloodline {
	@JsonProperty("id")
	private long id;
	@JsonProperty("charisma")
	private int charisma;
	@JsonProperty("corporation_id")
	private long corporationId;
	@JsonProperty("description")
	private String description;
	@JsonProperty("intelligence")
	private int intelligence;
	@JsonProperty("memory")
	private int memory;
	@JsonProperty("name")
	private String name;
	@JsonProperty("perception")
	private int perception;
	@JsonProperty("race_id")
	private long raceId;
	@JsonProperty("ship_type_id")
	private long shipTypeId;
	@JsonProperty("willpower")
	private int willpower;
	
	//Non Json Values
	private Corporation corporation;
	private Race race;
	private ItemType shipType;
}
