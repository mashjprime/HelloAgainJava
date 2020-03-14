import java.util.Scanner;

// Topic 1 tutelab exercise written by Caspar
// this code lacks cohesion and encapsulation and is a prime example of how NOT to write code that is readable/reusable/extensible!
// i.e. it is poor quality code ;)
//
// TODO: fix it by extracting methods and choosing appropriate use of local variables and parameters
//       consider the use of static variables as well and use printf where appropriate
//
// Ohm's law V=IR .. https://en.wikipedia.org/wiki/Ohm%27s_law
public class TuteLab01 {
    private static Scanner scanner = new Scanner(System.in);

    static void tuteLab01() {
        final int TOTAL_INPUT = 3;
        double[] volts = new double[TOTAL_INPUT];
        double[] amps = new double[TOTAL_INPUT];
        double[] resistance = new double[TOTAL_INPUT];

        System.out.println("Enter " + TOTAL_INPUT + " pairs of V and I");

        for (int count = 0; count < TOTAL_INPUT; count++) {
            volts[count] = getInputValues("Enter Voltage (V) in volts: ");
            amps[count] = getInputValues("Enter Current (I) in amperes: ");
            resistance[count] = volts[count] / amps[count];

            System.out.println("Resistance R is " + resistance[count] + " ohms\n");
        }

        System.out.println(calculateOutput("Volts", volts));
        System.out.println(calculateOutput("Amps", amps));
        System.out.println(calculateOutput("Resistance", resistance));
    }


    private static double getInputValues(String message) {
        double num = 0;
        boolean doAgain = true;
        do {
            try {
                System.out.print(message);
                num = Double.parseDouble(scanner.nextLine());
                doAgain = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Input error");
            }
        }
        while (doAgain);

        return num;
    }

    private static String calculateOutput(String measurement, double[] num) {

        double total = 0;
        double max = num[0];
        double min = num[0];
        for (double i : num) {
            total += i;
            if (i > max) {
                max = i;
            }
            if(i<min) {
                min = i;
            }
        }
        double avg = total / num.length;
        return (measurement + ".. Avg=" + avg + ", Max=" + max + ", Min=" + min);
    }
}
