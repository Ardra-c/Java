package oops.com.kod.encapsulation;

public class Book {
		private  int page_no;
		
		public void setPageNo(int page_no) {
			if(page_no>0) {
				this.page_no=page_no;
			}else {
				System.out.println("Invalid pageNo");
			}
		}
		public int getPageNo() {
			return page_no;
		}
}
