public class AsciiChars {

        public static void printNumbers()
        {
            // TODO: print valid numeric input
            System.out.println("Print Numbers");
            for (int c=48; c<58; c++) {
                System.out.print((char)c);


            }
        }

        public static void printLowerCase()
        {
            // TODO: print valid lowercase alphabetic input
            System.out.println("\nLowercase Alpha");
            for (int c=97; c<123; c++) {
                System.out.print((char)c);


            }

        }

        public static void printUpperCase()
        {
            // TODO: print valid uppercase alphabetic input
            System.out.println("\nUppercase Alpha");
            for (int c=65; c<91; c++) {
                System.out.print((char)c);


            }
        }

}
