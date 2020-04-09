package 车辆违章管理系统;

import java.sql.*;

public class ConnectDB {
		
	String url="jdbc:sqlserver://��ķ�������ַ;useunicode=true;characterEncoding=UTF-8;DatabaseName=车辆违章管理";
	String user="����û���";
	String password="�������";
	
	//加载驱动
	static {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//建立连接
	public Connection getConnection() {
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(url,user,password);
			System.out.println("连接成功");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	
	//关闭连接
	public void closeConection(PreparedStatement ps,ResultSet rs,Connection conn) {
		try {
			if(rs!=null) {
				rs.close();
			}
			if(ps!=null) {
				ps.close();
			}
			if(conn!=null) {
				conn.close();
			}
			System.out.println("连接断开");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
		
}


