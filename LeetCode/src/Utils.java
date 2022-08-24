import java.util.Arrays;

public class Utils {

    public static String Array2String(boolean[] arr) {
        StringBuilder ret = new StringBuilder("[");
        for (boolean value :
                arr) {
            char ch = 'F';
            if(value) {
                ch = 'T';
            }
            ret.append(ch);
            ret.append(",");
        }
        ret.deleteCharAt(ret.length() -1 );
        ret.append(']');
        return ret.toString();
    }

    public static String deepArray2String(int[][] matrix) {
        StringBuilder ret = new StringBuilder();
        for (int[] arr :
                matrix) {
            ret.append(Arrays.toString(arr));
            ret.append("\n");
        }
        return ret.toString();
    }

    public static String deepArray2String(boolean[][] matrix) {
        StringBuilder ret = new StringBuilder();
        for (boolean[] arr :
                matrix) {
            ret.append(Array2String(arr));
            ret.append("\n");
        }
        return ret.toString();
    }
}
