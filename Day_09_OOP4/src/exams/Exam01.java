package exams;

import classes.Product;

public class Exam01 {
	public static void main(String[] args) {
		
		// Product 클래스 제작
		// 1. 정보은닉 / getters&setters / constructor / default constructor 모두 작성
		// 2. 멤버필드 : / 상품코드 / 상품명 / 가격 / 재고
		
		// Product 설계도 기반 인스턴스를 3개를 생성하고 ( 데이터는 자유 선택 )
		// 저장된 모든 데이터를 화면에 출력해보기.
		
		Product[] products = new Product[3];
		
		products[0] = new Product(1, "name", 10000, 5);
		products[1] = new Product(2, "candy", 15000, 10);
		products[2] = new Product(3, "banana", 20000, 15);
		
		
		System.out.println("상품코드\t상품명\t가격\t재고");
		for(int i =0;i < products.length;i++) {
			System.out.println(products[i].getCode()+"\t"+ products[i].getName()+"\t" + products[i].getPrice()+"\t" + products[i].getStock());
		}
				
		
	}
}
