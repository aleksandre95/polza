/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polza;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author user
 */
public class Control implements Interface{
    int sizeOfCol ;
    
    
    Map<String, WordPair> collection;
    WordPair wp;
    String lookup;
    //String question;
    String answer;
    FileHandler method;
    double perchance;
       
    
    public Control(){
        
        
        
        collection = new HashMap<String, WordPair>();
        method = new FileHandler();
        perchance= Math.random();
        sizeOfCol = collection.size();
        
        
        
    }

    @Override
    public void add(String question, String answer) {
//        collection.put("car", new WordPair("car", "bil"));
//        collection.put("house", new WordPair("house", "hus"));
//        collection.put("goat", new WordPair("goat", "ged"));
//        collection.put("girl", new WordPair("girl", "pige"));
//        collection.put("city", new WordPair("city", "by"));
            
        
        collection.put(question, new WordPair(question,answer));
        
        
    }

    @Override
    public int size() {
        
        return sizeOfCol;
    }

    @Override
    public String getRandomQuestion() {
       //Iterator iterator = collection.entrySet().iterator();
        
      
       Set entries = collection.entrySet();
       int size = entries.size();
            
             Random rand = new Random();
             int randVal = rand.nextInt(size);
             List<String> keys = new ArrayList(collection.keySet());
             String randQuestion = keys.get(randVal);
            
             //System.out.println(randQuestion);
       
    return randQuestion;
        
            
    }

    @Override
    public boolean checkGuess(String question, String guess) {
        if (guess.equals(collection.get(question).getAnswer())) {
            
            return true;
        }else{
            return false;
        }
        
//        //WordPair checkguess = new WordPair(question, guess);
//        
//        if(collection.containsValue(checkguess)){
//        
//            
//            return true;
//        }else{
//       return false;
//            
//        }
    }

    @Override
    public String lookup(String question) {
        
            
            return collection.get(question).getAnswer();
        
    }

    @Override
    public boolean load(String filename) {
        try {
            collection = method.load(filename);
            return true;
        } catch (IOException ex) {
            System.out.println("File can not be loaded");
            ex.printStackTrace();
            return false;
        }
        
        
    }

    @Override
    public boolean save(String filename) {
       
        try {
            method.save((HashMap<String, WordPair>) collection, filename);
            return true;
        } catch (IOException ex) {
            System.out.println("File can not be saved");
        }
        
           return false; 
           
        }
         
            
        
    
    

    @Override
    public void clear() {
    
    }
//    ArrayList<String> stringArray;
//    FileHandler stat;
//    String file;
//    public Control(){
//        stringArray = new ArrayList<String>();
//    stat = new FileHandler();
//    
//    file = "file";
//    }
//    public void loadWords(){
//        stringArray = FileHandler.load(file);
//        
//    }
//    public ArrayList<String> getWords(){
//        return stringArray;
//    }
//    public void saveWords(){
//        stringArray.add(file);
//        FileHandler.saveWords(stringArray, file);
//    }
//    
    
    
}
