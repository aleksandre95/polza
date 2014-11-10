/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polza;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Control implements Interface{
    int sizeOfCol ;
    ArrayList<String> collection;
    String getranquest;
    String lookup;
    
    public Control(){
        sizeOfCol = 0;
        collection = new ArrayList<String>();
    }

    @Override
    public void add(String question, String answer) {
        collection.add(question + ", ");
        collection.add(answer);
    }

    @Override
    public int size() {
        
        return sizeOfCol;
    }

    @Override
    public String getRandomQuestion() {
        return lookup;
    }

    @Override
    public boolean checkGuess(String question, String quess) {
        return true;
    }

    @Override
    public String lookup(String question) {
        return lookup;
    }

    @Override
    public boolean load(String filename) {
        return true;
    }

    @Override
    public boolean save(String filename) {
        if(collection == null){
            return false;
        }
            FileWriter output;  //Creating reference for filewriter.
        
        try {
                output = new FileWriter(new File(filename));  //Opening connection to file.
                for (String personline : collection) {   //running through the ArrayList.                    
                    output.write(personline + " \n");  //Each String object is written as a line in file.
            }

            output.close();  //Closing the file
        } catch (Exception ex) {  //If something goes wrong everything is send to system out.
            System.out.println("Could not save to file!");
            System.out.println(ex.toString());
            ex.printStackTrace();
            return false;  //If something goes wrong false is returned!
        }

        return true;
        
            
        
    
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
