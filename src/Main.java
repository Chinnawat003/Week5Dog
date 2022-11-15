public class Main {
    public static void main(String[] args) {
        Dog Dog1Object = new Dog();
        Dog Dog2Object = new Dog();
        Dog Dog3Object = new Dog();
        //----------------------//
        Dog1Object.testDog();
        Dog2Object.testDog2();
        Dog3Object.testDog3();

        Lamp led = new Lamp();

        led.turnon();
    }
}