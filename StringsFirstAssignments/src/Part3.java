public class Part3 {
    public boolean twoOccurrences(String stringA, String stringB) {
        int count = 0;
        for (int index = 0; index <= stringB.length() - stringA.length(); index++) {
            String words = stringB.substring(index, index + stringA.length());
            if (words.equals(stringA)) {
                count = count + 1;
            }
        }
        boolean occurances = count >= 2;
        return occurances;
    }
    public void testing() {
        String stringA = "a";
        String stringB = "banana";
        System.out.println(twoOccurrences(stringA, stringB));

        stringA = "atg";
        stringB = "dfalkjatgalkdj";
        System.out.println(twoOccurrences(stringA, stringB));

        stringA = "by";
        stringB = "A story by Abby Long";
        System.out.println(twoOccurrences(stringA, stringB));
    }
    public String lastPart(String stringA,String stringB){
        String lastPart = "";
        int pos = stringB.indexOf(stringA);
        lastPart = stringB.substring(pos + stringA.length());
        if (stringB.contains(stringA)) {
            return lastPart;
        } else {
            return stringB;
        }
    }
}

