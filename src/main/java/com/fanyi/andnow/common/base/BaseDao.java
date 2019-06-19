package com.fanyi.andnow.common.base;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
/**
 * 公共数据层
 *
 * @author wangyds
 * @date 2019/6/19
 */
public class BaseDao {

	private static String DRIVER = null;
	private static String URL = null;
	private static String USER = null;
	private static String PWD = null;
	//初始化连接信息
	static{init();}
	public static void init(){
		Properties params = new Properties();
		InputStream is = BaseDao.class.getClassLoader().getResourceAsStream("application.properties");
		try {
			params.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		DRIVER = params.getProperty("spring.datasource.driverClassName");
		URL = params.getProperty("spring.datasource.url");
		USER = params.getProperty("spring.datasource.username");
		PWD = params.getProperty("spring.datasource.password");
	}
	//获得连接
	public Connection getConn(){
		Connection conn = null;
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL,USER,PWD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
	
	//回收资源
	public void closeAll(Connection conn,Statement stmt,ResultSet rset){
		try {
			if(rset != null) rset.close();
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ResultSet execute(String sql){
		Connection conn = this.getConn();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		boolean flag = false;
		try {
			pstmt = conn.prepareStatement(sql);
			return pstmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			this.closeAll(conn, pstmt, rset);
		}
		return rset;
	}


	/**
	 * 通用增删改方法
	 * @param sql 增删改执行语句
	 * @param params  参数数组
	 * @return 返回受影响的行数
	 */
	public int exeUpdate(String sql,Object[] params){
		Connection conn = this.getConn();
		PreparedStatement pstmt = null;
		int result ;
		try {
			pstmt = conn.prepareStatement(sql);
			for (int i = 0; i < params.length; i++) {
				pstmt.setObject(i+1, params[i]);
			}
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//异常标志
			result = -1;
		}finally{
			this.closeAll(conn, pstmt, null);
		}
		return result;
	}
	
}
