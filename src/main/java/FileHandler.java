import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<covid19data> Covid19data = new ArrayList<covid19data>();

        File f = new File("src/main/resources/11_noegletal_pr_region_pr_aldersgruppe.csv");
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNext()) {
                String linje = sc.nextLine();
                String[] att = linje.split(";");

                covid19data indlæstData = new covid19data(
                        att[0], att[1], Integer.parseInt(att[2]),
                        Integer.parseInt(att[3]), Integer.parseInt(att[4]), Integer.parseInt(att[5]), att[6]

                );
                Covid19data.add(indlæstData);
            }
            sc.close();
        } catch (IOException e) {
            System.out.println("Fejl i kommunikatio nmed filen");
        } catch (NumberFormatException e) {
            System.out.println("Fejl i filformat");
        }
        System.out.println(Covid19data);
    }
}
