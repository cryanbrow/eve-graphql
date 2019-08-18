package com.ordocorvi.eve.evegraphql.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class DogmaEffectDetail {
	private String description;
	private boolean disallow_auto_repeat;
	private DogmaAttribute discharge_attribute;
	private String display_name;
	private DogmaAttribute duration_attribute;
	private int effect_category;
	private int effect_id;
	private boolean electronic_chance;
	private int falloff_attribute_id;
	private Icon icon;
	private boolean is_assistance;
	private boolean is_offensive;
	private boolean is_warp_safe;
	private List<Modifier> modifiers;
	private String name;
	private int post_expression;
	private int pre_expression;
	private boolean published;
	private int range_attribute_id;
	private boolean range_change;
	private int tracking_speed_attribute_id;
}
