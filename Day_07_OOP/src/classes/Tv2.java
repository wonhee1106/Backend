package classes;

// 정보은닉 / 접근제한자 / getter/setter/constructor / static

// 정보은닉을 지키며 클래스를 작성할 것
// 접근제한자 : public / protected / package / private

public class Tv2 {

   // 멤머 필드 ( 속성 )
   private int price;
   private int channel;
   private int volume;
   // public(공공의) 키워드는 공개범위가 넓어서 어디서나 접근할 수 있다는 의미
   // private(사적인) 키워드를 붙이면 어디서나 접근할 수 없음
   // Tv 클래스 안의 중괄호{}에서는 사용 가능!

   // <Source - Generate Getters and Setters - 만들어진 메서드 다 클릭>
   // alt + shift + s + r
   // alt + a
   // alt + r

   public int getPrice() {
      return price;
   }

   public void setPrice(int price) {
      this.price = price;
   }

   public int getChannel() {
      return channel;
   }

   public void setChannel(int channel) {
      this.channel = channel;
   }

   public int getVolume() {
      return volume;
   }

   public void setVolume(int volume) {
      this.volume = volume;
   }

   // <Source - Generate Constructor using Fields - 만들어진 생성자 다 클릭>
   public Tv2(int price, int channel, int volume) {
      this.price = price;
      this.channel = channel;
      this.volume = volume;
   }

   // 멤머 메서드 ( 기능 )
//   public void setPrice(int price) {
//      // 인스턴스 바깥에 있는 값을 가져와서 매개변수로 받아서 자신의 내부에 가져와서 넣는것이 목적임.
//      // 프라이빗으로 막혀있기 때문에 퍼블릭으로 받을 매개변수(int price) 필요하지만, 리턴랎은 갖지 않음
//      // 리턴값을 void로 가지고
//      // price로 생긴 필드의 값을 받게 됨.
//      // 값을 받기 위해선 set+이름
//      // 내부의 코드 작성하기 위해서는 / 매개변수의 값을 받아서 멤버변수에 넣으면 됨
//
//      // 변수이름 중복되면 안된다고 했는데?
//      // => 클래스는 뒤에 있는 단어에 대한 설계도임. (public class "Tv")
//      // 이 설계도를 바탕으로 new 하게 된순간 인스턴스 만들어지면서 힙에 메모리가 만들어지는 것
//      // 매개변수인 public void setPrice(int price) {} 얘는 스텍메모리에 만들어진거고
//      // 멤버 필드의 int price는 힙메모리에 만들어진것임
//      // *** 멤버 필드는 Heap 메모리에 생성된다. (멤버 필드) ***
//      // *** 매개변수 및 지역변수는 Stack 메모리에 생성된다. (멤버 메서드) ***
//
////      price = price;   // 멤버필드 price에 매개변수 price 저장(대입)하려고 함.
//      // 노란 밑줄 : 아무런 의미 없는 변수라는 의미
//
//      this.price = price; // 노란밑줄 사라짐과 동시에 원하던 목적대로 동작함.
//                     // this는 자신의 멤버를 의미하는 단어 = Class의 멤버(필드)를 뜻함.***
//                     // Tv Class에서 this 는 내 것 중에 price
//                     // 매개변수 price는 멤버변수라고 볼 수 없음. 왜??
//                     // => 매개변수 price는 콜되어야(불러져야) 생성되는 값이기 때문에, 불려지기 전에는 메모리에 저장되어 있지도 않고, 존재가 없음.
//
//      // 인스턴스 만들었고 권고사항에 따라 정보은닉 사용. 외부에서 변수 사용할 수 없네?
//      // 사용하기 위해 메서드 만들었는데, 넣는 메서드, 빼는 메서드 사용하고, 넣는 메서드는 set으로 표기하고
//      // set메서드는 집어넣는 용도이기 때문에 매개변수는 사용하지만, 빼지는 않기에 리턴값 없는 것.

   // this는 멤버필드 구분짓는 용도.
   // this라는게 무엇이길래 멤버필드를 나눌 수 있는가?
   // this => 자기참조 변수. 멤버 필드에 자동적으로 만들어져 있음.
   // 티비 인스턴스를 만들면 price, channel, volume 그리고 this가 생성되어 있는 것.
   // 인스턴스의 주소를 따라갈 수 있는 법은 lg.으로 인한 거

   // class에서 new해서 인스턴스 만들고, 인스턴스 주소를 lg에 담아놨고, 이 주소로 인스턴스로 접근할 수 있음.
   // 클래스 외부에서는 생성된 인스턴스의 참조변수가 있어서 인스턴스에 접근 가능
   // 클래스 내부에서는 생성된 인스턴스에 접근할 수 있는 방법이 없기 때문에, 자기 스스로를 참조(this)하여 자기 인스턴스에 접근 함.
   // => 자신의 멤버필드와 멤버 메서드에 접근할 수 있음
   // *** this => Exam_03dml lg 변수와 같은 값을 가진다. ***
   // 바깥에 있는 lg는 내부의 인스턴스(볼륨,채널)가 private 되어있기에 볼 수 없지만, this는 다 볼 수 있음.

   // this 안에는 자료가 들어있기에 자료형이 됨. => 자기 인스턴스 주소와 같아지기에 Tv형이 됨. lg도 Tv형
//   public Tv getThis() {
//      return this;
//   }
////
//   }
//
//   public int getPrice() {
//      // 이 메서드가 외부로부터 받아오려는 것이 아니라 안에 있는 것을 밖으로 내보내는 역할만 하기 때문에
//      // 매개변수는 필요 없고, 리턴값만 필요함.
//      return price; // 위에서는 그냥 price라고 쓰면 매개변수의 price가 있기 때문에 헷갈리는데
//                  // 여기의 price는 지역변수도 없고 혼자이기 때문에 this 안써도 됨.

   //

//   }

   // 생성자 ( Constructor ) : 메서드의 한 종류로 몇가지 특이한 규칙을 가진다. ex) Tv(){}
   // 1. 생성자 메서드의 이름은 클래스 이름과 같아야 한다.
   // => 동일하지 않는다면 생성자가 아닌 그냥 일반 메서드가 됨.
   // 2. 메서드 호출 시점을 자유롭게 정할 수 없다. ( 불려지는 시점이 정해져 있음 )
   // 3. 생성자 메서드는 반환값을 가지지 않는다. ( return 값이 없음 ) => 왼쪽에 뭐 int, String 이런거 없음
   // 4. 기타 모든 규칙은 일반 메서드와 동일하다. ( 매개변수, 접근제한자 )

//   public Tv(int price, int channel, int volume) {
//      // Tv인스턴스가 new 되는 시점에 자동으로 실행됨.
//      // 인스턴스가 생성되어 불려지면 메서드가 실행됨.
//      // 인스턴스를 만들 때 초기값 넣는 용도로 실행. (=lg.setChannel(10) 세터값은 값을 변경할 때 사용함)
//
//      // => 스텍은 빈 변수에 쓰레기값이 들어가지만, 뭐?
//
////      System.out.println("Tv 클래스 생성자 입니다.");
//      this.price = price;
//      this.channel = channel;
//      this.volume = volume;
//
//   }

}
