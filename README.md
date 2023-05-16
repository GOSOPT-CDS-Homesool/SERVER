# 아젠다와 윤돌이의 재미있는 합세

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

