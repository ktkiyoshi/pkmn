package com.ktkiyoshi.pkmn.infrastructure.name.repository;

import org.springframework.stereotype.Repository;

import com.ktkiyoshi.pkmn.domain.exception.NotFoundException;
import com.ktkiyoshi.pkmn.domain.object.Name;
import com.ktkiyoshi.pkmn.domain.repository.NameRepository;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * 永続化の実装クラス
 * ドメインオブジェクトをEntityに変換してJPAをラップする
 * @author Takahiro
 * 
 */
@Repository
@RequiredArgsConstructor
public class NameRepositoryImpl implements NameRepository {
	
	@NonNull
	private final NameJpaRepository nameJpaRepository;

	public Name findById(Integer id) {
		return this.nameJpaRepository.findById(id)
				.orElseThrow(() -> new NotFoundException(id + " is not found."))
				.toDomainName();
	}

}
