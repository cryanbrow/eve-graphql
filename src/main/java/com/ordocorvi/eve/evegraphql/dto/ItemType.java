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
public class ItemType {
	@JsonProperty("type_id")
	private long typeId;
	@JsonProperty("capacity")
	private float capacity;
	@JsonProperty("description")
	private String description;
	@JsonProperty("dogma_attributes")
	private List<DogmaAttribute> dogmaAttributes;
	@JsonProperty("dogma_effects")
	private List<DogmaEffect> dogmaEffects;
	@JsonProperty("graphic_id")
	private long graphicId;
	@JsonProperty("group_id")
	private long groupId;
	@JsonProperty("icon_id")
	private long iconId;
	@JsonProperty("market_group_id")
	private long marketGroupId;
	@JsonProperty("mass")
	private float mass;
	@JsonProperty("name")
	private String name;
	@JsonProperty("packaged_volume")
	private float packagedVolume;
	@JsonProperty("portion_size")
	private int portionSize;
	@JsonProperty("published")
	private boolean published;
	@JsonProperty("radius")
	private float radius;
	@JsonProperty("volume")
	private float volume;
	
	//Non Json properties
	private Graphic graphic;
	private Group group;
	private Icon icon;
	private MarketGroup marketGroup;
}
