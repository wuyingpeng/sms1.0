package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Questionnaire;
import com.briup.app02.service.IQuestionnaireService;
import com.briup.app02.util.MsgResponse;
import com.briup.app02.vm.QuestionnaireVM;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description="问卷调查相关接口")
@RestController
@RequestMapping("/questionnaire")
public class QuestionnaireController {
	@Autowired
	private IQuestionnaireService questionnaireService;
	
	@ApiOperation(value="显示问卷调查",notes="表明问卷调查结果")
	@GetMapping("findAllQuestionnaireVM")
	public MsgResponse findAllQuestionnaireVM(){
		try {
			List<QuestionnaireVM> list = questionnaireService.findAllQuestionnaireVM();
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("deleteQuestionnaireById")
	public MsgResponse deleteQuestionnaireById(long id){
		try {
			questionnaireService.deleteById(id);
			return MsgResponse.success("删除成功",null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@PostMapping("updateQuestionnaire")
	public MsgResponse update(Questionnaire Questionnaire){
		try {
			questionnaireService.update(Questionnaire);
			return MsgResponse.success("更新成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@PostMapping("saveQuestionnaire")
	public MsgResponse save(Questionnaire Questionnaire){
		try {
			questionnaireService.save(Questionnaire);
			return MsgResponse.success("保存成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@GetMapping("findAllQuestionnaire")
	public MsgResponse findAll(){
		try {
			List<Questionnaire> list=questionnaireService.findAll();
			return MsgResponse.success("查询成功", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@GetMapping("findQuestionnaireById")
	public MsgResponse findById(long id){
		try {
			Questionnaire Questionnaire=questionnaireService.findById(id);
			return MsgResponse.success("查询成功", Questionnaire);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	

}


