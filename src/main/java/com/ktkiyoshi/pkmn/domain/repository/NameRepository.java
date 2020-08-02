package com.ktkiyoshi.pkmn.domain.repository;

import com.ktkiyoshi.pkmn.domain.object.Name;

/**
 * ドメイン層で使いたいインタフェースを、ここで定義する
 * このインタフェースによって、ドメイン層とインフラ層の依存関係が逆転する(依存関係逆転の原則)
 * 
 * インフラ層とのインタフェース
 * @author Takahiro
 * 
 */
public interface NameRepository {

	/**
	 * 名前検索
	 * @param id
	 * @return 名前
	 */
	Name findById(Integer id);
}
