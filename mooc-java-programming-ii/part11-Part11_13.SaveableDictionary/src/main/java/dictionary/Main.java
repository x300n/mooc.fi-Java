package dictionary;

public class Main {
    public static void main(String[] args) {
    SaveableDictionary dictionary = new SaveableDictionary("words.txt");
    boolean wasSuccessful = dictionary.load();
    dictionary.delete("apina");
    dictionary.delete("below");
    dictionary.save();
    if (wasSuccessful) {
        System.out.println("Successfully loaded the dictionary from file");
    }

    System.out.println(dictionary.translate("apina"));
    System.out.println(dictionary.translate("ohjelmointi"));
    System.out.println(dictionary.translate("alla oleva"));
        }
}
