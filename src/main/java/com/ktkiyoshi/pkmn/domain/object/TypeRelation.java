package com.ktkiyoshi.pkmn.domain.object;

import lombok.Builder;
import lombok.Data;

/**
 * 名前
 * @author Takahiro
 * 
 */
@Data
@Builder
public class TypeRelation {
	
	/**
	 * 攻撃ID
	 */
	private Integer attack_id;

	/**
	 * 防御ID
	 */
	private Integer defense_id;
	
	/**
	 * 威力倍率
	 */
	private Float effect_rate;

}
