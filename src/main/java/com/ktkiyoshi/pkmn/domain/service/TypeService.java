package com.ktkiyoshi.pkmn.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ktkiyoshi.pkmn.domain.object.Type;
import com.ktkiyoshi.pkmn.domain.repository.TypeRelationRepository;
import com.ktkiyoshi.pkmn.domain.repository.TypeRepository;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * 名前操作のロジック
 * @author Takahiro
 *  
 */
@Service
@RequiredArgsConstructor
public class TypeService {
	
	@NonNull
	private final TypeRepository typeRepository;
	
	@NonNull
	private final TypeRelationRepository typeRelationRepository;
	
	/**
	 * タイプ全検索
	 * @param id
	 * @return List<Type>
	 */
	public List<Type> findAll() {

		List<Type> typeList = this.typeRepository.findAll();
		typeList.forEach((type) -> {
			type.setAttack_relations(this.typeRelationRepository.findByAttackId(type.getId()));
		});
		
		return typeList;
	}
	
	/**
	 * タイプID検索
	 * @param id
	 * @return Type
	 */
	public Type findById(Integer id) {
		Type type = this.typeRepository.findById(id);
		type.setAttack_relations(this.typeRelationRepository.findByAttackId(type.getId()));

		return type;
	}
}
