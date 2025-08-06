import java.util.Scanner;

class GasMeter{
    static float totalGasUsed = 0;
    public static void addGas(float gasUsed) {
        totalGasUsed += gasUsed;
    }
    public static void totalGasUsed() {
        System.out.println("Total used fuel: " + totalGasUsed);
    }
}
class gas95 extends GasMeter{
    static float gas95Used = 0;

    public static void addGas95(float gasUsed) {
        gas95Used += gasUsed;
        addGas(gasUsed);
    }
    public static void getGas95Used() {
        System.out.println("Total used 95 fuel: " + gas95Used);
    }
}

class gas98 extends GasMeter{
    static float gas98Used = 0;

    public static void addGas98(float gasUsed) {
        gas98Used += gasUsed;
        addGas(gasUsed);
    }
    public static void getGas98Used() {
        System.out.println("Total used 98 fuel: " + gas98Used);
    }
}

class diesel extends GasMeter{
    static float dieselUsed = 0;

    public static void addDiesel(float gasUsed) {
        dieselUsed += gasUsed;
        addGas(gasUsed);
    }
    public static void getDieselUsed() {
        System.out.println("Total used diesel fuel: " + dieselUsed);
    }
}   

public class GasMeterProgram {
    public static void main(String[] args) {
        System.out.println("What do you want? 1. 95, 2. 98, 3. Diesel");
        Scanner sc = new Scanner(System.in);
        float litres;
        int choice;
        do{
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("How much do you want to refuel: ");
                    litres = sc.nextFloat();
                    gas95 obj95 = new gas95();
                    obj95.addGas95(litres);
                    break;
                case 2:
                    System.out.println("How much do you want to refuel: ");
                    litres = sc.nextFloat();
                    gas98 obj98 = new gas98();
                    obj98.addGas98(litres);
                    break;
                case 3:
                    System.out.println("How much do you want to refuel: ");
                    litres = sc.nextFloat();
                    gas98 objDiesel = new gas98();
                    objDiesel.addGas98(litres);
                    break;
                case 0:
                    GasMeter demoGasMeter = new GasMeter();
                    gas95 demoGas95 = new gas95();
                    gas98 demoGas98 = new gas98();
                    diesel demoDiesel = new diesel();

                    demoGasMeter.totalGasUsed();
                    demoGas95.getGas95Used();
                    demoGas98.getGas98Used();
                    demoDiesel.getDieselUsed();
                    break;
            }
        }while(choice != 0);
    }
}
