public class CarTest {
    public static void main(String[] args) {
        testSuite();
    }
    private static void testSuite() {
        System.out.println("TestSuiten kører");
        System.out.println("Test 1(bilen skal være tændt): ");
        testStartCarWithCorrectKey();
        System.out.println("Test 2 (bilen skal ikke være tændt): ");
        testStartCarWithWrongKey();
    }
    private static void testStartCarWithCorrectKey(){
        Car andrasCar = new Car();
        CarKey Key = new CarKey("password1234");
        andrasCar.TurnEngineOn(Key);
    }
    private static void testStartCarWithWrongKey(){
        Car andrasCar = new Car();
        CarKey Key = new CarKey("Hest");
    }
    private static void testStartCarCanDrive(){
        Car andrasCar = new Car();
        CarKey Key = new CarKey("password1234");
        andrasCar.TurnEngineOn(Key);
        // Tag håndbremsen fra
        andrasCar.releaseHandbreak();
        // Sæt bilen i frigear
        andrasCar.changeToGear(0);
        // Hvis den er i frigear, tryk kobling ned
        andrasCar.pressClutch();
        // Skift gear til 1
        andrasCar.changeToGear(1);
        // Slip koblingen
        andrasCar.releaseClutch();
        // Tryk gaspadelane (halvt) ned
        andrasCar.pressSpeeder(3);
    }
}
