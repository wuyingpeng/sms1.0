package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Qq;
import com.briup.app02.service.IQqService;
import com.briup.app02.util.MsgResponse;
import com.briup.app02.vm.QqVM;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description="问卷相关接口")
@RestController
@RequestMapping("/qq")
public class QqController {
	@Autowired
	private IQqService qqService;
	
	@ApiOperation(value="查询所有问卷",
			notes="得出问卷调查的信息")
	
	@GetMapping("findAllQqVM")
	public MsgResponse findAllQqVM(){
		try {
			List<QqVM> list=qqService.findAllQqVM();
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("deleteQqById")
	public MsgResponse deleteQqById(long id){
		try {
			qqService.deleteById(id);
			return MsgResponse.success("删除成功",null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@PostMapping("updateQq")
	public MsgResponse update(Qq Qq){
		try {
			qqService.update(Qq);
			return MsgResponse.success("更新成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@PostMapping("saveQq")
	public MsgResponse save(Qq Qq){
		try {
			qqService.save(Qq);
			return MsgResponse.success("保存成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@GetMapping("findAllQq")
	public MsgResponse findAll(){
		try {
			List<Qq> list=qqService.findAll();
			return MsgResponse.success("查询成功", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@GetMapping("findQqById")
	public MsgResponse findById(long id){
		try {
			Qq Qq=qqService.findById(id);
			return MsgResponse.success("查询成功", Qq);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	

}

