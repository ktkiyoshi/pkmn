package com.ktkiyoshi.pkmn.domain.object;

import java.util.List;

import lombok.Builder;
import lombok.Data;

/**
 * 名前
 * @author Takahiro
 * 
 */
@Data
@Builder
public class Type {
	
	/**
	 * ID
	 */
	private Integer id;
	
	/**
	 * タイプ名
	 */
	private String name;

	/**
	 * タイプ短縮名
	 */
	private String short_name;

	/**
	 * タイプ色
	 */
	private String color;

	/**
	 * タイプ攻防関係
	 */
	private List<TypeRelation> attack_relations;
	
}
