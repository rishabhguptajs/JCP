

class A {
    void m() throws ArithmeticException {
        
    }
}

public class Code {
    public static void main(String[] args) throws ArithmeticException{
        // exception handling

        // int[] arr = {1, 2, 3, 4, 5};

        // // arithematic exception
        // try {
        //     for (int i = 0; i < arr.length; i++) {
        //         System.out.println(arr[i] / 0);
        //     }
        // } catch (ArithmeticException e) {
        //     System.out.println("Divide by zero error");
        // }

        // String str = "Hello";
        // try {
        //     System.out.println(str.charAt(10));
        // } catch (StringIndexOutOfBoundsException e) {
        //     System.out.println("String index out of bound");
        // }

        // // nested try catch
        // try {
        //     System.out.println(1/0);
        //     try {
        //         int[] arr1 = {1, 2, 3, 4, 5};
        //         System.out.println(arr1[10]);
        //     } catch (ArrayIndexOutOfBoundsException e) {
        //         System.out.println("Array index out of bound");
        //     }
        // } catch (ArithmeticException e) {
        //     System.out.println("Divide by zero error");
        // } catch (Exception e) {
        //     System.out.println("Exception");
        // }

        // throws keyword is used to declare an exception in a method. 
        // If we use throws keyword in a method, we need to use try-catch block to handle exception.

        // example code for throws keyword

        int[] arr = {1, 2, 3, 4, 5};

        // throw an exception
        try {
            for (int i = 0; i < arr.length; i++) {
                if (3 > 0) {
                    System.out.println("Exception occured");
                    throw new ArithmeticException();
                }
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}