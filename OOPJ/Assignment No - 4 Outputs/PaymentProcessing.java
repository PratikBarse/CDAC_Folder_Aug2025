class PaymentProcessing{
	public static void main(String arg[]){
	
	try{
		throw new Exception("Payment Failed"); 
	}catch(Exception e){

	System.out.println("Exception Occurred :" + e.getMessage());
	}finally{
		System.out.println("Cleanup done");
	}
		
	}
	
}