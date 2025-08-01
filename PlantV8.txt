public class PlantV8 {
    double h;
    double decayR;
    double growthR;
    String n;
    String c;

    public PlantV8(){
    }
    public PlantV8(String name, double height, double decayRate, double growthRate, String color){
        n = name;
        h = height;
        decayR = decayRate;
        growthR = growthRate;
        c = color;
    }
    public String getName(){return n;}
    public double getHeight(){return h;}
    public double getDecayRate(){return decayR;}
    public double getGrowthRate(){return growthR;}
    public String getColor(){return c;}

    public void setName(String name){n = name;}
    public void setHeight(double height){h = height;}
    public void setDecayR(double decayRate){decayR = decayRate;}
    public void setGrowthR(double growthRate){growthR = growthRate;}
    public void setColor(String color){c = color;}

    public double decay(double height, double decayRate){
        return height * decayRate;
    }
    public double decay(){
        return h*decayR;
    }
    public double growth(double height, double growthRate){
        return height * growthRate;
    }
    public double growth(){
        return h*growthR;
    }

}