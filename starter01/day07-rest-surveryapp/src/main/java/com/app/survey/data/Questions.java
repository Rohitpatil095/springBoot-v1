package com.app.survey.data;

public class Questions {

	private String id;
	private String question;
	private String answer;
	
	public Questions() {
		super();
	}
	
	public Questions(String id, String question, String answer) {
		super();
		this.id = id;
		this.question = question;
		this.answer = answer;
	}
	
	public String getId() {
		return id;
	}
	public String getQuestion() {
		return question;
	}
	public String getAnswer() {
		return answer;
	}
	
}
