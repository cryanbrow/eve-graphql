package com.ordocorvi.eve.evegraphql.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class Moon {
	@JsonProperty("moon_id")
	private long moonId;
	@JsonProperty("name")
	private String name;
	@JsonProperty("position")
	private Position position;
	@JsonProperty("system_id")
	private long systemId;
	
	//Non Json properties
	private com.ordocorvi.eve.evegraphql.dto.System system;
}
