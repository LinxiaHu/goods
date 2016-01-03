package com.hd.pager;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class Connect_test {
	public static void main(String[] args) {
		ConnectionDB db = new ConnectionDB();
		Connection connection = db.getConnection();
		System.out.println(connection);

		JdbcUtil jdbcUtil = new JdbcUtil();
		jdbcUtil.getConnection();
		try {
			List<Map<String, Object>> result = jdbcUtil.findResult(
					"select * from t_student", null);
			for (Map<String, Object> m : result) {
				System.out.println(m);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			jdbcUtil.releaseConn();
		}
	}
}
