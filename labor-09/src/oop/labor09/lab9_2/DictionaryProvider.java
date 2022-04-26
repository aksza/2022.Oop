package oop.labor09.lab9_2;

public class DictionaryProvider{
    public static IDictionary createDictionary( DictionaryType dtype ){
        IDictionary dictionary = null;
        switch( dtype ){
            case ARRAY_LIST: dictionary=ArrayListDictionary.newInstance(); break;
            //case HASH_SET : dictionary=HashSetDictionary.newInstance(); break;
            //case TREE_SET : dictionary=TreeSetDictionary.newInstance(); break;
        }
        return dictionary;
    }
}
