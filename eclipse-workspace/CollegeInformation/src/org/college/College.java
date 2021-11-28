//project:college information
package org.college;

public class College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College Coll=new College();
		Coll.collegeName();
		Coll.collegeCode();
		Coll.collegeRank();
		
		Student Stu=new Student();
		Stu.studentName();
		
		Hostel Hos=new Hostel();
		Hos.hostelName();
		
		Dept Dep=new Dept();
		Dep.deptName();
		
		
		

	}
	private void collegeName() {
		System.out.println("st.peters");
	}
	private void collegeCode() {
		System.out.println("26597");
	}
	private void collegeRank() {
		System.out.println("2nd rank");
	}

}
     class Student {
    	public static void main(String[] args) {
    	Student Stu=new Student();
    	Stu.studentName();
    	Stu.studentDepth();
    	Stu.studentId();
    }
    public void studentName() {
    	System.out.println("velu");
    }
    public void studentDepth() {
    	System.out.println("excellent");
    }
    	public void studentId() {
    	System.out.println("ju245");
    }
    }
     class Hostel {
    	public static void main(String[] args) {
    		Hostel Hos=new Hostel();
    		Hos.hostelName();
    	}
    	public void hostelName() {
    		System.out.println("raja mens hostel");
    	}
     }
     class Dept {
    public static void main(String[] args) {
    	Dept Dep=new Dept();
    	Dep.deptName();
    	
    }
    public void deptName() {
    	System.out.println("information technology");
    }
     }
    
     
    	
    	
	
