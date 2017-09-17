import java.util.Date;
import java.util.Scanner;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	
	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		return students;

		// Add your implementation here
		
	}

	@Override
	public void setStudents(Student[] students) {
		
		Scanner sc=new Scanner(System.in);
		try{
		
			if(students==null)
			{
				throw new IllegalArgumentException();				
			}
			else
			{
	
	
		for(int i=0;i<students.length;i++)
		{
			System.out.println("Enter the id");
			students[i].id=sc.nextInt();
			System.out.println("Enter the full name");
			students[i].fullname=sc.next();
			System.out.println("Enter the birthdate");
			students[i].birthdate=sc.next();
			System.out.println("Enter the average mark");
			students[i].avgMarks=sc.nextDouble();
			
		}
			}
			
						}				
			catch(Exception e){System.out.println(e);}
				
			}
		
		// Add your implementation here
	

	@Override
	public Student getStudent(int index)
	{
		try
		{
		if(index<0 && index>=students.length)
		{
			 throw new IllegalArgumentException();
		}
		}
		
		// dd your implementation here
		return null;
	}

	@Override
	public void setStudent(Student student, int index)
	{
		for(int i=0;i<students.length;i++)
		{
			if(i==index)
			{
				students[i]=student;
			}
		}
		
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student)
	{
		try
		{
		if(students==null)
		{
			throw new IllegalArgumentException();				
		}
		else
		{
		    Student temp=students[students.length-1];
			for(int i=0;i<students.length-1;i++)
			{
				students[i+1]=students[i];
			}
			students.add(temp);
			students[0]=student;
			
		}
		}
		catch(Exception e){System.out.println(e);}
			
			
			
		
		// Add your implementation here
	}

	@Override
	public void addLast(Student student)
	{
	     students.add(student);
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index)
	{
		int n=students.length;
		n=n+1;
		
		int pos=index;
		for(int j=n;j>pos;j--)
		{
			students[j]=students[j-1];
		}
		students[pos]=student;
		
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}