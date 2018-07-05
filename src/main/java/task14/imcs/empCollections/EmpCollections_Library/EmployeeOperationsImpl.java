package task14.imcs.empCollections.EmpCollections_Library;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class EmployeeOperationsImpl implements EmployeeOperations {

	int i = 0;
	int curIndex = 0;
	List<Employee> emp = new ArrayList<Employee>();
	Employee[] employee;

	public void readFromFile() {
		
		try {
			CSVFileReader csvFileReader = new CSVFileReader();
			employee = csvFileReader.readEmployees(new File("c:\\temp\\test.csv"));
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			for(i=0; i < employee.length; i++){
				if(employee[i] != null){
					emp.add(employee[i]);
					curIndex++;
				}
			}
		}
	}

	public boolean addEmployee(Employee employee) {
		boolean status = emp.add(employee);
		curIndex++;
		return status;
	}

	public String viewEmployee(int id) {
		String view = null;
		for (Employee e : emp) {
			if (e.getId() == id) {
				view = e.toString();
				break;
			}
		}
		return view;
	}

	public String viewAllEmployees() {
		String viewAll = null;
		if (!emp.isEmpty()) {
			viewAll = "Employee info: \n";
			for (Employee e : emp) {
				if(e != null){
				viewAll = viewAll + e.toString() + " ";
				} else{
					break;
				}
			}
		}
		return viewAll;
	}

	public boolean updateEmployee(int id, Employee updateEmp) {
		boolean status = false;

		for(Employee e: emp){
			if(e.getId() == id){
				int index = emp.indexOf(e);
				emp.set(index, updateEmp);
				status = true;
				break;
			}
		}
		return status;
	}

	public boolean deleteEmployee(int id) {
		boolean status = false;
		for (Employee e : emp) {
			if (e.getId() == id) {
				emp.remove(e);
				status = true;
				break;
			}
		}
		return status;
	}

	public boolean isExists(int id) throws EmployeeNotFoundException {
		
		boolean status = false;
		for(Employee e: emp){
			if(e.getId() == id){
				status = true;
				break;	
			}
		}
		if(status == false){
			throw new EmployeeNotFoundException("Employee not found with the given id");
		}
		return status;
	}

	public double getHRA(int hraId) {
		double hra = 0;
		for (Employee e : emp) {
			if (e.getId() == hraId) {
				hra = EmployeeUtil.calHRA(e);
				break;
			}
		}
		return hra;
	}

	public double getGross(int grossID) {
		double gross = 0;
		for (Employee e : emp) {
			if (e.getId() == grossID) {
				gross = EmployeeUtil.calGross(e);
			}
		}
		return gross;
	}

	public boolean writeToFile() {
		boolean status = false;
		Writer fw = null;
		BufferedWriter bw = null;

		try {
			File file = new File("c:\\temp\\test.csv");
			if (!file.exists()) {
				file.createNewFile();
			}

			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

			String line = null;

			for (Employee e : emp) {
				line = parseLine(e);
				if (line != null) {
					bw.write(line);
					bw.newLine();
					status = true;
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return status;
	}
	
	private static String parseLine(Employee emp) {
		String token = emp.getId() + "," + emp.getName() + "," + emp.getSalary() + "," + emp.getAge() + ","
				+ emp.getGender();
		return token;
	}

}
