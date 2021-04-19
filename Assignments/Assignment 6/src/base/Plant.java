package base;


public class Plant {
    String name;
    Boolean needsWatering;
    String plantFamily;


    public Plant(String name, Boolean needsWatering, String plantFamily) {
        System.out.println("Plant Information!");
        this.name = name;
        this.needsWatering = needsWatering;
        this.plantFamily = plantFamily;
    }

    public void wateringInstructions(Boolean needsWatering) {
        System.out.println("Watering instructions");
        if (true){
            System.out.println("Water small plants such as groundcovers, cacti, and annuals to a depth of 1 foot "+
                    "Water medium plants such as shrubs to a depth of 2 feet." +
                    "Water large plants such as trees to a depth of 3 feet.");
        }
        else {
            System.out.println("This plant does not need watering");
        }
    }

    public void wateringInstructions() {
        System.out.println("WATERING INSTRUCTIONS");
        if (this.needsWatering==true){
            System.out.println("-Water small plants such as groundcovers, cacti, and annuals to a depth of 1 foot\n"+
                    "-Water medium plants such as shrubs to a depth of 2 feet\n" +
                    "-Water large plants such as trees to a depth of 3 feet.");
        }
        else {
            System.out.println("This plant does not need watering");
        }
    }

    public void sunlightRequirements(){
        System.out.println("SUNLIGHT REQUIREMENTS");
        System.out.println("All plants require sunlight to undergo photosythensis.");
        System.out.println("-Full sun: Plants need at least 6 hours of direct sun daily\n" +
                "-Part sun: Plants thrive with between 3 and 6 hours of direct sun per day\n" +
                "-Part shade: Plants require between 3 and 6 hours of sun per day, but need protection from intense mid-day sun\n" +
                "-Full shade: Plants require less than 3 hours of direct sun per day\n");

    }

    public void getInfo(){
        System.out.println("Scientific name: " + this.name);
        System.out.println("Does this plant need watering? " + this.needsWatering);
        System.out.println("Plant Family: " + this.plantFamily);
    }
}
