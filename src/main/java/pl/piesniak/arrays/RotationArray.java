package pl.piesniak.arrays;

public class RotationArray {
    public static Boolean isRotation(int[] array1, int[] array2) {
        int length = array2.length;
        if (array1.length != length) {
            return false;
        }
        int offset = 0;
        for (int i = 0; i < length; i++) {
            if (array1[0] == array2[i]) {
                offset = i;
                break;
            }
            if (i == length - 1) {
                return false;
            }
        }
        for (int i = 0; i < length; i++) {
            int j = (i + offset) % length;
            if (array1[i] != array2[j]) {
                return false;
            }
        }
        return true;
    }
}