public class PlantTesterV3 {

    public static void main(String[] args) {
        PlantV3 plant = new PlantV3();
        double height = 6.3;
        double decayRate = 0.73;
        double growthRate = 1.5;
        height = plant.decay(height, decayRate);
        System.out.println("Height after decay: " + height);
        height = plant.growth(height, growthRate);
        System.out.println("Height after growth: " + height);
    }
}
