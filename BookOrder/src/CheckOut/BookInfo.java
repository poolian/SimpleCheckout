package CheckOut;

public class BookInfo {
	
		int price;
		String title;
		
		public BookInfo(String title, int price) {
			this.price=price;
			this.title=title;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}
		
		
}
