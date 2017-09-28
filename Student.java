/**
 * This is the Student Class.
 * Andrew ID: msriha.
 * @author Mohamed Sriha
 */
public class Student {
    /**
     * instance primitive data.
     */
    private String firstName;
    /**
     * instance primitive data.
     */
    private String lastName;
    /**
     * instance primitive data.
     */
    private String andrewId;
    /**
     * instance primitive data.
     */
    private String phoneNumber;
    /**
     * @param andrewId
     * Student Class constructor.
     */
    public Student(String andrewId) {
    if (andrewId == null) {
        throw new IllegalArgumentException();
    	     } else {
    	    this.andrewId = andrewId;
        }
    }
    /**
     * first_name Getter.
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }
   /**
    * @param firstName
    * First_name Setter.
    */
    public void setFirstName(String firstName) {
    	if (firstName == null) {
        throw new IllegalArgumentException();
    	} else {
    		System.out.println("add: " + firstName);
        this.firstName = firstName;
    	    }
    }
    /**
     * Last_name Getter.
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * @param lastName
     * Last_name Setter.
     */
    public void setLastName(String lastName) {
    	if (lastName == null) {
    		throw new IllegalArgumentException();
    	} else {
    		System.out.println("add: " + lastName);
        this.lastName = lastName;
    	    }
    	}
    /**
     * Andre_id Getter.
     * @return andrewId
     */
    public String getAndrewId() {
    	    return andrewId;
    	}
    /**
     * Phone_number Getter.
     * @return phoneNumber
     */
    public String getPhoneNumber() {
    	    return phoneNumber;
    	}
    /**
     * @param phoneNumber
     * Phone_number Setter.
     */
    public void setPhoneNumber(String phoneNumber) {
    	if (phoneNumber == null) {
    		throw new IllegalArgumentException();
    	} else {
    		System.out.println("add: " + phoneNumber);
    	    this.phoneNumber = phoneNumber;
    	    }
    }
    /**
     * Student toString().
     * @return string of the Student Object
     */
	@Override
	public String toString() {
		return firstName + " " + lastName + " (Andrew ID: " + andrewId
                    + ", Phone Number: " + phoneNumber + ")";
	}
}
