package com.ordocorvi.eve.evegraphql.dto;

import java.util.List;

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
	private Corporation owner_corporation;
	private long owner;
	private Position position;
	private long race_id;
	private Race race;
	private float reprocessing_efficiency;
	private float reprocessing_stations_take;
	private List<Services> services;
	private long station_id;
	private long system_id;
	private System system;
	private ItemType station_type;
}
