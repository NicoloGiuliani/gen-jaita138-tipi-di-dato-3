import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Cliente
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iscriviti e inserisci i dati.");
        
        System.out.println("Nome: ");
        String nomeUtente = sc.nextLine();
        
        System.out.println("Cognome: ");
        String cognome = sc.nextLine();
    
        System.out.println("Data di nascita: [dd/MM/yyyy] ");
        String dataNascitaStr =sc.nextLine();
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascita = LocalDate.parse(dataNascitaStr, formatter);
        
        System.out.println("Numero di telefono: ");
        String telefono = sc.nextLine();

        System.out.println("Note: ");
        String note = sc.nextLine();

        System.out.println("E-Mail: ");
        String email = sc.nextLine();

        System.out.println("Password: ");
        String password = sc.nextLine();

        System.out.println("Username: ");
        String username = sc.nextLine();

        System.out.println("Il piatto che hai creato:");

        System.out.println("Nome: " + nomeUtente);
        System.out.println("Cognome: " +cognome);
        System.out.println("Data di nascita: " + dataNascita);
        System.out.println("Numero di telefono: " + telefono);
        System.out.println("Note: " + note);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Username: " + username);
        sc.close();
    }
} 