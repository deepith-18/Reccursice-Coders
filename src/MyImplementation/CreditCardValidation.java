package MyImplementation;

public class CreditCardValidation {

    public static void main(String[] args) {

        String cardNumber = "1234567890098765";
        boolean ans = validateCreditCard(cardNumber);
        System.out.println(ans);

    }


    static boolean containsOnlyDigits(String s){
        for(int i = 0; i < s.length(); i++) {
            if(!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    static boolean validateCreditCard(String creditCardNumber) {

        //If the length is less than 16  return false

        if(creditCardNumber.length() != 16){
            return false;
        }

        // If the any character in the String is number return false

        if(!containsOnlyDigits(creditCardNumber)){
            return false;
        }

        int sum = 0;
        boolean alternate = false;
        for(int i=creditCardNumber.length()-1;i>=0;i--){
            char ch = creditCardNumber.charAt(i);

            int digit = ch-'0';

            if(alternate){
                digit *=2;
                if(digit > 9){
                    digit -= 9;
                }
            }
            sum += digit;
            alternate = !alternate;
        }
        return sum % 10 == 0;
    }
}
