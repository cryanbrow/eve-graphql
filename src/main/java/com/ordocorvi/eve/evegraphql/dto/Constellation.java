package com.ordocorvi.eve.evegraphql.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class Constellation {
	private long id;
	private String name;
	private Position position;
	private Region region;
	private List<com.ordocorvi.eve.evegraphql.dto.System> systems;
}
