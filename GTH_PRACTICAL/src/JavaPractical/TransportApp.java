package JavaPractical;
import java.util.*;
class Vehicles
{
	private String modelno;
	private String Registrationnumber;
	private int Vehiclespeed;
	private double Fuelcapacity;
	private double Fuelconsumption; 
	
	public Vehicles(String modelno,String Registrationnumber,int Vehiclespeed,double Fuelcapacity, double Fuelconsumption)
	{
		this.modelno=modelno;
		this.Registrationnumber=Registrationnumber;
		this.Vehiclespeed=Vehiclespeed;
		this.Fuelcapacity=Fuelcapacity;
		this.Fuelconsumption=Fuelconsumption;
	}

	public String getModelno() {
		return modelno;
	}

	public void setModelno(String modelno) {
		this.modelno = modelno;
	}

	public String getRegistrationnumber() {
		return Registrationnumber;
	}

	public void setRegistrationnumber(String registrationnumber) {
		Registrationnumber = registrationnumber;
	}

	public int getVehiclespeed() {
		return Vehiclespeed;
	}

	public void setVehiclespeed(int vehiclespeed) {
		Vehiclespeed = vehiclespeed;
	}

	public double getFuelcapacity() {
		return Fuelcapacity;
	}

	public void setFuelcapacity(double fuelcapacity) {
		Fuelcapacity = fuelcapacity;
	}

	public double getFuelconsumption() {
		return Fuelconsumption;
	}

	public void setFuelconsumption(double fuelconsumption) {
		Fuelconsumption = fuelconsumption;
	}
	public double fuelNeeded(double distance) 
	{
		return distance / Fuelcapacity;
	}
	 public double distanceCovered(double time) {
	        return Vehiclespeed * time;
	    }
	 public void display()
	 {
		 System.out.println("Vehicle Information");
		 System.out.println("Model is : "+ modelno);
		 System.out.println("Registration Number : "+Registrationnumber);
		 System.out.println("Vehiclespeed : "+Vehiclespeed);
		 System.out.println("Fuelcapacity : "+Fuelcapacity);
		 System.out.println("Fuelconsumption : "+Fuelconsumption);
	 }
}
class Truck extends Vehicles
{
	 private double cargoWeightLimit;

	    public Truck(String modelno, String Registrationnumber,int Vehiclespeed, double Fuelcapacity, double Fuelconsumption, double cargoWeightLimit) {
	        super(modelno, Registrationnumber, Vehiclespeed, Fuelcapacity, Fuelconsumption);
	        this.cargoWeightLimit = cargoWeightLimit;
	    }

	    public double getCargoWeightLimit() {
	        return cargoWeightLimit;
	    }

	    public void setCargoWeightLimit(double cargoWeightLimit) {
	        this.cargoWeightLimit = cargoWeightLimit;
	    }

	    public void display() {
	        super.display();
	        System.out.println("Cargo Weight Limit: " + cargoWeightLimit + " kilograms");
	    }
	}


class Bus extends Vehicles
{
	private int Noofpassengers;
	public Bus(String modelno, String Registrationnumber,int Vehiclespeed, double Fuelcapacity, double Fuelconsumption,int Noofpassengers) 
	{
        super(modelno, Registrationnumber, Vehiclespeed, Fuelcapacity, Fuelconsumption);
        this.Noofpassengers=Noofpassengers;
	}
	public int getNoofpassengers() {
		return Noofpassengers;
	}
	public void setNoofpassengers(int noofpassengers) {
		Noofpassengers = noofpassengers;
	}
	public void display()
	{
		super.display();
		 System.out.println("NO of Passengers : " + Noofpassengers);
		
	}
	
}

public class TransportApp {

	public static void main(String[] args) {
		Truck t =new Truck("splenderplus","MH22AU4161",20,100,500,1000);
		System.out.println(t.fuelNeeded(100));
		System.out.println(t.distanceCovered(2));
		t.display();
		Bus b=new Bus("PMPL","MH22ABC9558",30,200,1000,2000);	
		System.out.println(b.fuelNeeded(100));
		System.out.println(b.distanceCovered(2));
		b.display();

	}

}
