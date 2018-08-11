package com.briup.app02.service;

import java.util.List;

import com.briup.app02.bean.Questionnaire;
import com.briup.app02.vm.QuestionnaireVM;



public interface IQuestionnaireService {
	List<QuestionnaireVM> findAllQuestionnaireVM() throws Exception;
	List<Questionnaire> findAll() throws Exception;
	Questionnaire findById(long id) throws Exception;
	void deleteById(long id) throws Exception;
	void save(Questionnaire questionnaire) throws Exception;
	void update(Questionnaire questionnaire) throws Exception;
	
}
