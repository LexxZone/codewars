package digits;

class Persist {
    static int result;

    public static int persistence(long n) {
        result = 0;
        String strN = Long.toString(n);
        if(strN.length() == 1) {
            result = 0;
        } else {
            while (strN.length() > 1) {
                strN = String.valueOf(process(strN));
            }
        }
            return result;
    }

    public static long process(String value) {
        long processed = 1;
        char[] charN = value.toCharArray();
        for (char singleChar : charN) {
            processed = processed * Long.valueOf(String.valueOf(singleChar));
        }
        result++;
        return processed;
    }

}