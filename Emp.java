import java.io.Serializable;
import java.util.Date;


public class Emp implements Serializable{
	private Integer empNo;
	private String empName;
	private Date hiredate;
	private Double sal;
	private Double comm;
	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", empName=" + empName + ", hiredate="
				+ hiredate + ", sal=" + sal + ", comm=" + comm + "]";
	}
	
}
