package premier;

public class PaginatingAHugeBook {
    public static long pageDigits(long pages) {
        
          long count = 0;
          long i = 1;
    while (i <= pages) {
      count += pages - i + 1;
      i *= 10;
    }
    return count;
    }
}