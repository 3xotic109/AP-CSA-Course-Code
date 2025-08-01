public class PlantTesterV8 {

    public static void main(String[] args) {
        PlantV8 plant = new PlantV8("Grass", 1.2, 0.14, 1.64, "Green");
        PlantV8 plant1 = new PlantV8();
        PlantV8 plant2 = new PlantV8("Sunflower", 6.8, 0.53, 1.85, "Yellow");
        double plantHeight;
        plantHeight = plant.decay(plant.getHeight(), plant.getDecayRate());

        plant1.setName("Rose");
        plant1.setColor("Red");
        plant1.setHeight(3.5);
        plant1.setDecayR(0.46);
        plant1.setGrowthR(1.64);

        double plant1Height = plant1.decay();

        double plant2Height = plant2.growth();

        System.out.println(plant.getName() + " height after decay:\t\t" + plantHeight + " inches");

        System.out.println(plant1.getName() + " height after decay:\t\t\t" + plant1Height + " inches");

        System.out.println(plant2.getName() + " height after growth:\t" + plant2Height + " inches");



    }
}
