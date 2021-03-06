package com.briup.app02.vm;

import java.util.List;

import com.briup.app02.bean.Option;
import com.briup.app02.bean.Qq;

public class QuestionVM {
	private Long id;
	private String name;
	private String questiontype;
	private List<Option> options;
	private List<Qq> qqs;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQuestiontype() {
		return questiontype;
	}
	
	public void setQuestiontype(String questiontype) {
		this.questiontype = questiontype;
	}
	public List<Option> getOptions() {
		return options;
	}
	public void setOptions(List<Option> options) {
		this.options = options;
	}
	public List<Qq> getQqs() {
		return qqs;
	}
	public void setQqs(List<Qq> qqs) {
		this.qqs = qqs;
	}
	
}
