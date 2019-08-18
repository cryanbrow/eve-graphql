package com.ordocorvi.eve.evegraphql.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode
public class Alliance {
	private Corporation creator_corporation;
	private Character creator;
	private Long date_founded;
	private Corporation executor_corporation;
	private Faction faction;
	private String name;
	private String ticker;
}
