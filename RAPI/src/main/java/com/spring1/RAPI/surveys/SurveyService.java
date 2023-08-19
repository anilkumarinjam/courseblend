package com.spring1.RAPI.surveys;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;


@Service
public class SurveyService {
	static ArrayList<Survey> surveys=new ArrayList<>();
	static {
		Question q1=new Question("q1","First Question",
						Arrays.asList("GCP","AWS","DO","ABA"),
						"GCP");
		Question q11 = new Question("Question2","Most Popular Cloud Platform Today", 
        		Arrays.asList("AWS", "Azure", "Google Cloud", "Oracle Cloud"), "Python");
		
		Survey s1=new Survey("s1","Cloud Survey","CS",new ArrayList<Question>(Arrays.asList(q1,q11)));
		
		surveys.add(s1);
	}
	
	public ArrayList<Survey> retriveAllSurveys(){
		return surveys;
	}
	
	public Survey retriveSurvey(String id){
		for(Survey s:surveys) {
			if(s.getId().equals(id)) {
				return s;
			}
		}
		return null;
	}

	public Question retriveQuestion(String surveyid, String questionid) {
		for(Survey s:surveys) {
			if(s.getId().equals(surveyid)) {
				for(Question q:s.getQuestions()) {
					if(q.getId().equals(questionid)) {
						return q;
					}
				}
			}
		}
		return null;
	}
}
