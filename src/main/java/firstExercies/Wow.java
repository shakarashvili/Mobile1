package firstExercies;

abstract class VowelCounter { // პირველი დავალება
    public abstract int countVowel(String str);
}

class VowelCounterImpl extends VowelCounter {
    @Override
    public int countVowel(String str) {
        int count = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}




