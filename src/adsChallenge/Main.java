package adsChallenge;

public class Main {
    public static void main(String[] args) {
        ShuffleTester shuffleTester = new ShuffleTester();

        if (args.length != 3) {
            System.out.println("Please provide 3 arguments");
            return;

        }

        System.out.println("The result is " + shuffleTester.isValidShuffle(args[0], args[1], args[2]));
    }

}
