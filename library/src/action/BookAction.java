package action;

import java.util.List;

import com.opensymphony.xwork2.Action;

import domin.books;
import service.BookService;

public class BookAction implements Action {

	public List<books> books;
	public books onebook;
	public String id;
	public String url;
	public String information;
	
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<books> getBooks() {
		return books;
	}
	public void setBooks(List<books> books) {
		this.books = books;
	}
	public books getOnebook() {
		return onebook;
	}
	public void setOnebook(books onebook) {
		this.onebook = onebook;
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return ERROR;
	}
	public String searchbook(){
		BookService mybook = new BookService();
		List<books> a =null;
		a=mybook.SerachBook(onebook);
		setBooks(a);
		if (a.isEmpty()){
			return ERROR;
		}
		else 
			return SUCCESS;
	}
	
	public String allbooks_JSJKX() {
		BookService mybook = new BookService();
		setBooks(mybook.JSJKX());
		return SUCCESS;
	}
	public String allbooks_AQL() {
		BookService mybook = new BookService();
		setBooks(mybook.AQL());
		return SUCCESS;
	}
	public String allbooks_CXSJ() {
		BookService mybook = new BookService();
		setBooks(mybook.CXSJ());
		return SUCCESS;
	}
	public String allbooks_WFL() {
		BookService mybook = new BookService();
		setBooks(mybook.WFL());
		return SUCCESS;
	}
	public String allbooks_DXWL() {
		BookService mybook = new BookService();
		setBooks(mybook.DXWL());
		return SUCCESS;
	}
	public String allbooks_DL() {
		BookService mybook = new BookService();
		setBooks(mybook.DL());
		return SUCCESS;
	}
	public String allbooks_GS() {
		BookService mybook = new BookService();
		setBooks(mybook.GS());
		return SUCCESS;
	}
	public String allbooks_XS() {
		BookService mybook = new BookService();
		setBooks(mybook.XS());
		return SUCCESS;
	}
	public String allbooks_JSDS() {
		BookService mybook = new BookService();
		setBooks(mybook.JSDS());
		return SUCCESS;
	}
	public String allbooks_SLLJ() {
		BookService mybook = new BookService();
		setBooks(mybook.SLLJ());
		return SUCCESS;
	}
	public String allbooks_LSSX() {
		BookService mybook = new BookService();
		setBooks(mybook.LSSX());
		return SUCCESS;
	}
	public String allbooks_MSSB() {
		BookService mybook = new BookService();
		setBooks(mybook.MSSB());
		return SUCCESS;
	}
	public String allbooks_ZZ() {
		BookService mybook = new BookService();
		setBooks(mybook.ZZ());
		return SUCCESS;
	}
	public String allbooks_WEB() {
		BookService mybook = new BookService();
		setBooks(mybook.WEB());
		return SUCCESS;
	}
	public String allbooks_DZYDLGJGKZ() {
		BookService mybook = new BookService();
		setBooks(mybook.DZYDLGJGKZ());
		return SUCCESS;
	}
	public String allbooks_BYHZG() {
		BookService mybook = new BookService();
		setBooks(mybook.BYHZG());
		return SUCCESS;
	}
	public String allbooks_KWWFL() {
		BookService mybook = new BookService();
		setBooks(mybook.KWWFL());
		return SUCCESS;
	}
	//ajax
	public String FK(){
		BookService mybook = new BookService();
		mybook.FKset(id,information);
		return SUCCESS;
	}
	public String download(){
		BookService mybook = new BookService();
		mybook.download(id,url);
		return SUCCESS;
	}
	public String getsize(){
		BookService mybook = new BookService();
		mybook.getsizeof();
		return SUCCESS;
	}
	
	
}
