/**
 * Directory Class allows the user
 * to search, add or delete any student
 * object.
 * ID: msriha.
 * @author Mohamed Sriha
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
/**
 * Directory Class.
 */
public class Directory {
    /**
     * Map instance data.
     */
    private Map<String, Student> idMap = new HashMap<String, Student>();
    /**
     * Map instance data.
     */
    private Map<String, List<Student>> firsNameMap = new HashMap<String, List<Student>>();
    /**
     * Map instance data.
     */
    private Map<String, List<Student>> lastNameMap = new HashMap<String, List<Student>>();
    /**
     * List instance data.
     */
    private List<Student> lastNameList = new ArrayList<Student>();
    /**
     * List instance data.
     */
    private List<Student> firstNameList = new ArrayList<Student>();
    /**
     * Empty Directory constructor that accepts none argument.
     */
    public Directory() { }
    /**
     * @param s
     * addStudent - given the student object, add the new student into the three maps.
     */
    public void addStudent(Student s) {
        if (s == null || idMap.containsKey(s.getId())) {
            throw new IllegalArgumentException();
        } else {
        System.out.println("add: " + s);
        idMap.put(s.getId(), s);
          if (firsNameMap.containsKey(s.getFirstName())) {
    	            firsNameMap.get(s.getFirstName()).add(s);
    	        } else {
    	        	    firstNameList = new ArrayList<Student>();
    	        	    firstNameList.add(s);
    	        	    firsNameMap.put(s.getFirstName(), firstNameList);
    	        }
    	        if (lastNameMap.containsKey(s.getLastName())) {
    	            lastNameMap.get(s.getLastName()).add(s);
    	        } else {
    	        	    lastNameList = new ArrayList<Student>();
    	        	    lastNameList.add(s);
    	        	    lastNameMap.put(s.getLastName(), lastNameList);
    	        }
        }
    }
    /**
     *@param id
     *deleteStudent - given the id string value, this method remove the
     *corresponding student object from the three maps if present. If no
     *id matches, throw IllegalArgumentException.
     */
    public void deleteStudent(String id) {
    	    if (!(idMap.containsKey(id))) {
            throw new IllegalArgumentException();
    	    } else {
    	    	    //id remove.
    	    	    idMap.remove(id);
            System.out.println("delete: " + id);
    	    	   //First Name remove.
    	    	    for (Entry<String, List<Student>> entry :firsNameMap.entrySet()) {
                for (int i = 0; i < entry.getValue().size(); i++) {
    	 			    if (entry.getValue().get(i).getid().equals(id)) {
                        firsNameMap.get(entry.getKey()).remove(i);
                    }
    	             }
             }
    	    	    //last name remove.
    	        for (Entry<String, List<Student>> entry :lastNameMap.entrySet()) {
    	 	        for (int i = 0; i < entry.getValue().size(); i++) {
    	                 if (entry.getValue().get(i).getid().equals(id)) {
    	            	         lastNameMap.get(entry.getKey()).remove(i);
                     }
    	             }
            }
    	    	}
    }
    /**
     * @param id
     * searchById - given the id string value, this method should return
     * the student in the directory. If no student in the directory has the given ID
     * return null.
     * @return student Object
     */
     public Student searchById(String id) {
    	 if (id == null) {
    	    	 throw new IllegalArgumentException();
    	     }
    	     if (idMap.isEmpty() || !(andrewIdMap.containsKey(andrewId))) {
    		     return null;
    	        } else {
    	            System.out.println("search by ID: " + id);
                return idMap.get(id);
            }
    }
    /**
     * @param firstName
     * searchByFirstName - given the first name string value, this method should return a list
     * containing all students that match the given first name. If no students in the directory have the
     * given first name, return a zero length list of students.
     * @return list
     */
    public List<Student> searchByFirstName(String firstName) {
    	 if (firstName == null) {
	    	 throw new IllegalArgumentException();
	     }
    	if (firsNameMap.isEmpty() || !((firsNameMap.containsKey(firstName)))) {
            return Collections.<Student>emptyList();
        } else {
            System.out.println("search by first name: " + firstName);
    	        return firsNameMap.get(firstName);
        }
    }
  /**
   * @param lastName
   * searchByLastName - given the last name string value, this method should return a list containing
   * all students that match the given last name. If no students in the directory have the given last
   * name, return a zero length list of students.
   * @return list
   */
    public List<Student> searchByLastName(String lastName) {
   	 if (lastName == null) {
    	 throw new IllegalArgumentException();
     }
    	if (lastNameMap.isEmpty() || !(lastNameMap.containsKey(lastName))) {
    	        return Collections.<Student>emptyList();
            } else {
        	        System.out.println("search by last name: " + lastName);
        	        return lastNameMap.get(lastName);
        }
    }
    /**
     * size - returns the number of students in the directory.
     * @return size
     */
    public int size() {
        return andrewIdMap.size();
    }
}
