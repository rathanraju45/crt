package Day5;

public class CustomeExceptions{
    public static class NegativeAmount extends Exception{
        public NegativeAmount(String exception){
            super(exception);
        }
    }

    public static class InsufficientFunds extends Exception{
        public InsufficientFunds(String exception){
            super(exception);
        }
    }
}
