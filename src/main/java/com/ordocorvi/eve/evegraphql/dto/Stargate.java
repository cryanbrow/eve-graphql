package com.ordocorvi.eve.evegraphql.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class Stargate {
	private StargateDestination destination;
	private String name;
	private Position position;
	private long id;
	private com.ordocorvi.eve.evegraphql.dto.System system;
	private ItemType item_type;
}
