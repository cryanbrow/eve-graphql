package com.ordocorvi.eve.evegraphql.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class Stargate {
	@JsonProperty("destination")
	private StargateDestination destination;
	@JsonProperty("name")
	private String name;
	@JsonProperty("position")
	private Position position;
	@JsonProperty("stargate_id")
	private long stargateId;
	@JsonProperty("system_id")
	private long systemId;
	@JsonProperty("type_id")
	private long typeId;
	
	
	private com.ordocorvi.eve.evegraphql.dto.System system;
	private ItemType itemType;
}
