// Part A

public class VirtualPet {
private String name;
private int energyLevel;
private int happinessLevel;
private int weight;
private int ageYears;
private int ageMonths;

public VirtualPet(String name){
    this.name = name;
    this.weight = 5;

}
public String getName(){
    return name;
}

    public String toString() {
        return name+energyLevel+happinessLevel+weight+ageYears+ageMonths;
    }
public void feed(){
    energyLevel+=1;
    weight+=1;
    if(energyLevel>10){
        energyLevel=10;
    }
}
public int getEnergyLevel(){
    return energyLevel;
}
public int getHappinessLevel(){
    return happinessLevel;
}

public void play(){
    happinessLevel+=1;
    weight-=1;
}

}
