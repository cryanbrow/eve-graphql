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
public class Group {
	@JsonProperty("category_id")
	private long categoryId;
	@JsonProperty("group_id")
	private long groupId;
	@JsonProperty("name")
	private String name;
	@JsonProperty("published")
	private boolean published;
	@JsonProperty("types")
	private List<Long> types;

	//Non Json properties
	private Category category;
	private List<ItemType> itemTypes;
}
