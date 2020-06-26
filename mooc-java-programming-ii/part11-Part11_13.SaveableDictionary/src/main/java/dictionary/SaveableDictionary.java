/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author xeon
 */
public class SaveableDictionary {
    
    private Map<String, String> dict;
    private String file;
    
    
    public SaveableDictionary() {
        this.dict = new HashMap<String, String>();
    }
    
    public SaveableDictionary(String file) {
        this.file = file;
        this.dict = new HashMap<String, String>();
    }
    
    public boolean save() {
        try{
            
            PrintWriter writer = new PrintWriter(this.file);
            for(String s: this.dict.keySet()) {
                writer.println(s +":"+this.dict.get(s));
            }
            
            writer.close();
            return true;
        } catch (Exception IOException) {
            return false;
        }
        
    }
    
    public boolean load() {
        try(Scanner scanner = new Scanner(Paths.get(this.file))) {
            
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                this.dict.put(parts[0], parts[1]);
            }
            return true;
        } catch (IOException ex) { 
            return false;        
        }
    }
    
    public void add(String words, String translation) {
        if(!dict.containsKey(words))
            this.dict.put(words, translation);
        
    }
    
    public String translate(String word) {
        
        if(dict.containsKey(word))
            return this.dict.get(word);
        
        if(dict.containsValue(word))
            for(Entry entry: dict.entrySet())
                if(entry.getValue().equals(word))
                    return entry.getKey().toString();
        return null;
    }
    
    public void delete(String word) {
        String key = null;
        String value = null;
        if(dict.containsKey(word))
            this.dict.remove(word, dict.get(word));
        
        if(dict.containsValue(word)) {
            for(String k: dict.keySet()) {
                if(dict.get(k).equals(word)) {
                    key = k;
                    value = dict.get(k);
                }
                    
            }
            if(key != null && value != null)
                this.dict.remove(key, value);
        }

    }
    
}
