public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {
            "  *****   *****   *****    ***** ",
            " *     * *     * *     *  *     *",
            " *     * *     * *     *  *      ",
            " *     * *     * *****     ***** ",
            " *     * *     * *              *",
            " *     * *     * *              *",
            " *     * *     * *        *     *",
            "  *****   *****   *         ***** "
        };

        // Loop to print banner
        for (int i = 0; i < banner.length; i++) {
            System.out.println(banner[i]);
        }
    }
}
