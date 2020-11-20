package edu;

public class SlowestKeySolution {

    public static final char INVALID = '-';

    public static char solve(int[] releaseTimes, String keysPressed) {

        if (keysPressed == null || releaseTimes == null || keysPressed.trim().isEmpty() || releaseTimes.length == keysPressed.length()) {

        }
        return INVALID;
    }


    public static int[] durationsForEachKeyPress(int[] releaseTimes) {
        int[] durations = new int[releaseTimes.length];
        durations[0] = releaseTimes[0];
        for (int i = 1; i < releaseTimes.length; i++) {
            durations[i] = releaseTimes[i] - releaseTimes[i - 1];
        }
        return durations;
    }

    public static int longestDuration(int[] durations) {
        int longestPress = 0;
        for (int i = 0; i < durations.length; i++) {
            if (durations[i] > longestPress) {
                longestPress = durations[i];
            }
        }
        return longestPress;
    }

    public static String slowestKeyPress(String keysPressed, int[] durations, int longestPress) {
        String slowestKeys = "";
        keysPressed = keysPressed.toLowerCase();
        for (int i = 0; i < durations.length; i++) {
            if (durations[i] == longestPress) {
                slowestKeys = slowestKeys + keysPressed.charAt(i);
            }
        }
        return slowestKeys;
    }

    public static char largestNumber(String slowestKeys) {
        char[] slowestKeyArray = slowestKeys.toCharArray();
        char slowestKey = 'a';
        for (int i = 0; i < slowestKeyArray.length; i++) {
            if (slowestKeyArray[i] > slowestKey) {
                slowestKey = slowestKeyArray[i];
            }
        }
        return slowestKey;

    }

}
