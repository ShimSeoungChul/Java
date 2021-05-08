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
<img width="542" alt="스크린샷 2021-05-08 오후 6 42 39" src="https://user-images.githubusercontent.com/40673012/117534609-2b376680-b02d-11eb-9478-b59a9c2a1274.png">

▶ 원하는 디렉토리를 선택하여 git 저장소로 만든다.  <br />
$ git config --global user.name "Shim Seoung Chul"

### add 
- add 명령어는 작업 디렉토리의 변경 내용을 스테이지 영역에 추가하는 명령어다. 이것을 스테이징이라고한다.
- 스테이징은 깃에게 버전 만들 준비를 하라고 알려주는 것을 의미한다.


### status
- 파일의 상태를 확인한다.


### commit 
- 앞에서 add 명령어를 통해 스테이징한 파일의 버전을 만드는 것을 커밋이라고한다. 
- 커밋할 때는 그 버전에 변경사항을 메시지로 함께 기록한다.

# 명령어표
|명령어|사용여부|사용위치|
|--|--|--|
||o||
||o||
||o||
||o||
