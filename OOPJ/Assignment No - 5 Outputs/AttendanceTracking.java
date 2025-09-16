import java.util.*;

class AttendanceTracking{
	public static void main(String args[]){
		Map<String, Integer> attendance = new TreeMap<>();
		attendance.put("Amit",90);
		attendance.put("Rohan", 85);
		attendance.put("Priya", 95);
		
		System.out.println("Attendance Report: " + attendance);
	}
}