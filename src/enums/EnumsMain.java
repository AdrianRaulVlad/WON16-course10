package enums;

import java.util.Scanner;

public class EnumsMain {
    public static void main(String[] args) {
        CardinalPoints south = CardinalPoints.SOUTH;
        CardinalPoints north = CardinalPoints.NORTH;
        System.out.println(south);
        System.out.println(north);

        CardinalPoints anotherSouth = CardinalPoints.SOUTH;
        System.out.println(anotherSouth);

        CardinalPoints southFromString = CardinalPoints.valueOf("SOUTH");
        System.out.println(southFromString);

        Scanner s = new Scanner(System.in);
        System.out.println("Choose a cardinal point: ");
        String line = s.nextLine();
        CardinalPoints southFromStringScanner = CardinalPoints.fromNameCaseInsensitive(line);
        System.out.println(southFromStringScanner);

    }
}
