
 
public class Vehicle implements Comparable<Vehicle>{
 
    String name; 
    long maxSpeed;
    String model;
 
    public Vehicle(String name, long maxSpeed)  {
        super();
        this.name = name;
        this.maxSpeed = maxSpeed;
        
    }
 
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(long maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
 
    @Override
    public String toString() {
        return "Vehicle name: "+name+"|Max speed: "+maxSpeed;
    }
 
    @Override
    public int compareTo(Vehicle v) {
        return this.getName().compareTo(v.getName());
    }
}
