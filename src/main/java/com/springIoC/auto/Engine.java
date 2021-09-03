package com.springIoC.auto;

public class Engine {

	int horsepower;
	int maxRPM;
	float displacement;
	String cylinderConfig;
	String recommendedFuel;
	
	
	public Engine() {
		super();
		System.out.println("Engine parameterized ctor");

		// TODO Auto-generated constructor stub
	}

	public Engine(int horsepower, int maxRPM, float displacement, String cylinderConfig, String recommendedFuel) {
		super();
		System.out.println("Engine parameterized ctor");
		this.horsepower = horsepower;
		this.maxRPM = maxRPM;
		this.displacement = displacement;
		this.cylinderConfig = cylinderConfig;
		this.recommendedFuel = recommendedFuel;
	}
	
	public int getHorsepower() {
		return horsepower;
	}
	public void setHorsepower(int horsepower) {
		System.out.println("Engine Setter ctor");

		this.horsepower = horsepower;
	}
	public int getMaxRPM() {
		return maxRPM;
	}
	public void setMaxRPM(int maxRPM) {
		this.maxRPM = maxRPM;
	}
	public float getDisplacement() {
		return displacement;
	}
	public void setDisplacement(float displacement) {
		this.displacement = displacement;
	}
	public String getCylinderConfig() {
		return cylinderConfig;
	}
	public void setCylinderConfig(String cylinderConfig) {
		this.cylinderConfig = cylinderConfig;
	}
	public String getRecommendedFuel() {
		return recommendedFuel;
	}
	public void setRecommendedFuel(String recommendedFuel) {
		this.recommendedFuel = recommendedFuel;
	}
	@Override
	public String toString() {
		return "Engine [horsepower=" + horsepower + ", maxRPM=" + maxRPM + ", displacement=" + displacement
				+ ", cylinderConfig=" + cylinderConfig + ", recommendedFuel=" + recommendedFuel + "]";
	}
	
	
	
}
