package task14.imcs.empCollections.EmpCollections_Library;


public interface EmployeeOperations {
	
	public void readFromFile();

	public boolean addEmployee(Employee employee);

	public String viewEmployee(int id);

	public String viewAllEmployees();

	public boolean updateEmployee(int id, Employee updateEmp);

	public boolean deleteEmployee(int id);

	public boolean isExists(int id) throws EmployeeNotFoundException;

	public double getHRA(int hraId);

	public double getGross(int grossID);

	public boolean writeToFile();

}
