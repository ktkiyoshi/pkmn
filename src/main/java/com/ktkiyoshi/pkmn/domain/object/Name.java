package com.ktkiyoshi.pkmn.domain.object;

import lombok.Builder;
import lombok.Data;

/**
 * アプリケーション上で、「名前」という概念を表現するためのクラス
 * 今回は特に振る舞いは無し、必要な情報を保持するだけ
 * Lombokを利用して簡潔に記述している
 * 
 * 名前
 * @author Takahiro
 * 
 */
@Data
@Builder
public class Name {
	
	/**
	 * ID
	 */
	private Integer id;
	
	/**
	 * 日本語名
	 */
	private String jp_name;
	
	/**
	 * 英語名
	 */
	private String en_name;

	/**
	 * ドイツ語名
	 */
	private String ge_name;

	/**
	 * フランス語名
	 */
	private String fr_name;

	/**
	 * 韓国語名
	 */
	private String kr_name;

}
