package com.ordocorvi.eve.evegraphql.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class Station {
	private float max_dockable_ship_volume;
	private String name;
	private float office_rental_cost;
	private Corporation owner;
	private Position position;
	private Race race_id;
	private float reprocessing_efficiency;
	private float reprocessing_stations_take;
	private Services services;
	private long station_id;
	private System system_id;
	private ItemType station_type;
}
