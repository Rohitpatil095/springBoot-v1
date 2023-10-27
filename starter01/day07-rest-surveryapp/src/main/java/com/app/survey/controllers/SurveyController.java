package com.app.survey.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.survey.data.Questions;
import com.app.survey.data.Survey;
import com.app.survey.data.repository.SurveyRepository;

@RestController
public class SurveyController {
	
	@Autowired
	private SurveyRepository sRepo;

	
	@RequestMapping("/")
	public String homePage()
	{
		return "home";
	}
	
	@RequestMapping("/survey")
	public List<Survey> getAllSurveyData()
	{
		return sRepo.getAllSurveyData();
	}
	
	@RequestMapping("/survey/{surveyId}")
	public Survey getSurveyById(@PathVariable int surveyId)
	{
		return sRepo.getSurveyById(surveyId);
	}
	
	@RequestMapping("/survey/{surveyId}/questions")
	public List<Questions> getSurveyQuestionsById(@PathVariable int surveyId)
	{
		return sRepo.getSurveyQuestionsById(surveyId);
	}
	

	
	
// Implementing soon
	
//	@RequestMapping(value="/addQuestions", method = RequestMethod.GET)
//	public String addQuestionsPage()
//	{
//		return "deploymats";
//	}
//	
//	@RequestMapping(value = "/addQuestions", method = RequestMethod.POST)
//	public void showAddedQues()
//	{
//		
//	}
	
}
