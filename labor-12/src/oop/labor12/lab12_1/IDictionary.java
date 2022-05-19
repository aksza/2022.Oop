package oop.labor12.lab12_1;

public interface IDictionary {
    static final String DICTIONARY_FILE = "D:\\egyetem\\elso ev\\masodik felev\\OOP\\Megoldasok\\2022.Oop\\2022.Oop\\labor-12\\src\\oop\\labor12\\lab12_1\\dictionary.txt";
    boolean add(String str);
    boolean find(String str);
    int size();
}
