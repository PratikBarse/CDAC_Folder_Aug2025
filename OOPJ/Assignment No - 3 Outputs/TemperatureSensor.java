class TemperatureSensor{
	private int temperature;
		void setTemperature(int t){
			if(t >= 0 && t <= 100){
				this.temperature = t;
			}else {
				System.out.println("Temperature out of Range");
			}
		}
		int getTemperature(){
			return temperature;
		}
	public static void main(String args[]){
		TemperatureSensor sensor = new TemperatureSensor();
		sensor.setTemperature(-5);
		sensor.setTemperature(55);
		System.out.println("Temperature = " + sensor.getTemperature());
		
	}

}