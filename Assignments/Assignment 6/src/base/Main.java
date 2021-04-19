package base;

public class Main {

    public static void main(String[] args) {
        Plant carrot = new Plant("Daucus Carota", true, "Apiaceae");
        carrot.getInfo();
        carrot.wateringInstructions();
        carrot.sunlightRequirements();

        System.out.println();

        Plant taro = new Plant("Colocasia Esculenta", false, "Araceae");
        taro.getInfo();
        taro.wateringInstructions();
        taro.sunlightRequirements();

    }
}
