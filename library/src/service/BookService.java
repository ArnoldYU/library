package service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.favccxx.favsoft.util.*;
import domin.books;



public class BookService {
	private String hostname = "112.74.185.251";
	private int port = 21;
	private String username = "ftpuser";
	private String password = "arnold-huang-123";
	private String pathname = "/usr/local/tomcat/books";
	private String localdocument=null;
	/* 加载数据库*/
	private static Connection getConn() {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/bookdownload?characterEncoding=utf8";
	    String username = "root";
	   // String password = "";
	    String password = "501874997";
	    Connection conn = null;
	    try {
	        Class.forName(driver); //classLoader,加载对应驱动
	        conn = (Connection) DriverManager.getConnection(url, username, password);
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return conn;
	}
	private static Connection getConninformation() {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/bookdownload?characterEncoding=utf8";
	    String username = "root";
	   // String password = "";
	    String password = "501874997";
	    Connection conn = null;
	    try {
	        Class.forName(driver); //classLoader,加载对应驱动
	        conn = (Connection) DriverManager.getConnection(url, username, password);
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return conn;
	}
	public static String validateBook(String id) {
		String searchbook = null;
		int number=0;
	    Connection conn = getConn();
	    String sql = "SELECT * FROM  `books`";

	    String sql1 = "update books set number="+number+" where id="+id;
	    System.out.println(number);
	    PreparedStatement pstmt;
	    PreparedStatement pstmt1;
//	    System.out.println(sql1);
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        ResultSet rs = pstmt.executeQuery();
	        while(rs.next()){
	        	if(rs.getString(1).equals(id)){
	        		searchbook = rs.getString(2);
	        		number=rs.getInt(6);
	        		number++;

	        		break;
	        	}
	        }
	        pstmt.close();
	        sql1 = "update books set number="+number+" where id="+id;
	        System.out.println(sql1);
	        pstmt1 = (PreparedStatement)conn.prepareStatement(sql1);
	        pstmt1.executeUpdate();
	        pstmt1.close();
	        return searchbook;
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return searchbook;
	}
	public List<books> SerachBook(books book) {
		List<books> searchbooks;
		searchbooks = new ArrayList<books>();
	    Connection conn = getConn();
	    String name=book.getName();
	    String sql = "select * from books where name like '%"+name+"%'";
	    System.out.println(sql);
	    PreparedStatement pstmt;
	    try {
	    	searchbooks.clear();
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        ResultSet rs = pstmt.executeQuery();
	        while(rs.next()){
	        	searchbooks.add(new books(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getBoolean(4),rs.getString(5)));
	        }
	        pstmt.close();
	        return searchbooks;
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return searchbooks;
	}
	public List<books> JSJKX() {
		String type="JSJXK";
		return allbooks(type);
	}
	public List<books> AQL() {
		String type="AQL";
		return allbooks(type);
	}
	public List<books> CXSJ() {
		String type="CXSJ";
		return allbooks(type);
	}
	public List<books> WFL() {
		String type="WFL";
		return allbooks(type);
	}
	public List<books> DXWL() {
		String type="DXWL";
		return allbooks(type);
	}
	public List<books> DL() {
		String type="DL";
		return allbooks(type);
	}
	public List<books> GS() {
		String type="GS";
		return allbooks(type);
	}
	public List<books> XS() {
		String type="XS";
		return allbooks(type);
	}
	public List<books> SLLJ() {
		String type="SLLJ";
		return allbooks(type);
	}
	public List<books> MSSB() {
		String type="MSSB";
		return allbooks(type);
	}
	public List<books> JSDS() {
		String type="JSDS";
		return allbooks(type);
	}
	public List<books> WEB() {
		String type="WEB";
		return allbooks(type);
	}
	public List<books> ZZ() {
		String type="ZZ";
		return allbooks(type);
	}
	public List<books> LSSX() {
		String type="LSSX";
		return allbooks(type);
	}
	public List<domin.books> DZYDLGJGKZ() {
		String type="DZYDLGJGKZ";
		return allbooks(type);
	}
	public List<books> allbooks(String type) {
		// TODO Auto-generated method stub
		List<books> typebooks;
		typebooks = new ArrayList<books>();
		Connection conn = getConn();
	    String sql = "select * from books";
	    typebooks.clear();
	    PreparedStatement pstmt;
	    try {

	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        ResultSet rs = pstmt.executeQuery();
	        while(rs.next()){
	        	if (rs.getString(5).equals(type))
	        	typebooks.add(new books(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getBoolean(4),rs.getString(5)));
	        }
	        pstmt.close();
	        return typebooks;
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return null;
	}
	public void FKset(String id, String information) {
		int b = 0;
		// TODO Auto-generated method stub
		//反馈信息存为一个新的数据库，数据库只有id：反馈的编码；bookid：出现问题的book的id；information：反馈消息 数据表名称：bookdownloadinformation
		Connection conn = getConn();
//		COnnection conn1 = getConninformation();
	    String sql = "update books set valid = 0 where id='" + id + "'";
	    String sql1 = "insert into bookdownloadinformation (bookid,information) values (?,?)";
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        pstmt.executeUpdate();
	        System.out.print(id);
	        pstmt.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql1);
			try {
			    b = Integer.valueOf(id).intValue();
			} catch (NumberFormatException e) {
			    e.printStackTrace();
			}
			pstmt.setInt(1,b);
			pstmt.setString(2, information);
			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@SuppressWarnings("static-access")
	public void download(String id, String url) {
		// TODO Auto-generated method stub
		Connection conn = getConn();
		FavFTPUtil favFTP= new FavFTPUtil();
	    String sql = "select * from books";
	    PreparedStatement pstmt;
	    String myid;
	    String filename = null;
	    String localpath = url;
	    System.out.println(localpath);

//	    String originfilename = "/Users/Arnold/Documents/1.py";
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        ResultSet rs = pstmt.executeQuery();
	        while(rs.next()){
	        	myid = rs.getInt(1)+"";
	        	if (myid.equals(id)){
	        		filename=rs.getString(2);
	        		break;
	        	}
	        }
//	        filename = "OpenGL游戏编程.pdf";
	        localdocument = localpath+"/"+filename;
	        System.out.println(filename);
	        //favFTP.uploadFileFromProduction(hostname, port, username, password, pathname, "2.py", originfilename);
	        favFTP.downloadFile(hostname, port, username, password, pathname, filename, localpath);
	        pstmt.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	public void getsizeof() {
		// TODO Auto-generated method stub
		FileInputStream fis= null;
		localdocument="/Users/Arnold/Desktop/UNIX环境高级编程(第二版).pdf";
		System.out.println(localdocument);
		File f= new File(localdocument);
	    if (f.exists() && f.isFile()){
	    	System.out.println(f.length());
	    }else{
	    	System.out.println("file doesn't exist or is not a file");
	    }
	}
	public List<domin.books> BYHZG() {
		String type="BYHZG";
		return allbooks(type);
	}
	public List<domin.books> KWWFL() {
		String type="KWWFL";
		return allbooks(type);
	}


}
