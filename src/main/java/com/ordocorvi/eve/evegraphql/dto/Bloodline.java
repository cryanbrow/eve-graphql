package com.ordocorvi.eve.evegraphql.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class Bloodline {
	private long id;
	private int charisma;
	private Corporation corporation;
	private String description;
	private int intelligence;
	private int memory;
	private String name;
	private int perception;
	private Race race;
	private ItemType ship_type;
	private int willpower;
}
