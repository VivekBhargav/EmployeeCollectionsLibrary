package task14.imcs.empCollections.EmpCollections_Library;

public class EmployeeServicesImpl implements EmployeeServices {
	EmployeeOperations empArrayDao = new EmployeeOperationsImpl();

	public void readFromFile() {
		empArrayDao.readFromFile();
	}

	public boolean addEmployee(Employee employee) {
		return empArrayDao.addEmployee(employee);
	}

	public boolean isExists(int id) throws EmployeeNotFoundException {
		return empArrayDao.isExists(id);
	}

	public String viewEmployee(int id) {
		return empArrayDao.viewEmployee(id);
	}

	public String viewAllEmployees() {
		return empArrayDao.viewAllEmployees();
	}

	public boolean updateEmployee(int id, Employee updateEmp) {
		return empArrayDao.updateEmployee(id, updateEmp);
	}

	public boolean deleteEmployee(int id) {
		return empArrayDao.deleteEmployee(id);
	}

	public double getHRASrvc(int hraId) {
		return empArrayDao.getHRA(hraId);
	}

	public double getGrossSrvc(int grossID) {
		return empArrayDao.getGross(grossID);
	}

	public boolean writeToFile() {
		return empArrayDao.writeToFile();

	}

}
