package LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mapMethAdd {

	public static void main(String[] args) {
		 List<Integer> l = Arrays.asList(12, 20, 30, 40, 50, 25, 90, 15, 21);
	     System.out.println(l);
	     
	     List<Integer> t =l.stream().filter(i->i%2==0).//odd no
	    		 map(f->f+5).//odd no will get filter and get add by 5
	    		   collect(Collectors.toList());
	        System.out.println(t);
	}

}
