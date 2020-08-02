package com.ktkiyoshi.pkmn.infrastructure.type.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ktkiyoshi.pkmn.domain.exception.NotFoundException;
import com.ktkiyoshi.pkmn.domain.object.Type;
import com.ktkiyoshi.pkmn.domain.repository.TypeRepository;

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
public class TypeRepositoryImpl implements TypeRepository {
	
	@NonNull
	private final TypeJpaRepository typeJpaRepository;
	
	public List<Type> findAll() {
		// 返却用リストに詰め替え
		List<Type> rtnList = new ArrayList<>();
		this.typeJpaRepository.findAll().forEach((typeEntity) -> {
			rtnList.add(typeEntity.toDomainType());
		});
		return rtnList;				
	}

	public Type findById(Integer id) {
		return this.typeJpaRepository.findById(id)
				.orElseThrow(() -> new NotFoundException(id + " is not found."))
				.toDomainType();
	}

}
