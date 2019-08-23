package com.ordocorvi.eve.evegraphql.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class Ancestry {
	@JsonProperty("bloodline_id")
	private long bloodlineId;
	@JsonProperty("description")
	private String description;
	@JsonProperty("icon_id")
	private long iconId;
	@JsonProperty("id")
	private long id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("short_description")
	private String shortDescription;
	
	//Non Json Values
	private Bloodline bloodline;
	private Icon icon;
}
