package task14.imcs.empCollections.EmpCollections_Library;

public class Employee {

	private int id;
	private String name;
	private float salary;
	private static String COMPANY_NAME;
	private int age;
	private char gender;
	private enum department {SALES, PURCHASE, ADMINISTRATION, RESEARCH}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Employee() {
		setId(0);
		setName("");
		setSalary(0);
		setAge(0);
		setGender('M');
	}

	public Employee(int id, String name, float salary, int age, char gender) {
		setId(id);
		setName(name);
		setSalary(salary);
		setAge(age);
		setGender(gender);
	}

	public float setHRA() {
		return (this.salary / 100) * 20;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + ", gender=" + gender
				+ "]\n";
	}

	public static float initSalary() {
		return 10000;
	}

	public static void setCompanyName() {
		setCOMPANY_NAME("XYZ Comp");
	}

	public String getCompanyName() {
		return getCOMPANY_NAME();
	}

	public static String getCOMPANY_NAME() {
		return COMPANY_NAME;
	}

	public static void setCOMPANY_NAME(String cOMPANY_NAME) {
		COMPANY_NAME = cOMPANY_NAME;
	}

}
