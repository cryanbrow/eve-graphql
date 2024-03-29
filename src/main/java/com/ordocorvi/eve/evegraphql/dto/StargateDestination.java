package com.ordocorvi.eve.evegraphql.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class StargateDestination {
	@JsonProperty("stargate_id")
	private long stargateId;
	@JsonProperty("system_id")
	private long systemId;
	
	
	private Stargate stargate;
	private com.ordocorvi.eve.evegraphql.dto.System system;
}
