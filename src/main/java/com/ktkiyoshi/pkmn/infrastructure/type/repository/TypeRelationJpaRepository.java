package com.ktkiyoshi.pkmn.infrastructure.type.repository;

import com.ktkiyoshi.pkmn.infrastructure.name.entity.key.TypeRelationKeyId;
import com.ktkiyoshi.pkmn.infrastructure.type.entity.TypeRelationEntity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JPAを利用するためのインタフェース
 * @author Takahiro
 */
public interface TypeRelationJpaRepository extends JpaRepository<TypeRelationEntity, TypeRelationKeyId> {
	List<TypeRelationEntity> findListByAttackId(Integer attack_id);
}

