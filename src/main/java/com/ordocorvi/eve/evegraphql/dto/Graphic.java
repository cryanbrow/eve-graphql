package com.ordocorvi.eve.evegraphql.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class Graphic {
	@JsonProperty("collision_file")
	private String collisionFile;
	@JsonProperty("graphic_file")
	private String graphicFile;
	@JsonProperty("graphic_id")
	private long graphicId;
	@JsonProperty("icon_folder")
	private String iconFolder;
	@JsonProperty("sof_dna")
	private String sofDna;
	@JsonProperty("sof_faction_name")
	private String sofFactionName;
	@JsonProperty("sof_hull_name")
	private String sofHullName;
	@JsonProperty("sof_race_name")
	private String sofRaceName;
}
