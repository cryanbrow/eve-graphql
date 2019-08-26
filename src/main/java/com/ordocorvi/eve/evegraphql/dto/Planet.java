package com.ordocorvi.eve.evegraphql.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class Planet {
	@JsonProperty("name")
	private String name;
	@JsonProperty("planet_id")
	private long planetId;
	@JsonProperty("position")
	private Position position;
	@JsonProperty("system_id")
	private long systemId;
	@JsonProperty("type_id")
	private long typeId;
	
	private com.ordocorvi.eve.evegraphql.dto.System system;
	private ItemType itemType;
	
}
