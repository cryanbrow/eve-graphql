package com.ordocorvi.eve.evegraphql.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class Planet {
	private List<AsteroidBelt> asteroid_belts;
	private List<Moon> moons;
	private long id;
}
