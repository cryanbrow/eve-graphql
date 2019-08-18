package com.ordocorvi.eve.evegraphql.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class Character {
	private Alliance alliance;
	private Ancestry ancestry;
	private String birthday;
	private Bloodline bloodline;
	private Corporation corporation;
	private String description;
	private Faction faction;
	private Gender gender;
	private String name;
	private Race race;
	private float security_status;
	private String title;
}
