package servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AddInfoServlet {

	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;

	/**
	 * 添加学院信息
	 * 
	 * @param collegeName
	 * @param collegeSummarize
	 *            简介
	 * @return
	 */
	public String addCollegeInfo(String collegeName, String collegeSummarize) {

		String sql = "insert into college_info values (null,'" + collegeName + "','0','" + collegeSummarize + "')";
		String result = "1";
		try {
			con = DBConn.getConn();
			ps = con.prepareStatement(sql);
			result = "" + ps.executeUpdate(sql);
			// System.out.println(result + "插入成功");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConn.dbClose(con, ps, rs);
		}
		return result;
	}

	public String addSpecialtyInfo(String Name, String belongToCollege, String Summarize) {
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

			if (collegeID != 0) {

				System.out.println("collegeID:" + collegeID);
				// insert into specialty_info
				// VALUES(NULL,'aaa',0,'aaa','bb',22);
				String sql = "insert into specialty_info VALUES (NULL,'" + Name + "',0,'" + belongToCollege + "','"
						+ Summarize + "'," + collegeID + ")";
				System.out.println(Name + belongToCollege + Summarize + collegeID);
				ps = con.prepareStatement(sql);
				result = "" + ps.executeUpdate(sql);
				System.out.println(result + "插入成功");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConn.dbClose(con, ps, rs);
		}
		return result;
	}

}
