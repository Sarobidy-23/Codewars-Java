package premier;

public class TenMinutesWalk {
    public static boolean isValid(char[] input) {
        int nord = 0;
        int west = 0;

        if(input.length != 10)
            return false;
        if(input.length == 10){
            for(char elt: input){
                if (elt == 'n') nord++;
                else if (elt == 's') nord--;
                else if (elt == 'e') west++;
                else if (elt == 'w') west--;
            }
        }
        if(nord == 0 && west == 0)
            return true;
        else
            return false;

    }
} 