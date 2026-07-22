3. Count Vowels and Consonants
public class CountVC {

    public static void main(String[] args) {

        String str = "Java Programming";

        int vowels = 0, consonants = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {

                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u')
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }
}
Output
Vowels = 5
Consonants = 10
