package com.ktkiyoshi.pkmn.application.controller;

import org.springframework.web.bind.annotation.*;

import com.ktkiyoshi.pkmn.domain.object.Type;
import com.ktkiyoshi.pkmn.domain.service.TypeService;
import com.ktkiyoshi.pkmn.utils.LogUtils;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.HttpStatus;

/**
 * 名前操作のコントローラ 
 * @author Takahiro
 * 
 */
@RestController
@RequiredArgsConstructor
public class TypeController {
	
	/**
	 * 依存性注入
	 */
	@NonNull
	private final TypeService typeService;

    /**
     * タイプ一覧
     * 
     * @return タイプ
     */
    @GetMapping(value = "/v1/types")
    @ResponseStatus(HttpStatus.OK)
    public List<Type> getTypes() {
    	return this.typeService.findAll();
    }
    
    @GetMapping(value = "v1/types/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Type getTypeById(@PathVariable("id") Integer id) {
    	LogUtils.info(this.typeService.findById(id).getName());
    	return this.typeService.findById(id);
    }
}