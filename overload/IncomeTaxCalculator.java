package overload;

public class IncomeTaxCalculator {
    public static void main(String[] args) {

        double salary1 = 1000.0;
        double salary2 = 2000.0;
        double salary3 = 3000.0;


        System.out.println("Tax for salary1 (default rate): " + calculateIncomeTax(salary1));
        System.out.println("Tax for salary2 (custom rate 15%): " + calculateIncomeTax(salary2, 15.0));
        System.out.println("Tax for salary3 (IT sector): " + calculateIncomeTax(salary3, true));
        System.out.println("Tax for salary3 (non-IT sector): " + calculateIncomeTax(salary3, false));
    }

    static double calculateIncomeTax(double salary) {
        return calculateIncomeTax(salary, 20.0);
    }

    static double calculateIncomeTax(double salary, double taxRate) {
        if (taxRate < 0 || taxRate > 100) {
            System.out.println("Invalid tax rate. Please provide a valid percentage.");
            System.exit(0);
        }
        return salary * (taxRate / 100);
    }

    static double calculateIncomeTax(double salary, boolean isITSector) {
        if (isITSector) {
            return calculateIncomeTax(salary, 10.0);
        } else {
            return calculateIncomeTax(salary);
        }
    }

}