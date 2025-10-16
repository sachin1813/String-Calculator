public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) return 0;

        //Fixed:Delimeter , or new line
        String delimiter = "[,]|\n";

        String[] token = numbers.split(delimiter);
        int sum = 0;
        for(String number : token){
            if(number.isEmpty()) continue;
            int num = Integer.parseInt(number);
            sum += num;
        }


        return sum;
    }
}
