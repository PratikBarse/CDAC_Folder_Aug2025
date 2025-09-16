interface Callable{
	void makeCall(String number);
}
interface Messaging{
	void sendMessage(String number, String message);
}
interface Internet{
	void browser(String website);
}
class SmartPhone implements Callable, Messaging, Internet{

		public void makeCall(String number){
			System.out.println("Calling "+ number);
		}
		
		public void sendMessage(String number, String message){
		System.out.println("Sending message to " + number + ":" + message);
		}
		
		public void browser(String website){
		 System.out.println("Browsing website: " + website);
		}
	
}
public class SmartPhoneDemo{
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.makeCall("9876543210");
        phone.sendMessage("9876543210", "Hello!");
        phone.browser("www.google.com");
    }
}