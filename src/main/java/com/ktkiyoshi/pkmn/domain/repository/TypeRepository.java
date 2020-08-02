package com.ktkiyoshi.pkmn.domain.repository;

import java.util.List;

import com.ktkiyoshi.pkmn.domain.object.Type;

/**
 * インフラ層とのインタフェース
 * @author Takahiro
 * 
 */
public interface TypeRepository {

	List<Type> findAll();

	/**
	 * タイプ検索
	 * @param id
	 * @return Type
	 */
	Type findById(Integer id);
}
