package bookstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AddBookDao {
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

	public static int save(AddBook book) {
		int status = 0;
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement(
					"insert into AddBook(bookcode,bookname,authorfname,authorlname,publishername,bookcatogery,booktype) values(?,?,?,?,?,?,?)");
			ps.setString(1, book.getBookcode());
			ps.setString(2, book.getBookname());
			ps.setString(3, book.getAuthorfname());
			ps.setString(4, book.getAuthorlname());
			ps.setString(5, book.getPublishername());
			ps.setString(6, book.getBookcatogery());
			ps.setString(7, book.getBooktype());
			status = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

	public static int update(AddBook book) {
		int status = 0;
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement(
					"update register set bookcode=?,bookname=?,authorfname=?,authorlname=?,publishername=?,bookcatogery=?,booktype=?, where id=?");
			ps.setString(1, book.getBookcode());
			ps.setString(2, book.getBookname());
			ps.setString(3, book.getAuthorfname());
			ps.setString(4, book.getAuthorlname());
			ps.setString(5, book.getPublishername());
			ps.setString(6, book.getBookcatogery());
			ps.setString(7, book.getBooktype());
			ps.setInt(8, book.getBookid());
			status = ps.executeUpdate();
		} catch (Exception e) {
		}
		return status;
	}

	public static int delete(AddBook book) {
		int status = 0;
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("delete from register where id=?");
			ps.setInt(1, book.getBookid());
			status = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}

		return status;
	}

	public static List<AddBook> getAllRecords() {
		List<AddBook> list = new ArrayList<AddBook>();

		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("select * from register");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				AddBook book = new AddBook();
				book.setBookid(rs.getInt("id"));
				book.setBookcode(rs.getString("bookcode"));
				book.setBookname(rs.getString("bookname"));
				book.setAuthorfname(rs.getString("authorfname"));
				book.setAuthorlname(rs.getNString("authorfname"));
				book.setPublishername(rs.getString("publishername"));
				book.setBookcatogery(rs.getString("bookcatogery"));
				book.setBooktype(rs.getString("booktype"));
				list.add(book);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

	public static AddBook getRecordById(int id) {
		AddBook book = null;
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("select * from register where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				book.setBookid(rs.getInt("id"));
				book.setBookcode(rs.getString("bookcode"));
				book.setBookname(rs.getString("bookname"));
				book.setAuthorfname(rs.getString("authorfname"));
				book.setAuthorlname(rs.getNString("authorfname"));
				book.setPublishername(rs.getString("publishername"));
				book.setBookcatogery(rs.getString("bookcatogery"));
				book.setBooktype(rs.getString("booktype"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return book;
	}
}
