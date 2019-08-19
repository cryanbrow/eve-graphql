package com.ordocorvi.eve.evegraphql.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class Corporation {
	private Alliance alliance_id;
	private com.ordocorvi.eve.evegraphql.dto.Character ceo;
	private com.ordocorvi.eve.evegraphql.dto.Character creator_id;
	private String date_founded;
	private String description;
	private Faction faction;
	private Station home_station_id;
	private int member_count;
	private String name;
	private int shares;
	private float tax_rate;
	private String ticker;
	private String url;
	private boolean war_eligible;
}
