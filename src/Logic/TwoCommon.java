package Logic;

public class TwoCommon {
    public static void main(String[] args) {

        int [] a = {1,2,3,4,5,5,6};
        int [] b = {2,2,4,5,3,2,4,6};
        commonUnique(a,b);

    }
    static void commonUnique(int []a,int[] b){
        //Check duplicate in first array


        for(int i=0;i<a.length;i++){

            boolean dupliacte = false;

            for(int k=0;k<i;k++){
                if(a[i]==a[k]){
                    dupliacte=true;
                    break;
                }
            }

            if(dupliacte){
                continue;
            }
            //Check common element
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    System.out.println(a[i]);
                    break;
                }
            }
        }

    }
}
