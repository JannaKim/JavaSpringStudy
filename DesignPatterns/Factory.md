# Factory Pattern
### 1.정의
- 인터페이스로 객체들을 정의
- 팩토리가 인스턴스를 생성
    - 생성자가 팩토리에 있다
- 객체의 자료형은 하위 클래스에서 결정
- SOLID의 Dependency Inversion Priciple(의존관계역전 원칙)이 성립

장점<br>
- 객체 생성코드를 분리하여 클라이언트 코드와 결합도(의존성)을 낮춤
- 확장성 높음
- 자료형이 하위 클래스에서 결정되기에 상위클래스는 자료형을 몰라도 된다.

단점<br>
- 새로 생성할 객체의 종류가 늘어날 때마다 클래스가 많아짐

### 2.구조
![factory_Structure](./img/factory_structure.jpg)
- Shape는 인터페이스로
- 필요객체는 implements되어 구현
- 생성은 ShapeFactory(팩토리)내의 getShape(생성자)를 통해 생성
- 아래는 main에서의 사용방법
~~~java
public class FactoryPatternDemo {
  public static void main(String[] args) {
    // Shape 인스턴스를 생성해주는 팩토리를 만듭니다.
    ShapeFactory shapeFactory = new ShapeFactory();

    // 팩토리로부터 생성할 객체를 팩토리 메쏘드로 받습니다. 
    Shape shape1 = shapeFactory.getShape("CIRCLE");
    shape1.draw();

    Shape shape2 = shapeFactory.getShape("RECTANGLE");
    shape2.draw();
  }
}
~~~

### 3.예시
> 피자
- 피자는 인터페이스로
- 피자종류는 피자를 implements해 구현
- 생성은 피자가게에서 생성

#### 4.Dependency Inversion Principle (의존성 뒤집기 원칙)
- 추상화된 것에 의존하도록 만들어라.
- 구상 클래스에 의존하도록 만들지 않도록 한다.

