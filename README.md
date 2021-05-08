- 다음 문서는 git 명령어들에 대하여 설명합니다. 설명을 위해 특정 시나리오를 정하고 git 명령어를 실습합니다.

# 시나리오 요약
- Markdown과 GFM에 대한 튜토리얼 내용을 추가하고, 추가한 문서들을 수정한다. 
- 세부 시나리오 내용은 앞으로 등장하는 ▶ 기호를 통해 설명한다. 

### config 
- config 명령어는 git의 사용 환경을 설정하는데 사용한다. <br /><br />

▶ 현재 설정을 확인한다. <br />
$ git config --list <br />
 
<img width="545" alt="스크린샷 2021-05-08 오후 6 23 11" src="https://user-images.githubusercontent.com/40673012/117533974-7308be80-b02a-11eb-9d27-bcc2ab0e36ad.png">

<br />

▶ 사용자 이름을 'Shim Seoung Chul'로 변경한다. <br />
$ git config --global user.name "Shim Seoung Chul"

▶ 변경된 설정을 확인한다. <br />
$ git config --list <br />
 
<img width="543" alt="스크린샷 2021-05-08 오후 6 38 34" src="https://user-images.githubusercontent.com/40673012/117534478-9896c780-b02c-11eb-9ba7-1a2f079ce43c.png">

### init  
- init 명령어는 디렉토리를 git 저장소로 만든다.


▶ 원하는 디렉토리를 선택하여 git 저장소로 만든다.  <br />
$ git init

<img width="542" alt="스크린샷 2021-05-08 오후 6 42 39" src="https://user-images.githubusercontent.com/40673012/117534609-2b376680-b02d-11eb-9478-b59a9c2a1274.png">

### add 
- add 명령어는 작업 디렉토리의 변경 내용을 스테이지 영역에 추가하는 명령어다. 이것을 스테이징이라고한다.
- 스테이징은 깃에게 버전 만들 준비를 하라고 알려주는 것을 의미한다.

▶ README.md 파일을 생성한다.  <br />
$ touch README.md  <br />
$ ls  <br />

<img width="499" alt="스크린샷 2021-05-08 오후 7 18 55" src="https://user-images.githubusercontent.com/40673012/117535767-3c36a680-b032-11eb-9005-4e3d59e9b625.png">

▶ README.md 파일에 Markdown 튜토리얼에 대한 내용을 작성하고, 스테이지에 올린다. (README.md 파일의 내용은 추후 다른 파일에 옮길 예정이다.)

<img width="539" alt="스크린샷 2021-05-08 오후 7 21 58" src="https://user-images.githubusercontent.com/40673012/117535853-a9e2d280-b032-11eb-976d-f868769af63d.png">

$ git add README.md  <br />

<img width="538" alt="스크린샷 2021-05-08 오후 7 22 49" src="https://user-images.githubusercontent.com/40673012/117535869-c848ce00-b032-11eb-9f23-1b9d82bc0461.png">


### status
- 파일의 상태를 확인한다.

▶ add 명령어로 README.md 파일을 스테이징한 후 파일 상태를 확인한다. 커밋을 할 수 있는 파일이 추가된 걸 확인할 수 있다.  <br />

$ git status  <br />

<img width="527" alt="스크린샷 2021-05-08 오후 7 24 28" src="https://user-images.githubusercontent.com/40673012/117535895-02b26b00-b033-11eb-9e92-038854b01ba9.png">

### commit 
- 앞에서 add 명령어를 통해 스테이징한 파일의 버전을 만드는 것을 커밋이라고한다. 
- 커밋할 때는 그 버전에 변경사항을 메시지로 함께 기록한다.

▶ README.md 파일을 커밋한다. <br />
$ git commit -m "Markdown 정리 자료 추가"

<img width="545" alt="스크린샷 2021-05-08 오후 7 25 17" src="https://user-images.githubusercontent.com/40673012/117535911-207fd000-b033-11eb-8a6b-c082b6503a60.png">

▶ 다시 파일 상태를 확인하자. 더 이상 커밋할 수 있는 파일이 없는 것으로 상태가 변경되었다.

<img width="534" alt="스크린샷 2021-05-08 오후 7 27 13" src="https://user-images.githubusercontent.com/40673012/117535954-65a40200-b033-11eb-840d-e9d41ecb584f.png">

### tag
- 커밋을 참조하기 쉽도록 알기 쉬운 이름을 붙이는 기능이다.

▶ 커밋에 '1.0.0'이라는 이름의 태그를 붙인다. <br />
$ git tag -a v1.0.0 -m "version 1.0.0"

<img width="540" alt="스크린샷 2021-05-08 오후 7 31 23" src="https://user-images.githubusercontent.com/40673012/117536068-faa6fb00-b033-11eb-9dc6-2e2ac7f8570e.png">

▶ 태그가 정상적으로 적용되었는지 확인한다. <br />
$ git show v1.0.0 <br />

<img width="539" alt="스크린샷 2021-05-08 오후 7 31 51" src="https://user-images.githubusercontent.com/40673012/117536079-0b577100-b034-11eb-99a6-fb7b6f58fe6a.png">

### remote
- 프로젝트의 리모트 저장소(ex.깃헙)를 관리하는 명령어다.
- git remote: 등록된 리모트 저장소 이름 확인
- git remote -v: 등록된 저장소 이름과 URL 표시
- git remote add 리모트이름 경로: 새로운 리모트를 추가한다.
- git remote show 리모트이름 : 새로운 리모트를 추가한다.

## 명령어표
|명령어|사용여부|사용위치|
|--|--|--|
|config|o|[config 사용 위치](#config)|
|init|o|[init 사용 위치](#init)|
|add|o|[add 사용 위치](#add)|
|status|o|[status 사용 위치](#status)|
|commit|o|[commit 사용 위치](#commit)|
|tag|o|[tag 사용 위치](#tag)|
|remote|o|[remote 사용 위치](#remote)|
