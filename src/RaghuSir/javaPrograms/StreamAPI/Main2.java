package RaghuSir.javaPrograms.StreamAPI;

public class Main2 {

    public static void main(String[] args) {

        String s1 = "Java_123_@gmail.com";

        // Frequency of the upper case lowercaser and the digits in the String
      long uc = s1.chars().filter(Character::isUpperCase).count();
      long lc = s1.chars().filter(Character::isLowerCase).count();
      long dig = s1.chars().filter(Character::isDigit).count();
        System.out.println(uc);
        System.out.println(lc);
        System.out.println(dig);
    }
}
