package LambdaExpression;
import java.util.Arrays;

	import java.util.List;
	public class CountStrings {
	    public static void main(String[] args) {
	        List<String> strings = Arrays.asList("Amol","Avinash","VIshal","Ram","Dnyneshwar","Welcome");

              long count=strings.stream()
	                            .filter(s ->s.length()>3)
	                              .count();
 System.out.println("String length greater than 3 are:"+  count);
	    }
	}

