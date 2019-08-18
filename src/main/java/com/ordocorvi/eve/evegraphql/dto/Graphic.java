package com.ordocorvi.eve.evegraphql.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class Graphic {
	private String collision_file;
	private String graphic_file;
	private long graphic_id;
	private String icon_folder;
	private String sof_dna;
	private String sof_faction_name;
	private String sof_hull_name;
	private String sof_race_name;
}
