import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DatabaseManager dbManager = new DatabaseManager();
        importData("funn.txt", dbManager);

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Velkommen til historiske gjenstander systemet!");
            System.out.println("Vennligst velg et alternativ:");
            System.out.println("1. Se informasjon om alle funngjenstander");
            System.out.println("2. Se informasjon om alle funngjenstander eldre enn et gitt årstall");
            System.out.println("3. Få informasjon om antall funngjenstander registrert");
            System.out.println("4. Avslutte programmet");

            int valg = scanner.nextInt();
            scanner.nextLine(); // Konsumerer den resterende nye linjen

            switch (valg) {
                case 1:
                    // Logikk for å vise alle funngjenstander
                    visAlleFunngjenstander(dbManager);
                    break;
                case 2:
                    // Logikk for å vise alle funngjenstander eldre enn gitt årstall
                    System.out.println("Vennligst skriv inn årstall:");
                    int arstall = scanner.nextInt();
                    visFunngjenstanderEldreEnn(dbManager, arstall);
                    break;
                case 3:
                    // Logikk for å vise antall registrerte funngjenstander
                    visAntallFunngjenstander(dbManager);
                    break;
                case 4:
                    // Avslutt programmet
                    running = false;
                    System.out.println("Programmet avsluttes. Ha en fin dag!");
                    break;
                default:
                    System.out.println("Ugyldig valg, vennligst prøv igjen.");
                    break;
            }
        }

        scanner.close();
    }

    private static void importData(String filename, DatabaseManager dbManager) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            // Håndter importering av personer
            line = br.readLine();
            if (line.equals("Personer:")) {
                int antallPersoner = Integer.parseInt(br.readLine());
                for (int i = 0; i < antallPersoner; i++) {
                    int id = Integer.parseInt(br.readLine());
                    String navn = br.readLine();
                    String telefonnummer = br.readLine();
                    String epost = br.readLine();
                    Person person = new Person(id, navn, telefonnummer, epost);
                    dbManager.insertPerson(person);
                }
            }

            // Håndter importering av museer
            line = br.readLine();
            if (line.equals("Museer:")) {
                int antallMuseer = Integer.parseInt(br.readLine());
                for (int i = 0; i < antallMuseer; i++) {
                    int id = Integer.parseInt(br.readLine());
                    String navn = br.readLine();
                    String sted = br.readLine();
                    Museum museum = new Museum(id, navn, sted);
                    dbManager.insertMuseum(museum);
                }
            }

            // Håndter importering av funn
            line = br.readLine();
            if (line.equals("Funn:")) {
                while ((line = br.readLine()) != null) {
                    int id = Integer.parseInt(line);
                    String koordinater = br.readLine();
                    int personId = Integer.parseInt(br.readLine());
                    String dato = br.readLine();
                    int arstall = Integer.parseInt(br.readLine());
                    Integer museumId = null;
                    String museumIdStr = br.readLine();
                    if (!museumIdStr.isEmpty()) {
                        museumId = Integer.parseInt(museumIdStr);
                    }
                    String type = br.readLine();
                    String egenskaper;

                    switch (type) {
                        case "Mynt":
                            int diameter = Integer.parseInt(br.readLine());
                            String metall = br.readLine();
                            egenskaper = "Diameter: " + diameter + ", Metall: " + metall;
                            Mynt mynt = new Mynt(id, koordinater, personId, dato, arstall, museumId, diameter, metall);
                            dbManager.insertFunngjenstand(mynt);
                            break;
                        case "Våpen":
                            String typeVåpen = br.readLine();
                            String materiale = br.readLine();
                            int vekt = Integer.parseInt(br.readLine());
                            egenskaper = "Type Våpen: " + typeVåpen + ", Materiale: " + materiale + ", Vekt: " + vekt;
                            Våpen våpen = new Våpen(id, koordinater, personId, dato, arstall, museumId, typeVåpen, materiale, vekt);
                            dbManager.insertFunngjenstand(våpen);
                            break;
                        case "Smykke":
                            String typeSmykke = br.readLine();
                            int verdiEstimat = Integer.parseInt(br.readLine());
                            String bildeFilnavn = br.readLine();
                            egenskaper = "Type Smykke: " + typeSmykke + ", Verdi Estimat: " + verdiEstimat + ", Bilde Filnavn: " + bildeFilnavn;
                            Smykke smykke = new Smykke(id, koordinater, personId, dato, arstall, museumId, typeSmykke, verdiEstimat, bildeFilnavn);
                            dbManager.insertFunngjenstand(smykke);
                            break;
                    }

                    // Les separatoren
                    br.readLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void visAlleFunngjenstander(DatabaseManager dbManager) {
        // Metode for å vise all informasjon om funngjenstander
        // Implementer databaseforespørsel her og print resultater
    }

    private static void visFunngjenstanderEldreEnn(DatabaseManager dbManager, int arstall) {
        // Metode for å vise informasjon om funngjenstander eldre enn gitt årstall
        // Implementer databaseforespørsel her og print resultater
    }

    private static void visAntallFunngjenstander(DatabaseManager dbManager) {
        // Metode for å vise antall registrerte funngjenstander
        // Implementer databaseforespørsel her og print resultater
    }
}
