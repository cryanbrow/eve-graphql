package com.ordocorvi.eve.evegraphql.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class System {
	private Constellation constellation;
	private long constellation_id;
	private String name;
	private List<Long> planets;
	private List<Planet> planets_details;
	private Position position;
	private String security_class;
	private Star star;
	private long star_id;
	private List<Long> stargates;
	private List<Stargate> stargates_details;
	private List<Long> stations;
	private List<Station> stations_details;
	private long id;
}
