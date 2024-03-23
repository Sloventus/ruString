import java.util.ArrayList;

public class RussianString {
    private final static String forTest = "english инглиш mazaмаза faka      фака";

    private static void main(String[] args) {
        System.out.println(extractRuWords(forTest));
    }
    public static void beautyPrint (String originalText){
        final ArrayList<String> sample = extractRuWords(originalText);
        int count = 0;
        for (String i : sample){
            System.out.print(i + " ");
            count++;
            if (count == 10){
                count = 0;
                System.out.println();
            }
        }
    }

    public static ArrayList<String> extractRuWords(String originalText) {
        String[] words = originalText.split(" ");
        ArrayList<String> ruWords = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            StringBuilder oneWord = new StringBuilder();
            for (int j = 0; j < words[i].length(); j++) {
                if (Character.UnicodeBlock.of(words[i].charAt(j)).equals(Character.UnicodeBlock.CYRILLIC)){
                    oneWord.append(words[i].charAt(j));
                }
            }
            if (!oneWord.toString().equals("")) {
                ruWords.add(oneWord.toString());
            }
        }
        return ruWords;
    }
}
