package com.ordocorvi.eve.evegraphql.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class Corporation {
	@JsonProperty("alliance_id")
	private Alliance allianceId;
	@JsonProperty("ceo_id")
	private com.ordocorvi.eve.evegraphql.dto.Character ceoId;
	@JsonProperty("creator_id")
	private com.ordocorvi.eve.evegraphql.dto.Character creatorId;
	@JsonProperty("date_founded")
	private String dateFounded;
	@JsonProperty("description")
	private String description;
	@JsonProperty("faction_id")
	private long factionId;
	@JsonProperty("home_station_id")
	private Station homeStationId;
	@JsonProperty("member_count")
	private int memberCount;
	@JsonProperty("name")
	private String name;
	@JsonProperty("shares")
	private int shares;
	@JsonProperty("tax_rate")
	private float taxRate;
	@JsonProperty("ticker")
	private String ticker;
	@JsonProperty("url")
	private String url;
	@JsonProperty("war_eligible")
	private boolean warEligible;
	
	//Non Json Properties
	private Alliance alliance;
	private com.ordocorvi.eve.evegraphql.dto.Character ceo;
	private com.ordocorvi.eve.evegraphql.dto.Character creator;
	private Faction faction;
	private Station homeStation;
}
