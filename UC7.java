public class OopsBannerApp{
        public static String[] getOPattern() {
        return new String[]{
                " *** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " *** "
        };
    }

    
    public static String[] getPPattern() {
        return new String[]{
                " *** ",
                "*     *",
                "*     *",
                " *** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    
    public static String[] getSPattern() {
        return new String[]{
                " *** ",
                "*     *",
                "*      ",
                " *** ",
                "      *",
                "*     *",
                " *** "
        };
    }

    public static void main(String[] args) {

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        // Build banner lines using String.join()
        String[] banner = {
                String.join("  ", o[0], o[0], p[0], s[0]),
                String.join("  ", o[1], o[1], p[1], s[1]),
                String.join("  ", o[2], o[2], p[2], s[2]),
                String.join("  ", o[3], o[3], p[3], s[3]),
                String.join("  ", o[4], o[4], p[4], s[4]),
                String.join("  ", o[5], o[5], p[5], s[5]),
                String.join("  ", o[6], o[6], p[6], s[6])
        };

        // Enhanced for loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
}