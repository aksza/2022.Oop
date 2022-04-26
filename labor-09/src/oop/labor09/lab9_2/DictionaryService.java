package oop.labor09.lab9_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
                line = line.trim();
                if(!dictionary.find(line)){
                    w.add(line);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return w;
    }
}
