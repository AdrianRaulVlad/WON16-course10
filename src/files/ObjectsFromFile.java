package files;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ObjectsFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("files", "persons.csv"));
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] tokens = line.split(",");
            if (tokens.length == 1 && tokens[0].isEmpty()) {
                continue;
            }
            Person p = new Person(tokens[0],
                    tokens.length >= 2 ? Integer.parseInt(tokens[1].replaceAll("[^0-9]", "")) : 18,
                    tokens.length >= 3 ? tokens[2] : "no job");
            System.out.println(Arrays.toString(tokens));
        }
    }

    private static void writeReport(List<Person> persons, String reportPath) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(reportPath));
        bufferedWriter.write("number of persons: " + persons.size());
        bufferedWriter.newLine();
        for (Person person:persons) {
//            bufferedWriter.write(person.name() + " has age " + person.age() + " with position " + person.position());
            bufferedWriter.write(String.format("%s has age %d with position %s", person. name(),person.age(), person.position()));
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
