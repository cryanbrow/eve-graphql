package com.ordocorvi.eve.evegraphql.dto;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor @ToString
public enum Range {
	station("station"),
	region("region"),
	solarsystem("solarsystem"),
	range_1("1"),
	range_2("2"),
	range_3("3"),
	range_4("4"),
	range_5("5"),
	range_10("10"),
	range_20("20"),
	range_30("30"),
	range_40("40");
	
	private String value;

	@JsonValue
	public String getValue() {
		return value;
	}
}
