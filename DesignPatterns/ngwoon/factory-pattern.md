# 팩토리 패턴이란?

팩토리 패턴의 핵심은 **클래스의 인스턴스를 만드는 것을 서브클래스에서 결정하도록 하는 것**이다.

다시 말해서, new 키워드를 이용한 인스턴스 생성 코드를 서브클래스에서 수행하도록 하는 패턴이다.

팩토리 패턴의 특징은 아래와 같다.

- 팩토리 패턴은 디자인 원칙 중 **DIP(Dependency Inversion Principle)**와 크게 관련된 패턴이다.

    **구상 클래스에 의존하지 않게 하고, 추상화된 대상에 의존하도록 설계한다.**

- 모든 팩토리 패턴에서는 객체 생성을 캡슐화한다. (서브클래스에 위임)
- 팩토리 패턴에는 팩토리 메서드 패턴, 추상 팩토리 패턴 두 가지가 존재한다.

    팩토리 메서드 패턴은 인스턴스의 생성을 서브 클래스(팩토리)에 위임한다.

    추상 팩토리 패턴은 팩토리 메서드 패턴에서 한 단계 더 나아가서, 각 그룹(동질의) 인스턴스들을 반환하는 팩토리를 구분짓는 방법이다. 

    팩토리 메서드 패턴은 객체 사용자와 구상 클래스 사이에 팩토리 하나가 인터페이스 역할을 하는 구조이다. 객체 사용자 입장에서 보면 자신이 사용할 객체가 캡슐화된다.

    추상 팩토리 패턴은 객체 사용자와 팩토리 사이 팩토리 관리자(?) 인터페이스가 더해진 구조이다. 이로써 객체 사용자가 사용할 객체의 종류를 직접 인자로 넘겨주지 않고, 해당 객체의 종류를 다루는 팩토리의 인스턴스를 팩토리 관리자에게 넘겨줌으로써 객체 사용자와 팩토리 간의 결합도를 느슨하게 한다.
<br/><br/>

# 팩토리 패턴 예시

[https://woovictory.github.io/2019/02/07/Design-Pattern-Factory-Pattern/](https://woovictory.github.io/2019/02/07/Design-Pattern-Factory-Pattern/)

# 참고

[https://woovictory.github.io/2019/02/07/Design-Pattern-Factory-Pattern/](https://woovictory.github.io/2019/02/07/Design-Pattern-Factory-Pattern/)

[http://wiki.gurubee.net/pages/viewpage.action?pageId=1507401](http://wiki.gurubee.net/pages/viewpage.action?pageId=1507401)