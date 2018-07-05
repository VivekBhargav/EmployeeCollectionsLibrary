package task14.imcs.empCollections.EmpCollections_Library;

public class EmployeeNotFoundException extends Exception{
	
	private static final long serialVersionUID = 1L;
	public EmployeeNotFoundException(){
	}
	
	public EmployeeNotFoundException(String message){
		super(message);
	}

}
