package RaghuSir.javaPrograms.Arrays;

public class Notess {
    public static void main(String[] args) {

        int [] notes = {500,200,100,50,20,10,5,2,1};
        int amount = 1837;
        int count=0;
        for(int i=0;i<notes.length;i++){
            int note = amount/notes[i];
            if(note==0){
                continue;
            }
            System.out.println(notes[i]+"-->"+note);
            count+=note;
            amount = amount%notes[i];
        }
        System.out.println("Total count of amount: "+count);
    }
}
