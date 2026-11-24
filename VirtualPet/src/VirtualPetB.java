// Part B

public class VirtualPetB {
    private String name;
    private int energyLevel;
    private int happinessLevel;
    private int weight;
    private int years;
    private int months;

    public VirtualPetB(String name){
        this.name = name;
        energyLevel = 0;
        happinessLevel = 0;
        weight = 5;
        years=0;
        months = 0;

    }
    public String getName(){

        return name;
    }


    public void feed(Food food) {
        energyLevel += food.getEnergyRating();
        happinessLevel += food.getHappinessRating();
        weight += food.getWeightGain();

        if(energyLevel > 10) {
            energyLevel = 10;
        }

        if(energyLevel < 0){
            energyLevel = 0;
        }

        if(happinessLevel > 10){
            happinessLevel = 10;
        }

        if(happinessLevel < 0){
            happinessLevel = 0;
        }

        if(weight < 5){
            weight = 5;
        }
    }
    public int getEnergyLevel(){
        return energyLevel;
    }
    public int getHappinessLevel(){
        return happinessLevel;
    }

    public boolean play(Game game) {
        weight -= game.getWeightLoss();

        if(weight < 5){
            weight = 5;
        }

        boolean won = game.isWinner();

        if(won){
            happinessLevel += game.getHappinessIncrease();
        }
        else{
            happinessLevel--;
        }

        if(happinessLevel > 10){
            happinessLevel = 10;
        }

        if(happinessLevel < 0){
            happinessLevel = 0;
        }

        return won;
    }
    public void updateStatus(){
        if(energyLevel>0){
            energyLevel--;
        }

        if(happinessLevel>0){
            happinessLevel--;

        }
        months++;
        if(months == 12){
            years++;
            months=0;
        }
    }


    public String toString(){
        return name + "'s Information:\n" + "Energy: " + energyLevel + "\n" + "weight: " + weight + "g\n" + "Age: " + months + " months and " + years + "years";
    }


}
