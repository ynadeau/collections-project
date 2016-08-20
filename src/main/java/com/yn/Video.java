/**
 * File Name: Video.java<br>
 * Nadeau, Yves<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Aug 20, 2016
 */
package com.yn;

/**
 * Video //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nadeau, Yves
 * @version 1.0.0
 * @since 1.0
 */
public class Video implements IMultimedia {

	private String brand;

	private String title;

	private String topic;

	/**
	 * @param brand
	 * @param topic
	 * @param title
	 */
	public Video(String brand) {
		super();
		this.brand = brand;
		this.topic = "No topic";
		this.title = "Untitled";
	}

	/**
	 * @param brand
	 * @param topic
	 * @param title
	 */
	public Video(String brand, String topic, String title) {
		super();
		this.brand = brand;
		this.topic = topic;
		this.title = title;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return this.brand;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * @return the topic
	 */
	public String getTopic() {
		return this.topic;
	}

	/**
	 * @see com.yn.IMultimedia#play()
	 */
	@Override
	public void play() {
		System.out.println("Playing default video from " + getBrand() + ".");
	}

	/**
	 * @see com.yn.IMultimedia#run()
	 */
	@Override
	public void play(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Playing " + fileName + " video from " + getBrand() + ".");
	}

	/**
	 * @param brand
	 *            the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @param topic
	 *            the topic to set
	 */
	public void setTopic(String topic) {
		this.topic = topic;
	}

	/**
	 * @see com.yn.IMultimedia#skip()
	 */
	@Override
	public void skip() {
		// TODO Auto-generated method stub
		System.out.println("Skipping video");
	}

	/**
	 * @see com.yn.IMultimedia#stop()
	 */
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stopping Video");
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Video [brand=" + this.brand + ", topic=" + this.topic + ", title=" + this.title + ", getBrand()=" + getBrand() + ", getTopic()=" + getTopic() + ", getTitle()=" + getTitle() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
