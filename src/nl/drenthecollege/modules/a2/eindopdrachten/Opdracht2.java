package nl.drenthecollege.modules.a2.eindopdrachten;

public class Opdracht2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       String tekst = 
    		   "Dit is een tekst met \" en ** en ?? "+
    		   "en allerlei andere niet wenselijke tekens zoals ® etc.  ";

        Opruimen opruimen = new Opruimen();
        System.out.println(opruimen.stringOpruimen(tekst));
    }
 
}
