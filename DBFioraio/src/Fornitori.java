import java.util.Scanner;

public class Fornitori
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        Boolean condizione = true;
        while (condizione)
        {
            System.out.println("Cerca un fornitore.");
        
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            
            System.out.println("Categoria:");
            System.out.println("0-Piante");
            System.out.println("1-Vasellame");
            System.out.println("2-Concime");
            System.out.println("3-Giardinaggio");
            byte categoriaNum = sc.nextByte();
            CategoriaFornitori categoriaFornitore = CategoriaFornitori.values()[categoriaNum];

            sc.nextLine();
            
            System.out.println("Partita iva: ");
            String pIva = sc.nextLine();

            System.out.println("Locazione: ");
            String locazione = sc.nextLine();

            System.out.println("Numero di telefono: ");
            String telefono = sc.nextLine();

            System.out.println("Email: ");
            String email = sc.nextLine();

            System.out.println("Lingua principale: ");
            String lingua = sc.nextLine();

            System.out.println("Iban: ");
            String iban = sc.nextLine();

            System.out.println("Nome referente: ");
            String nomeReferente = sc.nextLine();

            System.out.println("Note: ");
            String note = sc.nextLine();

            System.out.println("Il fiore che stai cercando è:");
            System.out.println("Nome: " +nome);
            System.out.println("Categoria: " +categoriaFornitore);
            System.out.println("Partita iva: " +pIva);
            System.out.println("Locazione: "+locazione);
            System.out.println("Telefono: " +telefono);
            System.out.println("Email: " +email);
            System.out.println("Lingua principale: " +lingua);
            System.out.println("Iban: "+iban);
            System.out.println("Nome referente: "+nomeReferente);
            System.out.println("Note aggiuntive: "+note);

            System.out.println("Serve un altro fornitore? true:Si, false:NO");
            condizione = sc.nextBoolean();
            sc.nextLine();
        }
        sc.close();
    }
}