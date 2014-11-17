/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polza;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author user
 */
public class FileHandler {

    public void save( HashMap<String, WordPair> maps, String filename) throws IOException{
        
        FileOutputStream file = new FileOutputStream(filename);
        ObjectOutputStream fileOut = new ObjectOutputStream(file);
        try {
        fileOut.writeObject(maps);
            
        } catch (Exception e) {
            System.out.println("Beautiful");
        }
        fileOut.close();
        file.close();
    
    
            
    }
    public HashMap<String, WordPair> load(String filename) throws IOException{
      filename = "words.txt";
      HashMap<String, WordPair> mapnew = new HashMap<String, WordPair>();
      
     FileInputStream filein = new FileInputStream(filename); 
     ObjectInputStream objectin = new ObjectInputStream(filein);
        
        try {
            mapnew = (HashMap<String, WordPair>) objectin.readObject();
            
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found when loading");
            e.getException();
        }
        
        filein.close();
        objectin.close();
        return mapnew;
        
        
    
        
    }
    
}
