import java.util.*;

public class OOOPS8 {

    // Static Inner Class
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getters
        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Store character-pattern mappings
    private static final Map<Character, CharacterPatternMap> characterMap = new HashMap<>();

    // Static block to initialize patterns
    static {
        characterMap.put('A', new CharacterPatternMap('A', new String[]{
                "  A  ",
                " A A ",
                "AAAAA",
                "A   A",
                "A   A"
        }));

        characterMap.put('B', new CharacterPatternMap('B', new String[]{
                "BBBB ",
                "B   B",
                "BBBB ",
                "B   B",
                "BBBB "
        }));

        characterMap.put('C', new CharacterPatternMap('C', new String[]{
                " CCC ",
                "C   C",
                "C    ",
                "C   C",
                " CCC "
        }));
    }

    // Method to print banner
    public static void printBanner(String text) {
        text = text.toUpperCase();

        int height = 5; // Each character pattern has 5 rows

        for (int row = 0; row < height; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : text.toCharArray()) {
                CharacterPatternMap cp = characterMap.get(ch);

                if (cp != null) {
                    line.append(cp.getPattern()[row]).append("  ");
                } else {
                    line.append("     ").append("  "); // Space for unsupported characters
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text for banner: ");
        String input = sc.nextLine();

        printBanner(input);

        sc.close();
    }
}