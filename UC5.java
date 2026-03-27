public class UC5 {
    public static void main(String[] args) {
        char[][] O = {
            {' ', '', '', '*', ' '},
            {'', ' ', ' ', ' ', ''},
            {'', ' ', ' ', ' ', ''},
            {'', ' ', ' ', ' ', ''},
            {' ', '', '', '*', ' '}
        };

        char[][] P = {
            {'', '', '', '', ' '},
            {'', ' ', ' ', ' ', ''},
            {'', '', '', '', ' '},
            {'*', ' ', ' ', ' ', ' '},
            {'*', ' ', ' ', ' ', ' '}
        };

        char[][] S = {
            {' ', '', '', '', ''},
            {'*', ' ', ' ', ' ', ' '},
            {' ', '', '', '*', ' '},
            {' ', ' ', ' ', ' ', '*'},
            {'', '', '', '', ' '}
        };

        char[][][] letters = {O, O, P, S};

        for (int i = 0; i < 5; i++) {
            for (int l = 0; l < letters.length; l++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(letters[l][i][j] + " ");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}