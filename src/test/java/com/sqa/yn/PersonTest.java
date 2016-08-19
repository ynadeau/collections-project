/**
 * File Name: PersonTest.java<br>
 * Nadeau, Yves<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Aug 18, 2016
 */
package com.sqa.yn;

import org.junit.*;

/**
 * PersonTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nadeau, Yves
 * @version 1.0.0
 * @since 1.0
 */
public class PersonTest {

	@Test
	public void testPersonCreation() {
		// New person object to store variables
		Person person = new Person();
		// Display person content
		System.out.println(person.toString());
	}
}
