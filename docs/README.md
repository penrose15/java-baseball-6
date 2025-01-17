### 기능 요구사항


* 프로그램 시작 시 `숫자 야구 게임을 시작합니다.`라는 문구가 떠야 한다.
* 3스트라이크가 뜨기 전까지 `숫자를 입력해주세요 : ` 라는 문구와 함꼐 1-9 까지의 숫자 중 아무 숫자를 3개 입력할 수 있어야 한다.
* 만약 1-9사이 세자리 숫자 이외 다른 것을 입력하면 IllegalArgumentException 에러와 함께 애플리케이션을 종료 시켜야 한다.
* 만약 `숫자를 입력해주세요 : `라는 문구 가 뜨고 사용자가  1-9 사이 세자리 숫자를 입력하면 사용자가 작성한 숫자와 컴퓨터의 숫자를 확인 한 후, n 스트라이크, n볼, 혹은 낫싱을 출력해야 한다.
* 만약 사용자가 컴퓨터의 숫자를 맞춰 3스트라이크를 띄운다면 `3개의 숫자를 모두 맞히셨습니다! 게임 종료 게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.` 라는 문구를 출력하고 재시작/종료를 구분할 수 있는 1 혹은 2의 숫자를 입력할 수 있게 해야 하고 만약 이외의 것을 입력한다면 IllegalArgumentException 를 띄운다.
* 1을 입력하면 게임 재시작, 2를 입력한다면 게임을 완전 종료시킨다.

### 구현할 기능 

1. 입력
* **서로 다른 3자리의 수** (0도 가능한가? -> 요구사항에 딱히 제한은 없다.)
* 게임 종료 후 1 - 재시작 / 2 - 게임 종료 입력 기능

2. 출력
* 시작 문구 출력 : `숫자 야구 게임을 시작합니다.`
* 숫자 입력 문구 : `숫자를 입력해주세요 : `
* 사용자가 입력한 숫자에 대한 결과 : `n볼 n스트라이크` / `낫싱` / `3스트라이크` /...

3. 랜덤 숫자 생성기
* 1-9 사이의 서로 다른 임의의 수 3개를 생성(123 - o, 232 - x)

4. 사용자가 입력한 숫자와 컴퓨터의 숫자 비교 및 출력
* 숫자가 일치하나 위치가 다르면 `볼`
* 숫자와 위치가 같으면 `스트라이크`
* 사용자의 숫자와 컴퓨터의 숫자가 완전히 다르면 `낫싱`

5. 게임 생명 주기
* 사용자가 3스트라이크를 낼 때까지 `숫자를 입력해주세요 : `출력 및 결과 출력 반복
* 게임 종료 후 재시작 혹은 완전 종료