package com.briup.app02.service;

import java.util.List;

import com.briup.app02.bean.Clazz;
import com.briup.app02.vm.ClazzVM;




public interface IClazzService {
	
	List<ClazzVM> findAllClazzVM() throws Exception;
	List<Clazz> findAll() throws Exception;
	Clazz findById(long id) throws Exception;
	
	
}