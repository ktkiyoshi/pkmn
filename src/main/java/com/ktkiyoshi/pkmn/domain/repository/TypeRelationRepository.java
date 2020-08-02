package com.ktkiyoshi.pkmn.domain.repository;

import java.util.List;

import com.ktkiyoshi.pkmn.domain.object.TypeRelation;

/**
 * インフラ層とのインタフェース
 * @author Takahiro
 * 
 */
public interface TypeRelationRepository {

	/**
	 * タイプ関係検索
	 * @param attack_id
	 * @return TypeRelation
	 */
	List<TypeRelation> findByAttackId(Integer attack_id);
}
