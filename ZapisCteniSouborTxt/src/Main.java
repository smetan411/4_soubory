import java.io.*;

public class Main {



    public static void zapisDoSouboru(){
        File file = new File(System.getProperty("user.home")
                + File.separator + "Desktop" + File.separator + "zapis" +
                File.separator + "zapisDoSouboru.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write("První řádek");
            bw.newLine();
            bw.write("Tento text je na druhém řádku");
            bw.newLine();
            bw.write("A do třetice.");
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            System.out.println("Do souboru se nepovedlo zapsat.");
        }
    }


    public static void cteniZeSouboru(){
        File file = new File(System.getProperty("user.home")
                + File.separator + "Desktop" + File.separator + "zapis" +
                File.separator + "zapisDoSouboru.txt");
        System.out.println("Vypisuji celý soubor:");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (Exception e) {
            System.out.println("Chyba při čtení ze souboru.");
        }
    }
}
