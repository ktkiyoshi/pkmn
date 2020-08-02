package com.ktkiyoshi.pkmn.application.controller;

import org.springframework.web.bind.annotation.*;

import com.ktkiyoshi.pkmn.domain.object.Name;
import com.ktkiyoshi.pkmn.domain.service.NameService;
import com.ktkiyoshi.pkmn.utils.LogUtils;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;

/**
 * 名前操作のコントローラ 
 * @author Takahiro
 * 
 */
@RestController
@RequiredArgsConstructor
public class NameController {
	
	/**
	 * 依存性注入
	 */
	@NonNull
	private final NameService nameService;

    /**
     * 名前検索
     * 
     * @param id
     * @return 名前
     */
    @GetMapping(value = "/v1/names/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Name getName(@PathVariable("id") Integer id) {
    	LogUtils.info(this.nameService.findById(id).getJp_name());
    	return this.nameService.findById(id);
    }
}