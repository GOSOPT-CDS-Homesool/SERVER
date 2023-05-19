# 아젠다와 윤돌이의 재미있는 합세

## 팀원 소개
|                                                                      강윤서                                                                       |                                                                이의제                                                                |
|:----------------------------------------------------------------------------------------------------------------------------------------------:|:---------------------------------------------------------------------------------------------------------------------------------:|
| <img src="https://avatars.githubusercontent.com/u/65678579?v=4" width="300" height="265"/> |                                               <img src="https://avatars.githubusercontent.com/u/12531340?v=4" width="300" height="265"/>                                               |
|                                                   [yungu0010](https://github.com/yungu0010)                                                    |                                                 [euije](https://github.com/euije)                                                 |

## 역할 분담

| 이름           | 담당 역할                                      | Role |
|:-------------|:-------------------------------------------|:----:|
| 이달의 홈술 모두 조회 | [GET] /alcohol                             | 강윤서  |
| 술 상세 페이지 조회  | [GET] /alcohol/{alcoholId=Long}            | 이의제  |
| 술 좋아요        | [POST] /alcohol/like?alcoholId=Long        | 강윤서  |
| 상품후기 조회      | [GET] /alcohol/review/{alcoholId=Long}     | 강윤서  |
| 상품문의 조회      | [GET] /alcohol/inquiry/{alcoholId=Long}    | 이의제  |
| 리뷰 모두 조회     | [GET] /alcohol/review                      | 이의제  |
| 유저정보 조회      | [GET] /user/{userId=Long}                  | 강윤서  |
| 결제하기         | [POST] /payment?userId=Long&alcoholId&Long | 이의제  |


## ERD

![homesool](https://github.com/GOSOPT-CDS-Homesool/SERVER/assets/12531340/85e2c2b9-a497-4556-a855-0e102d21b858)
- [homesool-ERD](https://www.erdcloud.com/d/TthfS8TPnuT7YwSk7)

## Commit Convention

### 기본 형식

```java
[PREFIX] #이슈번호 - 이슈 내용
```

### 예시

```java
// 1번 이슈에서 새로운 기능(Feat)을 구현한 경우
[FEAT] #1 - 기능 구현
// 1번 이슈에서 레이아웃(Design)을 구현한 경우
[DESIGN] #1 - 레이아웃 구현
```

### Prefix의 의미

```java
[FEAT]: 새로운 기능 구현
[FIX]: 버그, 오류 해결, 코드 수정
[DEL]: 쓸모없는 코드, 주석 삭제, 파일 삭제
[REFACTOR]: 전면 수정이 있을 때 사용합니다
[CHORE]: 그 이외의 잡일/ 버전 코드 수정, 패키지 구조 변경, 파일 이동, 파일이름 변경, 프로젝트 구조 변경(폴더링 등)
라이브러리 추가
[DOCS]: README나 WIKI 등의 문서 개정
[COMMENT]: 필요한 주석 추가 및 변경
[MERGE]: 머지
```

## Branch

### Branch Templete

- 이슈 단위 == PR 단위
- 브랜치 전략
    - Chore/#이슈번호
    - API/#이슈번호

### PR Templete

```markdown

## 🫧 작업한 내용

<!-- 아래 리스트를 지우고, 작업 내용을 적어주세요. -->

## 👻 PR Point

<!-- 피드백을 받고 싶은 부분이나, 공유하고 싶은 부분을 적어주세요. -->

## 📮 관련 이슈

<!-- 작업한 이슈번호를 # 뒤에 붙여주세요. -->

- Resolved: #
```

### Merge

- Merge를 할 때는 커밋 메세지를 `**[PREFIX] #이슈번호 - 구현내용**` 형식의 이슈 이름과 같이 수정해줍니다!
- Merge 후 재사용하지 않는 브랜치는 삭제합니다.
- 최소 1명의 Approve를 받고 Merge합니다.

![Untitled](https://github.com/GOSOPT-CDS-Homesool/SERVER/assets/12531340/6224b7d4-6d8e-4dfc-b66b-a5a659037ad9)

아래 설명에 뜨는 메세지로 수정해주세요!

## Issue Templete

```markdown

---
name: Issue Template
about: "클디서 1조 이슈 템플릿입니다."
title: "[PREFIX] 이슈 타이틀"
labels: ''
assignees: ''

---

## 👾 Issue
<!-- 이슈에 대해 간략하게 설명해주세요 -->

## 📝 To-do
<!-- 진행할 작업에 대해 적어주세요 -->
- [ ] todo!
```

## 프로젝트 구조

```
🗂 homesool
    🗂 common (공통 처리 관련 클래스)
        🗂 advice
        🗂 dto
    🗂 controller (클라이언트의 요청을 받는 컨트롤러 계층)
        🗂 dto
            🗂 request
            🗂 response
    🗂 domain (도메인)
    🗂 exception (예외처리)
        🗂 model
    🗂 infrastructure (데이터베이스 등 외부 요소와 연결을 수행하는 계층)
    🗂 service (비즈니스로직이 있는 서비스 계층)
```

## 🙏 Code Convention

> 💡 **동료들과 말투를 통일하기 위해 컨벤션을 지정합니다.**
> 오합지졸의 코드가 아닌, **한 사람이 짠 것같은 코드**를 작성하는 것이 추후 유지보수나 협업에서 도움이 됩니다. 내가 코드를 생각하면서 짤 수 있도록 해주는 룰이라고 생각해도 좋습니다!

<details>
<summary>명명규칙(Naming Conventions)</summary>
<div markdown="1">

1. 이름으로부터 의도가 읽혀질 수 있게 쓴다.

-   ex)

    ```jsx
    // bad
    function q() {
        // ...stuff...
    }

    // good
    function query() {
        // ..stuff..
    }
    ```

2. 오브젝트, 함수, 그리고 인스턴스에는 `camelCase`를 사용한다.

-   ex)
    ```jsx
    // bad
    const OBJEcttsssss = {};
    const this_is_my_object = {};
    function c() {}

    // good
    const thisIsMyObject = {};
    function thisIsMyFunction() {}
    ```

3. 클래스나 constructor에는 `PascalCase`를 사용한다.

-   ex)
    ```jsx
    // bad
    function user(options) {
        this.name = options.name;
    }

    const bad = new user({
        name: 'nope',
    });

    // good
    class User {
        constructor(options) {
            this.name = options.name;
        }
    }

    const good = new User({
        name: 'yup',
    });
    ```

4. 함수 이름은 동사 + 명사 형태로 작성한다.
   ex) `postUserInformation( )`
5. 약어 사용은 최대한 지양한다.
6. 이름에 네 단어 이상이 들어가면 팀원과 상의를 거친 후 사용한다
 </div>
 </details>

<details>
<summary>블록(Blocks)</summary>
<div markdown="1">

1. 복수행의 블록에는 중괄호({})를 사용한다.

-   ex)
    ```jsx
    // bad
    if (test)
      return false;

    // good
    if (test) return false;

    // good
    if (test) {
      return false;
    }

    // bad
    function() { return false; }

    // good
    function() {
      return false;
    }

    ```

2. 복수행 블록의 `if` 와 `else` 를 이용하는 경우 `else` 는 `if` 블록 끝의 중괄호( } )와 같은 행에 위치시킨다.

-   ex)
    ```java
    // bad
    if (test) {
    thing1();
    thing2();
    }
    else {
    thing3();
    }

    // good
    if (test) {
      thing1();
      thing2();
    } else {
      thing3();
    }

    ```
</div>
</details>

<details>
<summary>코멘트(Comments)</summary>
<div markdown="1">

1. 복수형의 코멘트는 `/** ... */` 를 사용한다.

-   ex)
    ```jsx
    // good
    /**
     * @param {String} tag
     * @return {Element} element
     */
    
    function make(tag) {
        // ...stuff...

        return element;
    }
    ```

2. 단일 행의 코멘트에는 `//` 을 사용하고 코멘트를 추가하고 싶은 코드의 상부에 배치한다. 그리고 코멘트의 앞에 빈 행을 넣는다.

-   ex)
    ```jsx
    // bad
    const active = true; // is current tab

    // good
    // is current tab
    const active = true;

    // good
    function getType() {
        console.log('fetching type...');

        // set the default type to 'no type'
        const type = this._type || 'no type';

        return type;
    }

    ```
</div>
</details>