package premier;

public class CountOfPositivesSumOfNegatives {
    public static int[] countPositivesSumNegatives(int[] input)
    {
        int pos = 0;
        int neg = 0;
        int [] none = {};

        if(input == null || input.length == 0  )
            return none;

        for(int i=0; i<input.length; i++){
            if(input[i]>0)
                pos++;
            else {
                neg += input[i];
            }
        }
        int [] output = {pos, neg};
        return output; //return an array with count of positives and sum of negatives
    }
}
