package CheckOut;

import java.util.ArrayList;
import java.util.Scanner;

public class BookOrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <BookInfo> bookList = new ArrayList<BookInfo>();
		ArrayList <BookInfo> mycart = new ArrayList<BookInfo>();
		
		BookInfo book = new BookInfo("JAVA", 24000);
		bookList.add(book);
		book = new BookInfo("JQuery", 21000);
		bookList.add(book);
		book = new BookInfo("오라클", 19000);
		bookList.add(book);
		book = new BookInfo("스프링", 35000);
		bookList.add(book);
		
		int discount = 0;
		int totalPrice = 0;
		boolean flag = true;
		boolean flag2 = false;
		while(flag) {
			
			System.out.println("[키트리문고]");
			for(int i=0 ; i<bookList.size() ; i++) {
				System.out.println((i+1)+". "+bookList.get(i).getTitle() + " 가격:"+bookList.get(i).getPrice());
			}
			System.out.print("선택:");
			
			Scanner sc = new Scanner(System.in);
			int menu = sc.nextInt();
			if(0<menu && menu<5) {
				menu=menu-1;
				mycart.add(bookList.get(menu));
				System.out.println(bookList.get(menu).getTitle() + " 가격:"+bookList.get(menu).getPrice()+"을(를) 추가하였습니다");
				System.out.println();
				System.out.println("[나의 장바구니]");
				System.out.println("총 구입도서:"+mycart.size());
			}else {
				System.out.println("[해당 도서가 없습니다]");
			}
		
			System.out.println("[책 구입을 계속하시겠습니까?]  yes:1 | no:2 ");
			menu=sc.nextInt();
			switch(menu) {
			case 1: flag=true; flag2=false; break;
			case 2: flag=false; flag2=true; break;
			default : System.out.println("[올바른 값을 입력해주세요]");
			}
		
		
			while(flag2) {
			System.out.println("[할인카드를 제시해주세요]  yes:1 | no:2");
			menu=sc.nextInt();
			switch(menu) {
			case 1: discount=15; flag2=false; break;
			case 2: discount=0; flag2=false; break;
			default : System.out.println("[올바른 값을 입력해주세요]");
			}
			
			for(int p=0 ; p <mycart.size() ; p++) {
				totalPrice += mycart.get(p).getPrice();
			}
			
			totalPrice = totalPrice - (totalPrice*discount/100);
			System.out.println("회원님의 결제금액은 : "+ totalPrice +"입니다.");
			
			}
			}
	}
}
