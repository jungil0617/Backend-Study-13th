# Backend-Study-13th

## 기능 요구사항
+ 사용자가 입력한 문자열 값에 따라 사칙연산을 수행하는 계산기 구현
+ 입력 문자열의 숫자와 사칙 연산 기호 사이에는 공백이 포함되어야 한다.
+ 숫자는 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달 할 경우 구분자를 기준으로 분리한 각 숫자와, 마지막에 하나의 공백을 가지고 전달된 연산자의 계산 결과를 반환. (아래 입출력예시 참고)
+ 연산자의 경우 하나만 입력 받는다.
+ 사칙 연산만 포함한다.
+ 소숫점의 경우 0.1, 0.2 와 같이 소숫점 첫째짜리까지 표시
+ 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생 시킨다.


## 입력 및 출력 예시
~~~
1. 1:2,3:4 +
2. 6:10,2:3 *
3. 7,2:3 -
4. 4:2,5 /
~~~

~~~
1. 1 + 2 + 3 + 4 = 10
2. 6 * 10 * 2 * 3 = 360
3. 7 - 2 - 3 = 2
4. 4 / 2 / 5 = 0.4
~~~

## 구현 로직
1. 사용자 입력 기능
2. 입력값 검증 및 예외 처리
3. 문자열에서 구분자와 연산자를 기준으로 파싱
4. 수식과 결과 값을 저장
5. 결과 출력

## 클래스 구조
~~~
src
├── Main.java
├── calculator
│   ├── Calculator.java
│   └── Operator.java
├── error
│   └── ErrorMessage.java
├── input
│   └── InputHandler.java
├── output
│   └── OutputHandler.java
├── parser
│   ├── Separator.java
│   └── StringParser.java
└── validation
    └── Validator.java
~~~

## 예외 처리
1. 입력값이 null이거나 빈 문자열 일 때 IllegalArgumentException을 발생.
2. 숫자가 아닌 문자를 입력했을때 IllegalArgumentException을 발생.
3. 잘못된 연산자를 입력했을때 IllegalArgumentException을 발생.
4. 0으로 나눌 수 없을 때 ArithmeticException을 발생.
