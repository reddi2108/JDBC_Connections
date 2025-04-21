package booktickets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Allpages {
	private static final String driver = "com.mysql.cj.jdbc.Driver";
	private static final String username = "root";
	private static final String password = "21Aug@2003";
	private static Connection conn;
	private static PreparedStatement pmst;

	public static void main(String[] args) {
		System.out.println(" WELCOME TO BOOKMYSHOW ");
		try {
			Scanner src = new Scanner(System.in);
			Class.forName(driver);
			String url = "jdbc:mysql://localhost:3306/bookmyshowdb";
			Connection conn = DriverManager.getConnection(url, username, password);
			String sql = "select * from user_credentials where user_id = ? && user_password= ?";
			pmst = conn.prepareStatement(sql);
			System.out.println("Enter your user id: ");
			pmst.setString(1, src.next());
			System.out.println("Enter your password: ");
			pmst.setString(2, src.next());

			ResultSet rs = pmst.executeQuery();
			if (rs.next()) {

				System.out.println("Login Successfull.");
				System.out.println("Enter Near by location to know the theaters nearby from below: ");
				System.out
						.println("\t1.Rajahmundry\n\t2.Vizag\n\t3.Bobbili\n\t4.Banglore\n\t5.Hyderabad\n\t6.Chennai\n");
				int Location = src.nextInt();
				switch (Location) {
				case 1:
					rjy_loc();
					break;
				case 2:
					viz_loc();
					break;
				case 3:
					bbl_loc();
					break;
				case 4:
					ban_loc();
					break;
				case 5:
					hyd_loc();
					break;
				case 6:
					che_loc();
					break;
				case 7:
					System.out.println("Thank You for visiting BookMyShow.");
					System.exit(0);

				default:
					System.out.println("");

				}
				
			} else {
				System.out.println("Credentials Not found .Create Account Now and try again.");
				String sql1 = "insert into user_credentials (user_id,user_password) values(?,?)";
				pmst = conn.prepareStatement(sql1);
				System.out.println("Enter user id to create your account: ");
				pmst.setString(1, src.next());
				System.out.println("Enter password  to your account: ");
				pmst.setString(2, src.next());
				int i = pmst.executeUpdate();
				if (i > 0) {
					System.out.println(
							"Account Successfully created.Now you can login using the credentials to book you ticket.");

				} else {
					System.out.println("Account is not created due to some reasons please try again later.");
				}

			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	private static void che_loc() {
		try {
			Scanner src = new Scanner(System.in);
			Class.forName(driver);
			String url = "jdbc:mysql://localhost:3306/bookmyshowdb";
			Connection conn = DriverManager.getConnection(url, username, password);
			String sql = "select * from locations where loc_pin= ? && location='Chennai'";
			pmst = conn.prepareStatement(sql);
			System.out.println("Enter location pincode: ");
			pmst.setString(1, src.next());
			ResultSet rs = pmst.executeQuery();
			if (rs.next()) {
				System.out.println("Here are the location pin and location and theatres available\n");
				System.out.println("Location pin you given: " + rs.getInt("loc_pin"));
				System.out.println("Location name: " + rs.getString("location"));
				System.out.println(rs.getString("theatre1"));
				System.out.println(rs.getString("theatre2"));
				System.out.println(rs.getString("theatre3"));
				System.out.println(rs.getString("theatre4"));
			} else {
				System.out.println("The entered location pin does not match with the location Chennai.");
			}
			rs.close();
			pmst.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	private static void hyd_loc() {
		try {
			Scanner src = new Scanner(System.in);
			Class.forName(driver);
			String url = "jdbc:mysql://localhost:3306/bookmyshowdb";
			Connection conn = DriverManager.getConnection(url, username, password);
			String sql = "select * from locations where loc_pin= ? && location='Hyderabad'";
			pmst = conn.prepareStatement(sql);
			System.out.println("Enter location pincode: ");
			pmst.setString(1, src.next());
			ResultSet rs = pmst.executeQuery();
			if (rs.next()) {
				System.out.println("Here are the location pin and location and theatres available\n");
				System.out.println("Location pin you given: " + rs.getInt("loc_pin"));
				System.out.println("Location name: " + rs.getString("location"));
				System.out.println(rs.getString("theatre1"));
				System.out.println(rs.getString("theatre2"));
				System.out.println(rs.getString("theatre3"));
				System.out.println(rs.getString("theatre4"));
			} else {
				System.out.println("The entered location pin does not match with the location Hyderabad.");
			}
			rs.close();
			pmst.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void ban_loc() {
		try {
			Scanner src = new Scanner(System.in);
			Class.forName(driver);
			String url = "jdbc:mysql://localhost:3306/bookmyshowdb";
			Connection conn = DriverManager.getConnection(url, username, password);
			String sql = "select * from locations where loc_pin= ? && location='Banglore'";
			pmst = conn.prepareStatement(sql);
			System.out.println("Enter location pincode: ");
			pmst.setString(1, src.next());
			ResultSet rs = pmst.executeQuery();
			if (rs.next()) {
				System.out.println("Here are the location pin and location and theatres available\n");
				System.out.println("Location pin you given: " + rs.getInt("loc_pin"));
				System.out.println("Location name: " + rs.getString("location"));
				System.out.println(rs.getString("theatre1"));
				System.out.println(rs.getString("theatre2"));
				System.out.println(rs.getString("theatre3"));
				System.out.println(rs.getString("theatre4"));
			} else {
				System.out.println("The entered location pin does not match with the location Banglore.");
			}
			rs.close();
			pmst.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void bbl_loc() {
		try {
			Scanner src = new Scanner(System.in);
			Class.forName(driver);
			String url = "jdbc:mysql://localhost:3306/bookmyshowdb";
			Connection conn = DriverManager.getConnection(url, username, password);
			String sql = "select * from locations where loc_pin= ? && location=Bobbili";
			pmst = conn.prepareStatement(sql);
			System.out.println("Enter location pincode: ");
			pmst.setString(1, src.next());
			ResultSet rs = pmst.executeQuery();
			if (rs.next()) {
				System.out.println("Here are the location pin and location and theatres available\n");
				System.out.println("Location pin you given: " + rs.getInt("loc_pin"));
				System.out.println("Location name: " + rs.getString("location"));
				System.out.println(rs.getString("theatre1"));
				System.out.println(rs.getString("theatre2"));
				System.out.println(rs.getString("theatre3"));
				System.out.println(rs.getString("theatre4"));
			} else {
				System.out.println("The entered location pin does not match with the location Bobbili");
			}
			rs.close();
			pmst.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void viz_loc() {
		try {
			Scanner src = new Scanner(System.in);
			Class.forName(driver);
			String url = "jdbc:mysql://localhost:3306/bookmyshowdb";
			Connection conn = DriverManager.getConnection(url, username, password);
			String sql = "select * from locations where loc_pin= ? && location='Vizag'";
			pmst = conn.prepareStatement(sql);
			System.out.println("Enter location pincode: ");
			pmst.setString(1, src.next());
			ResultSet rs = pmst.executeQuery();
			if (rs.next()) {
				System.out.println("Here are the location pin and location and theatres available\n");
				System.out.println("Location pin you given: " + rs.getInt("loc_pin"));
				System.out.println("Location name: " + rs.getString("location"));
				System.out.println(rs.getString("theatre1"));
				System.out.println(rs.getString("theatre2"));
				System.out.println(rs.getString("theatre3"));
				System.out.println(rs.getString("theatre4"));
			} else {
				System.out.println("The entered location pin does not match with the location vizag.");
			}
			rs.close();
			pmst.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void rjy_loc() {
		try {
			Scanner src = new Scanner(System.in);
			Class.forName(driver);
			String url = "jdbc:mysql://localhost:3306/bookmyshowdb";
			Connection conn = DriverManager.getConnection(url, username, password);
			String sql = "select * from locations where loc_pin= ? && location='Rajahmundry' ";
			pmst = conn.prepareStatement(sql);
			System.out.println("Enter location pincode: ");
			pmst.setString(1, src.next());
			ResultSet rs = pmst.executeQuery();
			if (rs.next()) {
				System.out.println("Here are the location pin and location and theatres available\n");
				System.out.println("Location pin you given: " + rs.getInt("loc_pin"));
				System.out.println("Location name: " + rs.getString("location"));
				System.out.println(rs.getString("theatre1"));
				System.out.println(rs.getString("theatre2"));
				System.out.println(rs.getString("theatre3"));
				System.out.println(rs.getString("theatre4"));
			} else {
				System.out.println("The entered location pin does not match with the location Rajahmundry.");
			}
			rs.close();
			pmst.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
