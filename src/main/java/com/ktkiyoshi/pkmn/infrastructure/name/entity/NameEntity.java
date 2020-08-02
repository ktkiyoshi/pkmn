package com.ktkiyoshi.pkmn.infrastructure.name.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

import com.ktkiyoshi.pkmn.domain.object.Name;
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
@Table(name = "names")
public class NameEntity {
	
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "jp_name")
	private String jpName;

	@Column(name = "en_name")
	private String enName;

	@Column(name = "ge_name")
	private String geName;

	@Column(name = "fr_name")
	private String frName;

	@Column(name = "kr_name")
	private String krName;

	@Column(name = "created_at")
	private Timestamp createdAt;

	@Column(name = "updatedAt")
	private Timestamp updated_at;
	
	/**
	 * ドメインオブジェクトからインスタンスを生成
	 * @param name
	 * @return NameEntity
	 */
	public static NameEntity build(Name name) {
		return NameEntity.builder()
				.id(name.getId())
				.jpName(name.getJp_name())
				.enName(name.getEn_name())
				.geName(name.getGe_name())
				.frName(name.getFr_name())
				.krName(name.getFr_name())
				.build();
	}
	
	/**
	 * ドメインオブジェクトへ変換
	 * @return ドメインオブジェクト
	 */
	public Name toDomainName() {
		return Name.builder()
				.id(this.id)
				.jp_name(this.jpName)
				.en_name(this.enName)
				.ge_name(this.geName)
				.fr_name(this.frName)
				.kr_name(this.krName)
				.build();
	}
}
