package com.ktkiyoshi.pkmn.infrastructure.type.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ktkiyoshi.pkmn.infrastructure.type.entity.TypeEntity;

/**
 * JPAを利用するためのインタフェース
 * @author Takahiro
 */
public interface TypeJpaRepository extends JpaRepository<TypeEntity, Integer> {
}

