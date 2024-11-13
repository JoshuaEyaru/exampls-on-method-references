import java.util.function.*;
public class Examples{

    // a static method reference
    public static int triple(int num){
        return num * 3;
    }

    public static void main(String[] args) {
        
        // lambda expression to implement Function functional interface
        Function<Integer, Integer> computation = num -> triple(num);
        System.out.println(computation.apply(6));

        System.out.println("// reference to a static method ");
        // the same can be implementeed using a method reference instead of lambada as below
        Function<Integer, Integer> computation2 = Examples::triple;
        // implementation
        int result = computation2.apply(6);
        System.out.println(result);

        //another usage
        computation2 = Math::abs;
        int result2 = computation2.apply(6);
        System.out.println(result2);

        System.out.println("// reference to an instance of a particular object ");
        // reference to an instance of a particular object
        String myString = "hello weold";

        // reference to a particular objects instance method
        Predicate<String> evaluation = myString::startsWith;

        // use the Predicate's test() method and print the result
        boolean result3 = evaluation.test("he");
        System.out.println("starts with is: " + result3);

        evaluation = myString::equalsIgnoreCase;
        result3 = evaluation.test("Hello WoRLD");
        System.out.println("Equals is: " + result3);


        System.out.println("Instance Method of an Arbitrary Object of a Particular Type");
        // reference to an arbitrary object of the String type
        BiPredicate<String, String> evaluation4 = String::startsWith;

        // use the BiPredicate's test() method and print the results
        boolean resultss = evaluation4.test("hello world", "he");
        System.out.println("BiPredicate startsWith: " + resultss);

        // another example
        evaluation4 = String::equalsIgnoreCase;
        resultss = evaluation4.test("goodbye!", "gOoDbYe!");
        System.out.print("BiPredicate startsWith: " + resultss);

        
        /*
         * Reference to constructor
         * We import a dog class to work with it's constructor, 
         * in this case the defaul constructor
         */
        System.out.println("----------Reference to a Constructor--------");

        // use new key word to refer to the dog constructor
        Supplier<Dog> dogGetter = Dog::new;

        // Use supplier's get() method to retrieve and use an object 
        Dog myDog = dogGetter.get();
        myDog.name = "Charlie";
        myDog.age = 3;
        System.out.println(myDog);


        

    }
}