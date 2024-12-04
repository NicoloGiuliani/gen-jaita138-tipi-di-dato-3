import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Fiore
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cerca un fiore.");
        
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        
        System.out.println("Tipologia");
        System.out.println("0-ANNUALE");
        System.out.println("1-PERENNE");
        System.out.println("2-BULBOSO");
        System.out.println("3-ARBUSTIVO");
        System.out.println("4-TREPPIANTE");
        System.out.println("5-ACQUATICO");
        byte tipologiaNum = sc.nextByte();
        TipologiaFiori tipologiaFiore = TipologiaFiori.values()[tipologiaNum];

        System.out.println("Prezzo: ");
        Double prezzo = sc.nextDouble();

        System.out.println("Quantità:");
        Short quantita=sc.nextShort();

        sc.nextLine();

        System.out.println("Colore principale: ");
        String colore = sc.nextLine();

        System.out.println("Inizio della disponibilità (dd/MM/yyyy): ");
        String InizioDisponibilitàStr =sc.nextLine();
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate InizioDisponibilità = LocalDate.parse(InizioDisponibilitàStr, formatter);

        System.out.println("Fine della disponibilità (dd/MM/yyyy): ");
        String FineDisponibilitàStr =sc.nextLine();
        LocalDate FineDisponibilità = LocalDate.parse(FineDisponibilitàStr, formatter);

        System.out.println("Profumo: ");
        Boolean profumo =sc.nextBoolean();

        System.out.println("Artificiale: ");
        Boolean artificiale =sc.nextBoolean();

        System.out.println("Il fiore che stai cercando è:");
        System.out.println("Nome: " +nome);
        System.out.println("Tipologia: " +tipologiaFiore);
        System.out.println("Prezzo: " +prezzo + "€");
        System.out.println("Quantità: "+quantita);
        System.out.println("Colore principale: " +colore);
        System.out.println("Inizio periodo della disponibilità: " +InizioDisponibilità);
        System.out.println("Fine periodo della disponibilità: " +FineDisponibilità);
        System.out.println("Profumo: "+profumo);
        System.out.println("Artificiale: "+artificiale);
        sc.close();
    }
}