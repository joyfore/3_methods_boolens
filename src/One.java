class One {

    // Returns boolean (true or false)
    static boolean isJoiceGood() {

        return true;
    }

    // Returns bool (true or false), takes in paramter
    static boolean isJoiceBad(boolean x) {

        if (x == true) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isOld(int age) {

        if (age < 50) {
            return false;
        }
        else {
            return true;
        }
    }

    static void gameOver(boolean x) {

        if (x == true) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No!");
        }
    }

    public static void main(String[] args) {

        Boolean joice = isJoiceBad(false); // stores return value
        System.out.println(joice);

        System.out.println(isJoiceBad(false));

        boolean ageLimit = isOld(10);
        System.out.println(ageLimit);

        gameOver(true);
    }

}
