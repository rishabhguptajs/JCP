// Code to demonstrate custom exception handling in Java



class InsufficientBalanceException extends Exception {
    @Override
    public String toString() {
        return "Insufficient balance!!";
    }
}

class Account{
    int bal;

    public Account(){
        this.bal = bal;
    }
    // difference bw exception and error
    // exception is a problem which can be handled where as error is a problem which cannot be handled

    // exception is a problem that arises during the execution of the program
    // exception handling is a mechanism to handle runtime errors
    // exception handling in java can be done by five keywords: try, catch, throw, throws, finally

    // keywords in exception handling
    // try, catch, finally, throw, throws
    public void deposit(int val) throws InsufficientBalanceException{

    }
    public void withdraw(int val) throws InsufficientBalanceException{
        throw new ArithmeticException();
    }

}

public class Cla {
    public static void main(String[] args) {
        
        
    }
}
