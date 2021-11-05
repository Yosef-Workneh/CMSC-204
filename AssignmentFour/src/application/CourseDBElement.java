package application;


public class CourseDBElement implements Comparable {
   
	String CourseId,RoomNum,InstName;
    int crn, NumOfCredits;
  
    public CourseDBElement() {
            
    	    CourseId = "";
            crn = 0;
            NumOfCredits = 0;
            RoomNum = "";
            InstName = "";
    }
    
    public CourseDBElement(String CourseId, int crn, int NumOfCredits, String RoomNum, String InstName) {
           
    	    this.CourseId = CourseId;
            this.crn = crn;
            this.NumOfCredits = NumOfCredits;
            this.RoomNum = RoomNum;
            this.InstName = InstName;
    }

    public int compareTo(CourseDBElement e) {
            
    	return (this.crn - e.crn);
    }

    public int getCRN() {
            
    	return crn;
    }
  
    public void setCRN(int crn) {
            
    	this.crn = crn;
    }
 
    public int hashCode() {
            String s = crn + "";
            return s.hashCode();
    }

    public String toString() {
            String s = "\nCourse:" + CourseId + " CRN:" + crn + " Credits:" + NumOfCredits + " Instructor:" + InstName + " Room:" + RoomNum;
            return s;
    }
    
}