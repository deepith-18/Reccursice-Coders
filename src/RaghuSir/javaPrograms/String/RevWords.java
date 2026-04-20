package RaghuSir.javaPrograms.String;

public class RevWords {
    public static void main(String[] args) {
        String str = "Rama is a good boy";
        String res = "";

        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {

            int f = i;

            // Move till end of word
            while (i < ch.length && ch[i] != ' ') {
                i++;
            }

            int l = i - 1;

            // Reverse the word
            while (l >= f) {
                res = res + ch[l];
                l--;
            }

            // Add space after word (if not end)
            if (i < ch.length) {
                res = res + " ";
            }
        }

        System.out.println(res);
    }
}