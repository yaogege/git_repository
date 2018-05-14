package servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConn {

	private static Connection con;
	private static PreparedStatement ps;
	private static ResultSet rs;

	/**
	 * 获取连接方法
	 * 
	 * @return
	 */
	public static Connection getConn() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/stu_info_manage_system";
			String user = "root";
			String password = "123456";
			// System.out.println("连接成功!!!");
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("************驱动找不到**************");
		} catch (SQLException e) {
			System.out.println("***********获取数据库连接失败***********");
		}
		return con;
	}

	/**
	 * 关闭操作方法
	 */

	public static void dbClose(Connection con, Statement st, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
				rs = null;
			}
			if (st != null) {
				st.close();
				st = null;
			}
			if (con != null) {
				con.close();
				con = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}


	public static void main(String[] agrs) {
		String Name = "音乐学院";
		String getID = "select collegeID from college_info where collegeName='" + Name + "'";

		String result = "";
		int collegeID = 0;
		try {
			System.out.println("mingzi：" + Name);
			con = DBConn.getConn();
			ps = con.prepareStatement(getID);
			rs = ps.executeQuery();
			while (rs.next()) {
				collegeID = rs.getInt("collegeID");
				System.out.println("collegeID:" + collegeID);
			}
			System.out.println("collegeID!@!# :" + collegeID);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConn.dbClose(con, ps, rs);
		}

	}

}
