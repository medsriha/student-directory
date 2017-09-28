# Student Directory


Directory class 

- This class uses three Maps as follows to maintain the collection of students. One Map
will have the student’s ID as the key and will map from student ID to Student object. The other
two maps will take either the first name or the last name as the key and will map the name to a List of
Student objects. (It’s a list because more than one student can have the same first name or the same
last name or even the same first and last name, but every student will have a different ID.)
As Student objects are added to and deleted from the directory, all three Maps must be updated
accordingly so that the Students in the directory can be found when searching by ID or first
name or last name.


The methods have the following actions

● addStudent - given the student object, add the new student into the three maps if the given
student’s ID is not present in the directory. If the student’s ID is present, throw
IllegalArgumentException.

● deleteStudent - given the ID string value, this method removes the
corresponding student object from the three maps if present. If no ID matches, throw
IllegalArgumentException.

● searchByFirstName - given the first name string value, this method returns a list
containing all students that match the given first name. If no students in the directory have the
given first name, return a zero length list of students.

● searchByLastName - given the last name string value, this method should return a list containing
all students that match the given last name. If no students in the directory have the given last
name, return a zero length list of students.

● searchById - given the andrew id string value, this method returns the student in
the directory. If no student in the directory has the given ID, return null.

● size - returns the number of students in the directory.
