package com.ordocorvi.eve.evegraphql.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class ItemType {
	private long id;
	private float capacity;
	private String description;
	private List<DogmaAttribute> dogma_attributes;
	private List<DogmaEffect> dogma_effects;
	private Graphic graphic;
	private Group group;
	private Icon icon;
	private MarketGroup market_group;
	private float mass;
	private String name;
	private float packaged_volume;
	private int portion_size;
	private boolean published;
	private float radius;
	private int type_id;
	private float volume;
}
