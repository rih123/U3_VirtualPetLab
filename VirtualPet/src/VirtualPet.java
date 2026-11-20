// Part A

public class VirtualPet {
private String name;
private int energyLevel;
private int happinessLevel;
private int weight;
private int years;
private int months;

public VirtualPet(String name){
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


public void feed(){
   if(energyLevel<10){
       energyLevel++;
   }
weight++;
}
public int getEnergyLevel(){
    return energyLevel;
}
public int getHappinessLevel(){
    return happinessLevel;
}

public void play(){
   if(happinessLevel<10){
       happinessLevel++;
   }

if(weight>5){
    weight--;
}


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
