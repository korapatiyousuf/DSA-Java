package Java.LambdaExpression;

public class LambdaPractise {
    public static void main(String[] args) {
        Operator opSum = (a,b) ->  (a+b);

        Operator opDiff = (int a, int b) -> {
          return a-b;
        };

        Operator opProd = (int a, int b) -> {
            return a*b;
        };

        Operator opDiv = (int a, int b) -> {
            return a/b;
        };

        System.out.println(opSum.performs(4,6));
        System.out.println(opDiff.performs(4,6));
        System.out.println(opProd.performs(4,6));
        System.out.println(opDiv.performs(4,6));


    }
}
