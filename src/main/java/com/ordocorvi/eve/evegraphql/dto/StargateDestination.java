package com.ordocorvi.eve.evegraphql.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class StargateDestination {
	private Stargate stargate;
	private com.ordocorvi.eve.evegraphql.dto.System system;
}
