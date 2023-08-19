package com.spring1.RAPI.surveys;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SurveyResources {
	@Autowired
	SurveyService ss;

	@GetMapping("/surveys")
	public ArrayList<Survey> surveys(){
		return ss.retriveAllSurveys();
	}
	
	@GetMapping("/surveys/{surveyid}")
	public Survey survey(@PathVariable String surveyid){
		return ss.retriveSurvey(surveyid);
	}
	
	@GetMapping("/surveys/{surveyid}/{questionid}")
	public Question question(@PathVariable String surveyid,@PathVariable String questionid){
		return ss.retriveQuestion(surveyid,questionid);
	}
}
