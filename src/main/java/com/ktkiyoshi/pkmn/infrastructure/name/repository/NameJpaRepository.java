package com.ktkiyoshi.pkmn.infrastructure.name.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ktkiyoshi.pkmn.infrastructure.name.entity.NameEntity;

/**
 * JPAの実装を利用するために必要なインタフェース
 * JpaRepositoryを継承し、Entityクラスと、プライマリキーの型を指定する
 * 実行時にはSimpleJpaRepositoryというspring-data-jpaが用意している標準実装が
 * DIコンテナによって注入されるため、実装クラスを記述する必要はない
 * 
 * JPAを利用するためのインタフェース
 * @author Takahiro
 */
public interface NameJpaRepository extends JpaRepository<NameEntity, Integer> {
}