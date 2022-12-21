public class WordsChecker {

    protected String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord (boolean word) {
        if (word) {
            return true;
        } else {
            return false;
        }
    }
}
