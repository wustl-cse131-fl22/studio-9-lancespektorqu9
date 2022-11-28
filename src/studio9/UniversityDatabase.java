package studio9;

import java.util.Map;
import java.util.HashMap;

import assignment7.Student;

public class UniversityDatabase {
	private Map<String, Student> database;
	//TODO: Complete this class according to the studio instructions
	
	public UniversityDatabase() {
		this.database = new HashMap<>();
	}

	public void addStudent(String accountName, Student student) {
		database.put(accountName, student);
	}

	public int getStudentCount() {
		// TODO
		return database.size();
	}

	public String lookupFullName(String accountName) {
		// TODO: Complete according to studio instructions
		if(database.get(accountName) == null) {
			return null;
		}
		return database.get(accountName).getFullName();
	}

	public double getTotalBearBucks() {
		double sum = 0.0;
		for(String student : database.keySet()) {
			sum += database.get(student).getBearBucksBalance();
		}
		return sum;
	}
}
