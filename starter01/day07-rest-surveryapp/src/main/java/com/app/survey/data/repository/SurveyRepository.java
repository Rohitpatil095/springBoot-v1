package com.app.survey.data.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.app.survey.data.Questions;
import com.app.survey.data.Survey;

@Component
public class SurveyRepository {
	
	static List<Survey> survey= new ArrayList<>();
	static List<Questions> que= new ArrayList<>();
	static {
		
		Questions q1= new Questions("1","Current total deplomats in city","10k is the current count");
		Questions q2= new Questions("2","Majority of deplomats religon","christen");
		Questions q3= new Questions("3","Reason for changing city?","Food Crises");
		que.addAll(List.of(q1,q2,q3));
		
		Survey s=new Survey("1","Deploymats","to plan city accordingly",100,que);
		survey.add(s);
		
		Survey s1=new Survey("2","Deploymats-2","Future Proposal",25000,que);
		survey.add(s1);
	}
	
	public List<Survey> getAllSurveyData()
	{
		return survey;
	}

	public Survey getSurveyById(int id)
	{
		for(Survey sur:survey)
		{
			if(sur.getId().equals(Integer.toString(id))){
				return sur;
			}
		}
		return new Survey();
	}

	public List<Questions> getSurveyQuestionsById(int id) {
		Survey s= getSurveyById(id);
		return s.getQue();
	}
}
