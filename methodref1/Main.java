import java.util.function.Function;
public class Main{
    public static void main(String[] args) {
        String myString = "Hello World!";
        // lambda expression
        Function<Character, Integer> charIndexLambda = ch -> myString.indexOf(ch);

        // method reference to do the same
        Function<Character, Integer> charIndexmethodRef = myString::indexOf;

        char testChar = 'e';

        System.out.println("LambadaRef: " + charIndexLambda.apply(testChar));
        System.out.println("MethodRef: " + charIndexmethodRef.apply(testChar));
    }
}