# Singleton Pattern
### 1.정의
- 전체 프로그램에서 오직 하나만 생성되어야 하는 경우 사용 (ex. Logger, Cache, Tread Pool, User Setting, etc)
- static으로 선언할 경우 사용되지 않으면 자원만 낭비할 수 있기에 싱글톤 사용.
- 하나의 인스턴스만 만들어지며 어디서든 접근 할 수 있다.


장점<br>
- 하나의 인스턴스만 사용하기에 메모리 낭비를 방지
- 전역 인스턴스이기에 다른 클래스의 인스턴스들이 데이터를 공유

단점<br>
- 싱글톤 인스턴스는 너무 많은 일을 하거나 많은 데이터를 공유시키면 안된다.
    - SOLID에서 SRP,OCP원칙을 위배하게 된다.
    - 수정과 테스트가 어려워진다.
- 꼭 필요한 경우에만 사용

### 2.구조
![singleton_Structure](./img/singleton_structure.jpg)


~~~java
public class FactoryPatternDemo {
// SingletonPatternDemo.java

public class SingletonPatternDemo {
  public static void main(String[] args) {

    // 항상 getter 로 객체를 받아와야 함.
    SingleObject object = SignleObject.getInstace();
  }
}
~~~
~~~java
// SingleObject.java

public class SingleObject {
  private static SingleObject instance = new SingleObject();

  // 생성자는 내부에서만 호출되게 한다.
  private SingleObject(){}

  // 외부에서 객체를 받아갈 수 있는 방법은 getInstance() 가 유일하다.
  public static SingleObject getInstance() {
    return instance;
  }
}
~~~

### 3.예시


#### 4.SingleResponsibility Principle (단일 책임 원칙)
- 한 클래스는 하나의 책임만 가져야 한다.
#### 5.Open/Closed Principle (개방-폐쇄 원칙)
- 소프트웨어 요소는 확장에 열려있으나 변경에는 닫혀 있어야 한다.

