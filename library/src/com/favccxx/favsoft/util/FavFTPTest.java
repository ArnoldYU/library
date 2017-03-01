package com.favccxx.favsoft.util;
 
import junit.framework.TestCase;
 
public class FavFTPTest extends TestCase {
  
 public void testFavFTPUtil(){
 String hostname = "112.74.185.251";
 int port = 21;
 String username = "ftpuser";
 String password = "arnold-huang-123";
 String pathname = "/usr/local/tomcat/"; 
 String filename = "test1.txt"; 
 String originfilename = "/Users/Arnold/Documents/1.txt";
 String localpath = "/Users/Arnold/Desktop/";
 FavFTPUtil.uploadFileFromProduction(hostname, port, username, password, pathname, filename, originfilename);
// FavFTPUtil.deleteFile(hostname, port, username, password, pathname, filename);
  
 //FavFTPUtil.downloadFile(hostname, port, username, password, pathname, filename, localpath);
 }
 
}
