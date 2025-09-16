class Employee{
	private int age;
	public void setAge(int age){
		if(age >= 18){
			this.age = age;
		}
		else {
			System.out.println("Invalid age");
		}
	}
	public int getAge(){
		return age;
	}
	public static void main(String args[]){
		Employee e = new Employee();
		e.setAge(17);
		e.setAge(25);  
		System.out.println(" Age = "+ e.getAge());
	}
}