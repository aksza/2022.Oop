package oop.labor09.lab9_2;

public interface IDictionary {
    static final String DICTIONARY_FILE = "D:\\egyetem\\elso ev\\masodik felev\\OOP\\Megoldasok\\2022.Oop\\2022.Oop\\labor-09\\src\\oop\\labor09\\lab9_2\\dictionary.txt";
    boolean add(String str);
    boolean find(String str);
    int size();
}
