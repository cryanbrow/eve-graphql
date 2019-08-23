package com.ordocorvi.eve.evegraphql.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class Alliance {
	@JsonProperty("creator_corporation_id")
	private long creator_corporation_id;
	@JsonProperty("creator_id")
	private long creator_id;
	@JsonProperty("date_founded")
	private String dateFounded;
	@JsonProperty("executor_corporation_id")
	private long executor_corporation_id;
	@JsonProperty("faction_id")
	private long faction_id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("ticker")
	private String ticker;
	
	
	private Corporation creatorCorporation;
	private Character creator;
	private Corporation executorCorporation;
	private Faction faction;
}
