package com.favccxx.favsoft.util;
 
import junit.framework.TestCase;
 
public class FavFTPTest extends TestCase {
  
 public void testFavFTPUtil(){
 String hostname = "云服务器ip地址";
 int port = 21;
 String username = "ftpuser";
 String password = "密码";
 String pathname = "/usr/local/tomcat/books"; 
 String filename = "OpenGL游戏编程.pdf"; 
 String originfilename = "上传文件路径";
 String localpath = "下载地址";
 //FavFTPUtil.uploadFileFromProduction(hostname, port, username, password, pathname, filename, originfilename);
// FavFTPUtil.deleteFile(hostname, port, username, password, pathname, filename);
  
 FavFTPUtil.downloadFile(hostname, port, username, password, pathname, filename, localpath);
 }
 
}
