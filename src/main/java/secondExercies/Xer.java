package secondExercies;

public interface Xer { // მეორე დავალება
    interface ReplaceSymbolA {
        String replaceSymbolA(String str);
    }

    interface ReplaceSymbolB {
        String replaceSymbolB(String str);
    }

    class MainClass implements ReplaceSymbolA, ReplaceSymbolB {
        @Override
        public String replaceSymbolA(String str) {
            return str.replaceAll("a", "z");
        }

        @Override
        public String replaceSymbolB(String str) {
            return str.replaceAll("b", "w");
        }
    }

    public class Main {
        public static void main(String[] args) {
            MainClass myClass = new MainClass();
            String str1 = "Lela";
            System.out.println("After replaceSymbolA: " + myClass.replaceSymbolA(str1));
            String str2 = "Gabelaia";
            System.out.println("After replaceSymbolB: " + myClass.replaceSymbolB(str2));
        }
    }

}
