// Droid class
public class Droid {
  String name;
  int batteryLevel;

  // Droid constructor
  public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;
  }

  // method that allows a droid to perform a task
  public void performTask(String task){
    System.out.println(name + " is performing task: " + task + ".");
    batteryLevel = batteryLevel - 10;
  }

  // method reports droid's energy level
  public void energyReport(){
    System.out.println(name + " currrently has a battery level of " + batteryLevel + "%.");
  }

  //method transfers energy from one droid to another droid and outprints how much was transferred between the two
  public void energyTransfer(int codey, int celly){
    int energyTransfer = codey - celly;
    System.out.print("There has been an energy transfer of " + energyTransfer + "%." + " From " + codey + " to " + celly + ".");
  
  }

  // override method is used to provide useful information about the object that is being created
  // This string is more helpful that the orignial object location that Java references by default
  @Override
  public String toString(){
    return "Hello, I'm the droid: " + name + ". " + "My battery level is currently at " + batteryLevel +"%.";
  }
  public static void main(String [] args) {

    // object of the first droid named Codey
    Droid codey = new Droid("Codey"); 
    System.out.println(codey);
    codey.performTask("dancing");
    codey.energyReport();

    //object of the second droid named Celly
    Droid celly = new Droid("Celly");
    System.out.println(celly);
    celly.performTask("Cleaning");
    celly.energyReport();

    //method is called to transfer energy from codey to celly
    codey.energyTransfer(100, 90);
   }
}
