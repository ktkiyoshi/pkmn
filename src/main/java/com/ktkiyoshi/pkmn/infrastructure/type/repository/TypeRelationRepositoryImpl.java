package com.ktkiyoshi.pkmn.infrastructure.type.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ktkiyoshi.pkmn.domain.object.TypeRelation;
import com.ktkiyoshi.pkmn.domain.repository.TypeRelationRepository;

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
public class TypeRelationRepositoryImpl implements TypeRelationRepository {
	
	@NonNull
	private final TypeRelationJpaRepository typeRelationJpaRepository;
	
	public List<TypeRelation> findByAttackId(Integer attack_id) {		
		// 返却用リストに詰め替え
		List<TypeRelation> rtnList = new ArrayList<>();
		this.typeRelationJpaRepository.findListByAttackId(attack_id)
			.forEach((typeRelationEntity) -> {
				rtnList.add(typeRelationEntity.toDomainTypeRelation());
		});
		return rtnList;
	}

}
