# 자동차 경주 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능 요구사항
- 주어진 횟수 동안 ***n대***의 자동차는 ***전진*** 또는 ***멈출*** 수 있다.
- 각 자동차에 ***이름***을 부여할 수 있다. 전진하는 자동차를 출력할 때 ***자동차 이름을 같이 출력***한다.
- 자동차 ***이름은 쉽표 (,)를 기준으로 구분***하여 ***이름은 5자 이하***만 가능하다.
- 사용자는 ***몇 번의 이동***을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 ***0에게 9사이에서 random 값을 구한 후*** random 값이 ***4 이상일 경우 전진하고, 3 이하의 값이면 멈춘다.***
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. ***우승자는 한 명 이상***일 수 있다.

## 기능 목록
- 실행 클라이언트 
    - 출력용 main 메소드가있는 클래스

-   게임 실행 
    - 게임을 실행시키는 메소드가 있는 클래스
    
-  UI 콘솔 입출력 컨트롤러
    - 입력 / 출력 흐름 제어
   
-  UI 메세지 리소스
    - 입력 / 출력 메세지 상수 관리
   
-  UI 자동차 경주 출력
    - 이름과 전진상태 그리는 클래스
    - 막대기로 전진 상태 그리기
    
- Validation 입력값 제어
    - 이름 길이 제한 : 5글자 이하
    - 이동 횟수 입력값 : 숫자값
  
-  Domain 자동차
    - Car class 자동차의 ***이름***, ***전진 칸 수***
   
- Domain 자동차 그룹
    - 레이싱 그룹 레이싱 시도 ***횟수***, ***n대의 자동차***
   
- Domain 전진 여부생성
    - 랜덤수로 전진 / 멈춤 계산

- Generator 자동차 그룹 생성
    - 자동차 이름값으로 자동차 생성, 자동차 그룹 생성
  
- Generator 자동차 그룹 레이싱
    - 그룹 전진 실행 
    - 뷰 생성 호출
    - 승리자 계산
    
    
아... 어떻게 그려야될까..

