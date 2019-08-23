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
public class Category {
	@JsonProperty("category_id")
	private long categoryId;
	@JsonProperty("groups")
	private List<Integer> groupIds;
	@JsonProperty("name")
	private String name;
	@JsonProperty("published")
	private boolean published;
	
	//Non Json properties
	private List<Group> groups;
}
