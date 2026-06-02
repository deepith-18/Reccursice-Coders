package RaghuSir.javaPrograms.InterviewQuestions;

public class PersonSafe {
    public static void main(String[] args) {
        int [] position = {2,5,11,12};
        int [] width = {2,3,1,4};
        int [] person={1,9,11,12,13};
        int totalDistance=0;

        for(int p:person){
            int minDistance= Integer.MAX_VALUE;
            for(int i=0;i<position.length;i++){
                int start=position[i];
                int end = position[i]+width[i];

                //Person inside
                if(p>=start && p<=end){
                    minDistance=0;
                    break;
                }
                //Left side of House
                else if(p<start){
                    minDistance=Math.min(minDistance,start-p);
                }
                //Right Side of the house
                else{
                    minDistance=Math.min(minDistance,p-end);
                }

            }
            totalDistance +=minDistance;
        }
        System.out.println("Total Distance: "+totalDistance);
    }
}
