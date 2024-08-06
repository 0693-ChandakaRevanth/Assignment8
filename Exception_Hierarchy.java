public class Exception_Hierarchy {
        public static void main(String[] args) {
            try {
                int[] numbers = { 1, 2, 3 };
                int result = numbers[5]/0;
            } catch (ArithmeticException ae) {
                System.out.println("ArithmeticException occurred: " + ae.getMessage());
            } catch (ArrayIndexOutOfBoundsException a) {
                System.out.println("ArrayIndexOutOfBoundsException occurred: " + a.getMessage());
            } catch (NullPointerException np) {
                System.out.println("NullPointerException occurred: " + np.getMessage());
            } catch (Exception e) {
                System.out.println("An unexpected exception occurred: " + e.getClass().getSimpleName());
            }
            String nullString = null;
            try {
                int length = nullString.length();
            } catch (NullPointerException n) {
                System.out.println("Caught a NullPointerException: " + n.getMessage());
            }
        }
    }