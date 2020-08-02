package com.ktkiyoshi.pkmn.infrastructure.type.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

import com.ktkiyoshi.pkmn.domain.object.Type;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * MySQLのレコードがマッピングされるクラス
 * Domain Object(Name.java)と双方向に変換するメソッドを定義
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
@Table(name = "types")
public class TypeEntity {
	
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "short_name")
	private String shortName;

	@Column(name = "color")
	private String color;

	@Column(name = "created_at")
	private Timestamp createdAt;

	@Column(name = "updated_at")
	private Timestamp updatedAt;
	
	/**
	 * ドメインオブジェクトからインスタンスを生成
	 * @param type
	 * @return TypeEntity
	 */
	public static TypeEntity build(Type type) {
		return TypeEntity.builder()
				.id(type.getId())
				.name(type.getName())
				.color(type.getColor())
				.shortName(type.getShort_name())
				.build();
	}
	
	/**
	 * ドメインオブジェクトへ変換
	 * @return ドメインオブジェクト
	 */
	public Type toDomainType() {
		return Type.builder()
				.id(this.id)
				.name(this.name)
				.short_name(this.shortName)
				.color(this.color)
				.build();
	}

}
