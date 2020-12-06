public class Car {

    private String password;
    public boolean engineOn = false;

    //Adgangskode til bilen
    Car() {
        this.password = "password1234";
        this.engineOn = false;
    }

    public void TurnEngineOn(CarKey Key) {
        if (Key.equals(password)) {
            System.out.println("Bilen er tændt");
            engineOn = true;
        }
        else {
            System.out.println("Bilen er ikke tændt, pga. forkert nøgle.");
        }
    }
    public void releaseHandbreak () {
    }
    public void changeToGear (int i) {
    }
    public void pressClutch () {
    }
    public void releaseClutch() {
    }
    public void pressSpeeder (int i){
    }




}