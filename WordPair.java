/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polza;

import java.util.HashMap;
import java.util.Map;

public class WordPair implements java.io.Serializable
{
    String question;
    String answer;
    int priority;
    public void split( String specialPeopleString ) { //"Bob,12,12,5,6"        
        String[] splited = specialPeopleString.split(",");//splited[0] = "Bob"
        question = splited[0]; //"Bob"
        answer = splited[1]; 
        
    }
    

    @Override
    public String toString() {
        return "WordPair{" + "question=" + question + ", answer=" + answer + ", priority=" + priority + '}';
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public WordPair(String question, String answer) {
        this.question = question;
        this.answer = answer;
        priority =0;
    }
    
}