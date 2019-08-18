package com.ordocorvi.eve.evegraphql.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class DogmaAttributeDetail {
	private long id;
	private float default_value;
	private String description;
	private String display_name;
	private boolean high_is_good;
	private Icon icon;
	private String name;
	private boolean published;
	private boolean stackable;
	private Unit unit;
}
