import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) return 0;

        //Fixed:Delimeter , or new line
        String delimiter = "[,]|\n";

        String numString = numbers;
        // Check for custom delimiter
        if (numbers.startsWith("//")) {
            int delimiterEnd = numbers.indexOf("\n");
            delimiter = java.util.regex.Pattern.quote(numbers.substring(2, delimiterEnd));
            numString = numbers.substring(delimiterEnd + 1);
        }

        String[] token = numString.split(delimiter);
        List<Integer> negativeNumbers = new ArrayList<>();
        int sum = 0;
        for(String number : token){
            if(number.isEmpty()) continue;
            int num = Integer.parseInt(number);
            if(num < 0){
                negativeNumbers.add(num);
            }else {
                sum += num;
            }
        }

        if(!negativeNumbers.isEmpty()){
            throw new IllegalArgumentException(
                    "negative numbers not allowed " + negativeNumbers.toString().replaceAll("[\\[\\] ]", "")
            );
        }


        return sum;
    }
}
