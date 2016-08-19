/**
 * File Name: EmployeeRegistration.java<br>
 * Nadeau, Yves<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Aug 18, 2016
 */
package employee;

import com.sqa.yn.util.helpers.*;

/**
 * EmployeeRegistration //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nadeau, Yves
 * @version 1.0.0
 * @since 1.0
 */
public class EmployeeRegistration {

	static private String[] age;

	static private String[] jobTitle, name, address;

	static private int numEmployee;

	static String appName = "Employee Registration";

	static String userName;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		userName = AppBasics.welcomeUserAndGetUsersName(appName);
		numEmployee = RequestInput.getInt("How many employees do you want to enter into the system? ");
		initializeArrays();
		requestUserInput();
		displayEmployeeDetails();
		AppBasics.farewellUser(userName, appName);
	}

	/**
	 *
	 */
	private static void displayEmployeeDetails() {
		for (int i = 0; i < numEmployee; i++) {
			System.out.println("#" + i + ":");
			System.out.println("Name: " + name[i]);
			System.out.println("City: " + address[i]);
			System.out.println("Ages: " + age[i]);
			System.out.println("Job Title: " + jobTitle[i]);
		}
	}

	/**
	 *
	 */
	private static void initializeArrays() {
		name = new String[numEmployee];
		address = new String[numEmployee];
		age = new String[numEmployee];
		jobTitle = new String[numEmployee];
	}

	/**
	 *
	 */
	private static void requestUserInput() {
		for (int i = 0; i < numEmployee; i++) {
			name[i] = RequestInput.getString("What is employee " + i + "'s name: ");
			address[i] = RequestInput.getString("What is employee " + i + " address: ");
			age[i] = RequestInput.getString("What is animal " + i + "'s age: ");
			jobTitle[i] = RequestInput.getString("What is employee " + i + "'s job title: ");
		}
	}
}
