package com.ordocorvi.eve.evegraphql.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class Station {
	@JsonProperty("max_dockable_ship_volume")
	private float maxDockableShipVolume;
	@JsonProperty("name")
	private String name;
	@JsonProperty("office_rental_cost")
	private float officeRentalCost;
	@JsonProperty("owner")
	private long ownerId;
	@JsonProperty("position")
	private Position position;
	@JsonProperty("race_id")
	private long raceId;
	@JsonProperty("reprocessing_efficiency")
	private float reprocessingEfficiency;
	@JsonProperty("reprocessing_stations_take")
	private float reprocessingStationsTake;
	@JsonProperty("services")
	private List<Services> services;
	@JsonProperty("station_id")
	private long stationId;
	@JsonProperty("system_id")
	private long systemId;
	
	private Corporation owningCorporation;
	private Race race;
	private com.ordocorvi.eve.evegraphql.dto.System system;
	private ItemType stationType;
}
