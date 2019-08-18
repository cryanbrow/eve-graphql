package com.ordocorvi.eve.evegraphql.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class Ancestry {
	private Bloodline bloodline;
	private String description;
	private Icon icon;
	private long id;
	private String name;
	private String short_description;
}
