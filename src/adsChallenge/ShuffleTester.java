package adsChallenge;

public class ShuffleTester {
    public boolean isValidShuffle(String str1, String str2, String shuffle) {
        String shuffleSoFar = "";
        return isValidShuffleSoFar(str1, str2, shuffle, shuffleSoFar);
    }

    private boolean isValidShuffleSoFar(String str1, String str2, String shuffle, String shuffleSoFar) {
        if (shuffleSoFar.equals(shuffle))
            return true;

        if (!shuffle.startsWith(shuffleSoFar))
            return false;

        boolean tryFirstResult = false;
        if (str1.length() > 0) {
            String tryFirstWordStr = shuffleSoFar + str1.charAt(0);
            tryFirstResult = isValidShuffleSoFar(str1.substring(1), str2, shuffle, tryFirstWordStr);
        }

        if (tryFirstResult)
            return true;

        boolean trySecondResult = false;
        if (str2.length() > 0) {
            String trySecondWordStr = shuffleSoFar + str2.charAt(0);
            trySecondResult = isValidShuffleSoFar(str1, str2.substring(1), shuffle, trySecondWordStr);
        }

        if (trySecondResult)
            return true;

        return false;
    }
}
