package oop.labor12.lab12_1;

public class DictionaryProvider {
    public static IDictionary createDictionary( DictionaryType dtype ){
        return switch (dtype) {
            case ARRAY_LIST -> ArrayListDictionary.newInstance();
            case HASH_SET -> HashSetDictionary.newInstance();
            case TREE_SET -> TreeSetDictionary.newInstance();
        };
    }
}