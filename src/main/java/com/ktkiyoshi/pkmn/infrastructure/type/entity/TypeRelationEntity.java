package com.ktkiyoshi.pkmn.infrastructure.type.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.sql.Timestamp;

import com.ktkiyoshi.pkmn.domain.object.TypeRelation;
import com.ktkiyoshi.pkmn.infrastructure.name.entity.key.TypeRelationKeyId;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * RDBレコードのマッピング用クラス
 * @author Takahiro
 * 
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "type_relations")
@IdClass(TypeRelationKeyId.class)
public class TypeRelationEntity {

	@Id
	@Column(name = "attack_id")
	private Integer attackId;

	@Id
	@Column(name = "defense_id")
	private Integer defenseId;

	@Column(name = "effect_rate")
	private Float effectRate;
	
	@Column(name = "created_at")
	private Timestamp createdAt;

	@Column(name = "updated_at")
	private Timestamp updatedAt;
	
	/**
	 * ドメインオブジェクトからインスタンスを生成
	 * @param typeRelation
	 * @return TypeEntity
	 */
	public static TypeRelationEntity build(TypeRelation typeRelation) {
		return TypeRelationEntity.builder()
				.attackId(typeRelation.getAttack_id())
				.defenseId(typeRelation.getDefense_id())
				.effectRate(typeRelation.getEffect_rate())
				.build();
	}
	
	/**
	 * ドメインオブジェクトへ変換
	 * @return ドメインオブジェクト
	 */
	public TypeRelation toDomainTypeRelation() {
		return TypeRelation.builder()
				.attack_id(this.attackId)
				.defense_id(this.defenseId)
				.effect_rate(this.effectRate)
				.build();
	}

}
