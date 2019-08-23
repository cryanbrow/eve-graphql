package com.ordocorvi.eve.evegraphql.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class DogmaEffectDetail {
	@JsonProperty("description")
	private String description;
	@JsonProperty("disallow_auto_repeat")
	private boolean disallowAutoRepeat;
	@JsonProperty("discharge_attribute")
	private DogmaAttribute dischargeAttributeId;
	@JsonProperty("display_name")
	private String displayName;
	@JsonProperty("duration_attribute")
	private DogmaAttribute durationAttributeId;
	@JsonProperty("effect_category")
	private int effectCategory;
	@JsonProperty("effect_id")
	private int effectId;
	@JsonProperty("electronic_chance")
	private boolean electronicChance;
	@JsonProperty("falloff_attribute_id")
	private int falloffAttributeId;
	@JsonProperty("icon_id")
	private Icon iconId;
	@JsonProperty("is_assistance")
	private boolean isAssistance;
	@JsonProperty("is_offensive")
	private boolean isOffensive;
	@JsonProperty("is_warp_safe")
	private boolean isWarpSafe;
	@JsonProperty("modifiers")
	private List<Modifier> modifiers;
	@JsonProperty("name")
	private String name;
	@JsonProperty("post_expression")
	private int postExpression;
	@JsonProperty("pre_expression")
	private int preExpression;
	@JsonProperty("published")
	private boolean published;
	@JsonProperty("range_attribute_id")
	private int rangeAttributeId;
	@JsonProperty("range_change")
	private boolean rangeChange;
	@JsonProperty("tracking_speed_attribute_id")
	private int trackingSpeedAttributeId;
	
	private DogmaAttribute dischargeAttribute;
	private DogmaAttribute durationAttribute;
	private Icon icon;
}
