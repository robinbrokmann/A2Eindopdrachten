package nl.drenthecollege.modules.a2.eindopdrachten;

public class Opruimen {
    private char[] weg = {'"', '?', '*', '®'};

    public String stringOpruimen(String tekst){
        for(char c : weg) {
            tekst = replaceString(tekst, c);
        }
        return tekst;
    }

    private String replaceString(String tekst, char teken){
        return tekst.replace(teken, '\0');
    }
}

