# Decorator Pattern
### 정의
- 객체에 동적으로 새로운 기능을 동적으로 추가한다.
- 상속을 통해 서브클래스를 만드는 방법이 비효율적일때 사용한다. 특히 서브클래스 수가 많아질때
- 객체가 상황에 맞춰 기능이 추가되거나 삭제되어야 할때 사용한다.

### 방식
- Component : 기능이 추가될 객체
- Decorator : 추가될 기능
- Decorator는 Component를 상속받아 필요한 행동을 구현한다.
- Component는 Decorator로 계속 감싸져 만들어진다.
~~~java
Component comp1 = new Decorator1();
Component comp2 = new Decorator2(comp1);
~~~
- Component는 Decorator로 계속 감싸져도 사용할 수 있어야 한다.

### 예시
> 음료제작
- Beverage(음료)는 여러 재료가 들어가며 그에 따라 가격이 결정된다.
- Beverage를 추상클래스로 한다.
- 재료들(HouseBlend, DarkRoast, Espresso, Decaf)은 Beverage를 상속받아 구현한다.
