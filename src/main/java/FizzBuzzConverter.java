public class FizzBuzzConverter {
    public String convert(int toConvertToFizzBuzz) {

        if (toConvertToFizzBuzz%3==0){
            return "Fizz";
        }

        return String.valueOf(toConvertToFizzBuzz);
    }
}
