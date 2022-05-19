package oop.labor12.lab12_1;

import oop.labor12.lab12_1.DictionaryService;
import oop.labor12.lab12_1.DictionaryType;

public class Main {
    public static void main(String[] args){
        /*DictionaryService service =
                new DictionaryService(DictionaryType.ARRAY_LIST);
        Scanner scanner = new Scanner(System.in);
        while( true ) {
            System.out.print("Word to find ( Enter <end> for exit): ");
            String word = scanner.nextLine();
            if( word.equalsIgnoreCase( "end")){
                break;
            }
            System.out.println(" Find(" + word + "): " + service.findWord(word));
        }
        scanner.close();


         */
        DictionaryService service =
                new DictionaryService(DictionaryType.ARRAY_LIST);
        System.out.println("Unknown words from a file: ");
        System.out.println( service.findWordsFile("D:\\egyetem\\elso ev\\masodik felev\\OOP\\Megoldasok\\2022.Oop\\2022.Oop\\labor-12\\src\\oop\\labor12\\lab12_1\\bible.txt"));
    }
}
