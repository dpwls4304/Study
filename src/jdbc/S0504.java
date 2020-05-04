package jdbc;

public class S0504 {

	public static void main(String[] args) {
		
		Class.forName("oracle.jdbc.OracleDriver");
		
		String url = "jdbc:oracle:thin://@localhost:1521:orcl";
	}

}
