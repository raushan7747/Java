/*Var-Args means Variable-Arguements, meanswhile the arguements passed to the methods may be needed to change their arguments, or need some-times less arguements and also some-times needed muchh more arguments to use the same methods with different arguments. And, this one-practice is much more organized and follow DRY-principle DRY-Do Not Repeat-yourself. Using varArgs, we don't needed to copy the methods for using different arguments, else, we need to have another methods which have as required as parameters respectively as arguements, and this practice is also known as methods-overloading, which is not a good practice, this practice just waste spaces and not in organized manner, and also make our prgrams interpretability defecient */
public class varArgs {
    static int multiplication(int... array) {
        /*
         * int... array works like: int[] array, which takes arguments as array, means
         * 100, 5) are taken as array with their index, like: array[0] = 100, and
         * array[1] = 5;
         */
        int result = 1;
        for (int i = 0; i < array.length; i++) {
            /*
             * array.length = 2, so this loop executed two-times, for i = 0 and 1 only, then
             * it will exit from loop because 2 is not less than 2 (2 < 2)
             */
            result = result * array[i]; // here's the value for result is 1 as initialized.
            /*
             * for i = 0; --> this algorithm works as: result = 1 * element of array[0] = 1
             * * 100; and then, result is upgraded, so result = 100.
             */
            /*
             * for i = 1; --> result = result * element of array[1] = 100 * 5 (as previously
             * result is upgraded in 100), therefore: result = 500; and this value stored in
             * result-named-variable and return with this value;
             */
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(multiplication(100, 5));
        System.out.println(multiplication(100, 5, 2));
        System.out.println(multiplication(100, 5, 2, 2));

    }

}
