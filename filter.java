abstract class KeywordAnalyzer
    implements TextAnalyzer{

    protected  abstract String[] getKeywords();      // return keywords
    protected abstract Label getLabel();      // return Label

    public Label processText(String str) {
        String[] str2 = str.split(" ");
        for (int j = 0; j < str2.length; j++) {
            for (int i = 0; i < getKeywords().length; i++) {
                if (str2[j].equals(getKeywords()[i])) return getLabel();
            }
        }
        return Label.OK;
    }
}

public class SpamAnalyzer
    extends  KeywordAnalyzer{

    private String[] keywords;

    public  SpamAnalyzer(String[] str){
        keywords = new String[str.length];
        for(int i=0; i<str.length; i++){
            keywords[i] = str[i];
        }
    }

    @Override
    public String[] getKeywords(){
        return keywords;
    }

    @Override
    public Label getLabel(){
        return Label.SPAM;
    }
}

public class NegativeTextAnalyzer
    extends  KeywordAnalyzer {

    private String[] s = new String[3];

    public NegativeTextAnalyzer() {
        s[0] = ":(";
        s[1] = "=(";
        s[2] = ":|";
    }

    @Override
    public String[] getKeywords() {
        return s;
    }

    @Override
    public Label getLabel() {
        return Label.NEGATIVE_TEXT;

    }
}

public class TooLongTextAnalyzer
        implements TextAnalyzer{

    private int maxLength;

    public TooLongTextAnalyzer(int max) {
        maxLength = max;
    }

    @Override
    public Label processText(String text){
        if(text.length() > maxLength) return Label.TOO_LONG;

        return Label.OK;
    }
}

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer textAnalyzer : analyzers) {
            if (textAnalyzer.processText(text) != Label.OK) {
                return textAnalyzer.processText(text);
            }
        }
        return Label.OK;
    }
