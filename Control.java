/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polza;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Control {
    ArrayList<String> stringArray;
    FileHandler stat;
    String file;
    public Control(){
        stringArray = new ArrayList<String>();
    stat = new FileHandler();
    
    file = "file";
    }
    public void loadWords(){
        stringArray = FileHandler.load(file);
        
    }
    public ArrayList<String> getWords(){
        return stringArray;
    }
    public void saveWords(){
        stringArray.add(file);
        FileHandler.saveWords(stringArray, file);
    }
    
    
    
}
