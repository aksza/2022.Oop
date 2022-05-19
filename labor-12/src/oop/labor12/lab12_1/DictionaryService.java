package oop.labor12.lab12_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class DictionaryService{
    private IDictionary dictionary;
    public DictionaryService(DictionaryType type){
        dictionary = DictionaryProvider.createDictionary(type);
    }
    public boolean findWord(String word){
        return dictionary.find(word);
    }
    public ArrayList<String> findWordsFile(String words){
        ArrayList<String> w = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(words))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",|;|:|!|\\?|'| |, | ,| , |\\.,|\\.|\\. ");
                for (String item : items) {
                    if(!dictionary.find(item) ){
                        w.add(item);
                    }
                    if(!dictionary.find(item.trim().toLowerCase(Locale.ENGLISH))){
                        w.add(item);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return w;
    }
}
