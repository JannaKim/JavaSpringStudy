{
 "cells": [
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "# Strategy Pattern (전략 패턴)\n",
    "> 다형성-> 전략패텬-> Dependency Injection 순서로 "
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "## 다형성"
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "#### 문제의 제시\n",
    "Duck 클래스로부터 상속받은 MallarDuck클래스와 RedDuck클래스가 있다.<br>\n",
    "Duck에는 fly(), quack(), swim(), display()를 가지고 있다.<br>\n",
    "이때 날 수 없는 Rubberduck클래스가 추가되면 Duck을 수정해야 한다.<br>\n",
    "\n",
    "문제1 : 새로운 오리가 추가되면 오리의 특성이 담긴 코드가 중복된다.<br> \n",
    "문제2 : 차후 추가될 오리들의 모든 행도을 알기 힘들다.<br>\n",
    "문제3 : 코드를 수정하면 다른 오리들에게 어떤 영향을 끼칠 수 있는지 모른다.<br>\n",
    "문제4 : 런타임에서 오리의 특징을 바꾸기 어렵다.<br>\n",
    "#### 솔루션1\n",
    "- 문제를 일으키는 오리의 행동들을 분리해 인터페이스로 바꾼다.\n",
    "- Duck안의 fly()와 quack()을 인터페이스로 만든다.\n",
    "근데 이러면 모든 오리가 여러 인터페이스를 가져다 구현해야만 한다.\n",
    "\n",
    "#### 솔루션2\n",
    "- Duck이 Quakable, Flyable 인터페이스를 상속한다.\n",
    "- 각각 Quackable, Flyable은 오리의 특성의 맞춘 구현체가 있다.\n",
    "- Duck은 오리의 특성을 setFlyBehavior(),setQuackBehavior()로 필요한 것만 선택한다.\n",
    "- 이럼으로써 Duck을 수정하지 않고 추가되는 오리의 특성을 Flyable(),Quackable() 구현체로 만들어 놓으면 된다.\n",
    "이 솔루션은 다형성을 사용해 전략패턴이 만들어 지게 된다."
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "### Dependency\n",
    "설계시 각 클래스는 의존성이 없이 설계되어야 한다. 그래야 차후에 복잡하게 수정되는 일이 없다.<br>"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "metadata": {},
   "outputs": [],
   "source": []
  }
 ],
 "metadata": {
  "kernelspec": {
   "display_name": "Python 3",
   "language": "python",
   "name": "python3"
  },
  "language_info": {
   "codemirror_mode": {
    "name": "ipython",
    "version": 3
   },
   "file_extension": ".py",
   "mimetype": "text/x-python",
   "name": "python",
   "nbconvert_exporter": "python",
   "pygments_lexer": "ipython3",
   "version": "3.7.3"
  }
 },
 "nbformat": 4,
 "nbformat_minor": 4
}
