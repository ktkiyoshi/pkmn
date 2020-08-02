package com.ktkiyoshi.pkmn.application.resource;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.ktkiyoshi.pkmn.domain.object.Name;

import lombok.Data;

/**
 * 名前登録のPOSTリクエスト時のbodyをマッピングするクラス
 * バリデーションと、ドメインオブジェクトへの変換処理をもたせる
 * 
 * リクエストボディのマッピング用クラス
 * @author Takahiro
 * 
 */
@Data
public class NameBody {
	
	@NotBlank
	@Size(max = 5)
	private Integer id;
	
	@NotBlank
	private String jp_name;
	
	@NotBlank
	private String en_name;
	
	@NotBlank
	private String ge_name;
	
	@NotBlank
	private String fr_name;
	
	@NotBlank
	private String kr_name;
	
	/**
	 * ドメインオブジェクトへ変換
	 * @return ドメインオブジェクト
	 */
	public Name toDomainName() {
		return Name.builder()
				.id(this.id)
				.jp_name(this.jp_name)
				.en_name(this.en_name)
				.ge_name(this.ge_name)
				.fr_name(this.fr_name)
				.kr_name(this.kr_name)
				.build();
	}

}
