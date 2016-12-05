package action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import service.BookService;

public class FileDownAction {
	InputStream fileInputStream;
	String fileName;
	String id;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String execute(){
		fileName = BookService.validateBook(id);
		File file = new File("/usr/local/tomcat/books/"+fileName);
//		File file = new File("/Users/Arnold/Desktop/lalala");
		System.out.println(fileName);
		try {
			fileName=new String( fileName.getBytes("gb2312"), "ISO8859-1" );
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		try {
			fileInputStream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return "success";
	}

	public InputStream getFileInputStream() {
		return fileInputStream;
	}

	public void setFileInputStream(InputStream fileInputStream) {
		this.fileInputStream = fileInputStream;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
}
