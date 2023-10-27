package com.app.survey.data;

import java.util.List;

public class Survey {
	
	private String id;
	private String surveyName;
	private String purpose;
	private int count;
	
	private List<Questions> que;
	
	public Survey() {
		super();
	}
	
	public Survey(String id, String surveyName, String purpose, int count, List<Questions> questions) {
		super();
		this.id = id;
		this.surveyName = surveyName;
		this.purpose = purpose;
		this.count = count;
		this.que=questions;
	}
	
	public String getId() {
		return id;
	}
	public String getSurveyName() {
		return surveyName;
	}
	public String getPurpose() {
		return purpose;
	}
	public int getCount() {
		return count;
	}

	public List<Questions> getQue() {
		return que;
	}

	public void setQue(List<Questions> que) {
		this.que = que;
	}
	
	

}
