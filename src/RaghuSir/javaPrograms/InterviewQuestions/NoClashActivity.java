package RaghuSir.javaPrograms.InterviewQuestions;

public class NoClashActivity {

    int start;
    int end;

    NoClashActivity(int start, int end) {
        this.start = start;
        this.end = end;
    }
    public class Activity{
        public static void main(String[] args) {

            NoClashActivity[] activities= {
                    new NoClashActivity(1,2),
                    new NoClashActivity(3,4),
                    new NoClashActivity(0,6),
                    new NoClashActivity(5,7),
                    new NoClashActivity(8,9),
                    new NoClashActivity(5,9)

            };
            int count=1;
            int lasEnd=activities[0].end;
            for(int i=1;i<activities.length;i++){
                if(activities[i].start >= lasEnd){
                    count++;
                    lasEnd = activities[i].end;
                }
            }
            System.out.println("The number of activites: "+count);

        }
    }

}
