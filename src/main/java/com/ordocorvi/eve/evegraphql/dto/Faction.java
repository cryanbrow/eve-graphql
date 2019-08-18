package com.ordocorvi.eve.evegraphql.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class Faction {
	private Corporation corporation;
	private String description;
	private Faction faction;
	private boolean is_unique;
	private Corporation militia_corporation;
	private String name;
	private float size_factor;
	private com.ordocorvi.eve.evegraphql.dto.System solar_system;
	private int station_count;
	private int station_system_count;
}
