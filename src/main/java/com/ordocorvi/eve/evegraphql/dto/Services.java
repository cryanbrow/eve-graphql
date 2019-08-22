package com.ordocorvi.eve.evegraphql.dto;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor @ToString
public enum Services {
	bounty_missions("bounty-missions"),
	assasination_missions("assasination-missions"),
	courier_missions("courier-missions"),
	interbus("interbus"),
	reprocessing_plant("reprocessing-plant"),
	refinery("refinery"),
	market("market"),
	black_market("black-market"),
	stock_exchange("stock-exchange"),
	cloning("cloning"),
	surgery("surgery"),
	dna_therapy("dna-therapy"),
	repair_facilities("repair-facilities"),
	factory("factory"),
	labratory("labratory"),
	gambling("gambling"),
	fitting("fitting"),
	paintshop("paintshop"),
	news("news"),
	storage("storage"),
	insurance("insurance"),
	docking("docking"),
	office_rental("office-rental"),
	jump_clone_facility("jump-clone-facility"),
	loyalty_point_store("loyalty-point-store"),
	navy_offices("navy-offices"),
	security_offices("security-offices");
	
	private String value;

	@JsonValue
	public String getValue() {
		return value;
	}
}
