import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);
        int poäng = 0;

        System.out.println("Detta är en frågesport!");
        System.out.println("     ");
        System.out.println("Använd tangentbordet för att mata in svaren 'ja' eller 'nej' på frågorna.");
        
        //Frågor (5 stycken)
        System.out.println("     ");
        System.out.println("Fråga 1: Är det jämnt datum idag?");
        System.out.print("Ditt svar: ");
        String svar1 = tangentbord.nextLine();
        if (svar1.equalsIgnoreCase("ja"))
        {
            poäng++;
        }
        System.out.println("     ");
        System.out.println("Fråga 2: Är det nuvarande året jämnt?");
        System.out.print("Ditt svar: ");
        String svar2 = tangentbord.nextLine();
        if (svar2.equalsIgnoreCase("nej"))
        {
            poäng++;
        }
        System.out.println("     ");
        System.out.println("Fråga 3: Var det förra året jämnt?");
        System.out.print("Ditt svar: ");
        String svar3 = tangentbord.nextLine();
        if (svar3.equalsIgnoreCase("ja"))
        {
            poäng++;
        }
        System.out.println("     ");
        System.out.println("Fråga 4: Kommer nästa år att vara udda?");
        System.out.print("Ditt svar: ");
        String svar4 = tangentbord.nextLine();
        if (svar4.equalsIgnoreCase("nej"))
        {
            poäng++;
        }
        System.out.println("     ");
        System.out.println("Fråga 5: Var det senaste presidentvalet i USA år 2020?");
        System.out.print("Ditt svar: ");
        String svar5 = tangentbord.nextLine();
        if (svar5.equalsIgnoreCase("ja"))
        {
            poäng++;
        }

        //Resultat
        System.out.println("     ");
        System.out.println("Din slutpoäng är: "+poäng+"/5");
        tangentbord.close();
    }
}
