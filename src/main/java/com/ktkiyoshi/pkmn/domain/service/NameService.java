package com.ktkiyoshi.pkmn.domain.service;

import org.springframework.stereotype.Service;

import com.ktkiyoshi.pkmn.domain.object.Name;
import com.ktkiyoshi.pkmn.domain.repository.NameRepository;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * Name.javaに記述するのは不自然なビジネスロジックを記述するクラス。
 * 先程定義したインタフェースを利用して、永続化されている名前情報を操作する。
 * NameRepositoryの実装クラスは、SpringのDIコンテナという仕組みを利用して解決する。
 * 
 * 名前操作のロジック
 * @author Takahiro
 *  
 */
@Service
@RequiredArgsConstructor
public class NameService {
	
	@NonNull
	private final NameRepository nameRepository;
	
	/**
	 * 名前検索
	 * @param id
	 * @return 名前
	 */
	public Name findById(Integer id) {
		return this.nameRepository.findById(id);
	}

}
