package com.ordocorvi.eve.evegraphql.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class Star {
	private int age;
	private float luminosity;
	private String name;
	private int radius;
	private com.ordocorvi.eve.evegraphql.dto.System solar_system;
	private SpectralClass spectral_class;
	private long id;
	private int temperature;
	private ItemType item_type;
}
