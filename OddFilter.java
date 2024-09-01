package LambdaExpression;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddFilter {
	public static void main(String[] args) {
	     List<Integer> l = Arrays.asList(12, 20, 30, 40, 50, 25, 90, 15, 21);
	     System.out.println(l);
	     for(Integer l1: l) {
	 		if(l1%2!=0) {
	 			System.out.println(l1);
	 		}
	 	}
	     
	     List<Integer> f =l.stream().filter(p->p%2==0).collect(Collectors.toList());
	        System.out.println(f);
	       
	            }
	        
	    
	}


