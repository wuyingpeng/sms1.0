package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Question;
import com.briup.app02.dao.QuestionMapper;
import com.briup.app02.service.IQuestionService;
import com.briup.app02.dao.extend.QuestionVMMapper;
import com.briup.app02.vm.QuestionVM;

@Service

public class QuestionServiceImpl implements IQuestionService {
	@Autowired
	private QuestionVMMapper questionVMMapper;

	@Override
	public List<QuestionVM> findAllQuestionVM() throws Exception {
		return questionVMMapper.findAllQuestionVM();
	}

	
	@Autowired
	private QuestionMapper questionMapper;
	@Override
	public List<Question> findAll() throws Exception{
		List<Question> list=questionMapper.findAll();
		return list;
		
	}
	@Override
	public Question findById(long id) throws Exception {
		// TODO Auto-generated method stub
		return questionMapper.findById(id);
	}
	@Override
	public void deleteById(long id) throws Exception {
		Question Question=questionMapper.findById(id);
		if(Question !=null){
			questionMapper.deleteById(id);
		}else{
			throw new Exception("要删除的Question不存在");
		}
		
	}
	@Override
	public void save(Question question) throws Exception {
		questionMapper.save(question);
		
	}
	@Override
	public void update(Question question) throws Exception {
		questionMapper.update(question);
		
	}
	@Override
	public void saveQuestion(QuestionVM questionVM) throws Exception {
		//怎么写？
		/*
		 * 1. 将question和option 从questionVM 中剥离出来
		 * 2. question List<Option>
		 * 3. 调用QuestionMapper.save(question)
		 * 4. 获取刚刚保存的question的id
		 * 5. 将所有的选项的外键设置为刚刚获取到question的id
		 * for(Option option : list){
		 *   option.setQuestionId(id)
		 *   OptionMapper.save(option)
		 *   }
		 */
		
		
	}
	
}

