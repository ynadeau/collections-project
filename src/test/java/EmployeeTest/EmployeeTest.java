/**
 * File Name: EmployeeTest.java<br>
 * Nadeau, Yves<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Aug 18, 2016
 */
package EmployeeTest;

import org.junit.*;

/**
 * EmployeeTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nadeau, Yves
 * @version 1.0.0
 * @since 1.0
 */
public class EmployeeTest {

	String address;

	String age;

	String jobTitle, name;

	int numEmployee;

	String userName;

	/**
	 * @param age
	 * @param jobTitle
	 * @param name
	 * @param address
	 * @param numEmployee
	 * @param userName
	 */
	public EmployeeTest(String age, String jobTitle, String name, String address, int numEmployee, String userName) {
		super();
		this.age = age;
		this.jobTitle = jobTitle;
		this.name = name;
		this.address = address;
		this.numEmployee = numEmployee;
		this.userName = userName;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return this.address;
	}

	/**
	 * @return the age
	 */
	public String getAge() {
		return this.age;
	}

	/**
	 * @return the jobTitle
	 */
	public String getJobTitle() {
		return this.jobTitle;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @return the numEmployee
	 */
	public int getNumEmployee() {
		return this.numEmployee;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return this.userName;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * @param jobTitle
	 *            the jobTitle to set
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param numEmployee
	 *            the numEmployee to set
	 */
	public void setNumEmployee(int numEmployee) {
		this.numEmployee = numEmployee;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Test
	public void test() {
		// fail("Not yet implemented");
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmployeeTest [age=" + this.age + ", jobTitle=" + this.jobTitle + ", name=" + this.name + ", address=" + this.address + ", numEmployee=" + this.numEmployee + ", userName=" + this.userName + "]";
	}
}
