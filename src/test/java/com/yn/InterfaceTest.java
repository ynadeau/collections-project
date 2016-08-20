/**
 * File Name: InterfaceTest.java<br>
 * Nadeau, Yves<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Aug 20, 2016
 */
package com.yn;

import org.junit.*;

/**
 * InterfaceTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nadeau, Yves
 * @version 1.0.0
 * @since 1.0
 */
public class InterfaceTest {

	@Test
	public void test() {
		// IMultimedia media = new Video("Paramount");
		// media.play();
		// IMultimedia media2 = new Video("Sony");
		// media2.play("Garfield");
		// Create Person object and store inside "person" named variable
		IMultimedia[] theMedia = new IMultimedia[3];
		theMedia[0] = new Video("Bye Bye Birdie");
		theMedia[1] = new Video("BraveHeart");
		theMedia[2] = new Video("Matrix");
		// Display person content by call the toString method on the object
		for (int i = 0; i < theMedia.length; i++) {
			System.out.println("Watch Video");
			theMedia[i].play();
			theMedia[i].skip();
			theMedia[i].stop();
			System.out.println("Watch another Video");
			theMedia[i].play("one");
			// theMedia[i].skip("two");
			// theMedia[i].stop("three");
		}
		System.out.println(theMedia[0].toString());
	}
	/*
	 * Watch Video Playing default video from Bye Bye Birdie. Skipping video, Stopping Video 
	 * Watch another Video Playing one video from Bye Bye Birdie.
	 * Watch Video Playing default video from BraveHeart. Skipping video, Stopping Video 
	 * Watch another Video Playing one video from BraveHeart.
	 * Watch Video Playing default video from Matrix. Skipping video Stopping Video 
	 * Watch another Video Playing one video from Matrix. 
	 * 
	 * Video [brand=Bye Bye Birdie, topic=No topic, title=Untitled, getBrand()=Bye Bye Birdie,
	 * getTopic()=No topic, getTitle()=Untitled, getClass()=class com.yn.Video,
	 * hashCode()=1401420256, toString()=com.yn.Video@5387f9e0]
	 */
}
