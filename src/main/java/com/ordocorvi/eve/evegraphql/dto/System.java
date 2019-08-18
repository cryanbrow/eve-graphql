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
	private String name;
	private List<Planet> planets;
	private Position position;
	private String security_class;
	private Star star;
	private List<Stargate> stargates;
	private List<Station> stations;
	private long id;
}
