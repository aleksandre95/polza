/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polza;

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
public class MapDemo {
     public static void main(String[] args) {
         Control cont = new Control();
         cont.size();
         
        Map<String, WordPair> map = new HashMap();
        map.put("car", new WordPair("car", "bil"));
        map.put("house", new WordPair("house", "hus"));
        map.put("goat", new WordPair("goat", "ged"));
        map.put("girl", new WordPair("girl", "pige"));
        map.put("city", new WordPair("city", "by"));
        //Creating an iterator over a set of entries from the map
        //Iterator is a way to traverse a list like container
        Iterator iterator = map.entrySet().iterator();
//         while (iterator.hasNext()) {
//             Map.Entry<String, WordPair> entry = (Map.Entry)iterator.next();
            // WordPair wp = map.get("car");
//             
//             
//         }
             //Looping random wordpair version 1:
             Set entries = map.entrySet();
            int size = entries.size();
             Random rand = new Random();
             int randVal = rand.nextInt(size);
//             int count = 0;
//         while (iterator.hasNext()) {
//             if(count==randVal){
//             Map.Entry<String, WordPair> entry = (Map.Entry)iterator.next();
//             wp = entry.getValue();
//             }
//             
//             count++;
//         }
             List<String> keys = new ArrayList(map.keySet());
             System.out.println(keys.get(randVal));
             
        
    }
    
}
