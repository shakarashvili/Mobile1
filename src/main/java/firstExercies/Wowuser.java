package firstExercies;
public class Wowuser {
    public void countVowelsAndPrint(String str) {
        VowelCounter counter = new VowelCounterImpl();
        int vowelCount = counter.countVowel(str);
        System.out.println("Number of vowels in \"" + str + "\": " + vowelCount);
    }

    public static void main(String[] args) {
        Wowuser counterUser = new Wowuser();
        counterUser.countVowelsAndPrint("Hello Georgia , we love Gerogia ");
    }
}
