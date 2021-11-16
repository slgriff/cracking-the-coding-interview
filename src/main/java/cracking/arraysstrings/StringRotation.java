package cracking.arraysstrings;

public class StringRotation {

    public static boolean isRotation(String s1, String s2) {

        return false;
    }

    private static boolean isSubstring(String s1, String s2) {
        return s1.contains(s2) || s2.contains(s1);
    }
}
