//This is the second example of interface 
package interfaces;

public interface Student
{
	public static final int id=123;
	void personalDetails(String name,String fatherName,String surname);
	void address(String loc);
	void college(String collName,int collId);
	public static void message()
	{
		System.out.println("This is STudent Information");
	}
}
//--------------------------------------------------------------------------
package interfaces;

public class StudentImp implements Student
{
	public StudentImp() {
		super();
	}
	public void personalDetails(String name,String fatherName,String surname)
	{
		System.out.println("Name : "+name);
		System.out.println("fatherName : "+fatherName);
		System.out.println("Surname : "+surname);
	}
	
	public void address(String loc)
	{
		System.out.println("Address : "+loc);
	}
	
	public void college(String collName,int collId)
	{
		System.out.println("College Name : "+collName);
		int cid = id*collId;
		System.out.println("College Id : "+cid);
	}
	
}

//--------------------------------------------------------------------------------
package interfaces;

public class StudentDriver 
{
	public static void main(String[] args) 
	{
		Student s1=new StudentImp();
		s1.personalDetails("Swapnil", "Rajendra", "Giramkar");
		s1.address("Pune");
		s1.college("APCOER", 12);
		
		Student.message();
	}
}

