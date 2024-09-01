package LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEmailByDomain {
    public static void main(String[] args) {
        List<String> emailIds = Arrays.asList("abc.def@gmail.com",
                                                   "joonie@outlook.com",
                                                         "jimin@aol.com",
                                                    "batman@outlook.com",
                                                 "lana@outlook.com");
                   String Domain ="outlook.com";
            List<String>filterDomain = emailIds.stream()
                .filter(email -> email.endsWith("@" + Domain))
                .collect(Collectors.toList());
    System.out.println("Emails with given domain  "+Domain+":");
        filterDomain.forEach(System.out::println);
    }
}


