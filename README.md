다음 문서는 git 명령어들에 대하여 설명합니다. 설명을 위해 특정 시나리오를 정하고 git 명령어를 실습합니다. <br />

# 시나리오 요약
- Markdown과 GFM에 대한 튜토리얼 내용을 추가하고, 추가한 문서들을 수정한다. 
- 세부 시나리오 내용은 앞으로 등장하는 ▶ 기호를 통해 설명한다. 

<br/>

### config 
- config 명령어는 git의 사용 환경을 설정하는데 사용한다. <br />

▶ 현재 설정을 확인한다. <br />
$ git config --list <br />
 
<img width="545" alt="스크린샷 2021-05-08 오후 6 23 11" src="https://user-images.githubusercontent.com/40673012/117533974-7308be80-b02a-11eb-9d27-bcc2ab0e36ad.png">

<br />

▶ 사용자 이름을 'Shim Seoung Chul'로 변경한다. <br />
$ git config --global user.name "Shim Seoung Chul"

▶ 변경된 설정을 확인한다. <br />
$ git config --list <br />
 
<img width="543" alt="스크린샷 2021-05-08 오후 6 38 34" src="https://user-images.githubusercontent.com/40673012/117534478-9896c780-b02c-11eb-9ba7-1a2f079ce43c.png">

<br/>

### init  
- init 명령어는 디렉토리를 git 저장소로 만든다. <br/>


▶ 원하는 디렉토리를 선택하여 git 저장소로 만든다.  <br />
$ git init

<img width="542" alt="스크린샷 2021-05-08 오후 6 42 39" src="https://user-images.githubusercontent.com/40673012/117534609-2b376680-b02d-11eb-9478-b59a9c2a1274.png">

<br/>

### add 
- add 명령어는 작업 디렉토리의 변경 내용을 스테이지 영역에 추가하는 명령어다. 이것을 스테이징이라고한다.
- 스테이징은 깃에게 버전 만들 준비를 하라고 알려주는 것을 의미한다. <br/>

▶ README.md 파일을 생성한다.  <br />
$ touch README.md  <br />
$ ls  <br />

<img width="499" alt="스크린샷 2021-05-08 오후 7 18 55" src="https://user-images.githubusercontent.com/40673012/117535767-3c36a680-b032-11eb-9005-4e3d59e9b625.png">

▶ README.md 파일에 Markdown 튜토리얼에 대한 내용을 작성하고, 스테이지에 올린다. (README.md 파일의 내용은 추후 다른 파일에 옮길 예정이다.)

<img width="539" alt="스크린샷 2021-05-08 오후 7 21 58" src="https://user-images.githubusercontent.com/40673012/117535853-a9e2d280-b032-11eb-976d-f868769af63d.png">

$ git add README.md  <br />

<img width="538" alt="스크린샷 2021-05-08 오후 7 22 49" src="https://user-images.githubusercontent.com/40673012/117535869-c848ce00-b032-11eb-9f23-1b9d82bc0461.png">

<br/>

### status
- 파일의 상태를 확인한다. <br/>

▶ add 명령어로 README.md 파일을 스테이징한 후 파일 상태를 확인한다. 커밋을 할 수 있는 파일이 추가된 걸 확인할 수 있다.  <br />

$ git status  <br />

<img width="527" alt="스크린샷 2021-05-08 오후 7 24 28" src="https://user-images.githubusercontent.com/40673012/117535895-02b26b00-b033-11eb-9e92-038854b01ba9.png">

<br/>

### commit 
- 앞에서 add 명령어를 통해 스테이징한 파일의 버전을 만드는 것을 커밋이라고한다. 
- 커밋할 때는 그 버전에 변경사항을 메시지로 함께 기록한다.<br/>

▶ README.md 파일을 커밋한다. <br />
$ git commit -m "Markdown 정리 자료 추가"

<img width="545" alt="스크린샷 2021-05-08 오후 7 25 17" src="https://user-images.githubusercontent.com/40673012/117535911-207fd000-b033-11eb-8a6b-c082b6503a60.png">

▶ 다시 파일 상태를 확인하자. 더 이상 커밋할 수 있는 파일이 없는 것으로 상태가 변경되었다.

<img width="534" alt="스크린샷 2021-05-08 오후 7 27 13" src="https://user-images.githubusercontent.com/40673012/117535954-65a40200-b033-11eb-840d-e9d41ecb584f.png">

<br/>

### tag
- 커밋을 참조하기 쉽도록 알기 쉬운 이름을 붙이는 기능이다.

▶ 커밋에 '1.0.0'이라는 이름의 태그를 붙인다. <br />
$ git tag -a v1.0.0 -m "version 1.0.0"

<img width="540" alt="스크린샷 2021-05-08 오후 7 31 23" src="https://user-images.githubusercontent.com/40673012/117536068-faa6fb00-b033-11eb-9dc6-2e2ac7f8570e.png">

▶ 태그가 정상적으로 적용되었는지 확인한다. <br />
$ git show v1.0.0 <br />

<img width="539" alt="스크린샷 2021-05-08 오후 7 31 51" src="https://user-images.githubusercontent.com/40673012/117536079-0b577100-b034-11eb-99a6-fb7b6f58fe6a.png">

<br/>

### remote
- 프로젝트의 리모트 저장소(ex.깃헙)를 관리하는 명령어다.
- git remote: 등록된 리모트 저장소 이름 확인
- git remote -v: 등록된 저장소 이름과 URL 표시
- git remote add 리모트이름 경로: 새로운 리모트를 추가한다.
- git remote show 리모트이름 : 모든 리모트 경로의 branch와 정보를 표시한다.
- git remote rm 리모트이름: 리모트 경로를 제거한다.

▶ 파일을 관리할 원격 저장소를 추가한다. <br/>
$ git remote add origin https://github.com/ShimSeoungChul/software-engineering-assignment2.git


<br/>

### push
- 원격 저장소에 코드 변경사항을 업로드하는 명령어다. <br/>

▶  변경된 내용을 원격 저장소에 반영한다. <br />
$ git push -u origin master 

<img width="539" alt="스크린샷 2021-05-08 오후 7 49 24" src="https://user-images.githubusercontent.com/40673012/117536536-7efa7d80-b036-11eb-93eb-86eaadff0e25.png">

▶ 원격 저장소 (https://github.com/ShimSeoungChul/software-engineering-assignment2) 로 이동하면, 다음과 같이 변경 사항이 반영된 걸 확인할 수 있다.

<img width="538" alt="스크린샷 2021-05-08 오후 7 52 06" src="https://user-images.githubusercontent.com/40673012/117536602-def12400-b036-11eb-853a-e44f7a470efd.png">

<br/>

### clone
- 클라이언트 상에 아무것도 없을 때 서버의 프로젝트를 내려받는 명령어다.<br/>

▶ 원격 저장소에 저장된 내용을 다른 개발자와 함께 수정한다고 가정하자. 지금까지 초기 버전을 작성한 사람을 개발자 A, 이후 수정을 담당할 사람을 개발자 B라고 지칭한다. 개발자 B는 가장 먼저 원격 저장소에 저장된 내용을 내려받아야 할 것이다. 이떄, clone 명령어를 사용할 수 있다.

$ git clone https://github.com/ShimSeoungChul/software-engineering-assignment2.git <br />

<img width="554" alt="스크린샷 2021-05-08 오후 7 53 10" src="https://user-images.githubusercontent.com/40673012/117536620-0647f100-b037-11eb-8cdb-8d8aed1ccc43.png">

▶ 원격 저장소에서 내려 받은 내용이 들어있는 디렉토리로 이동한다.
$ cd software-engineering-assignment2

<br/>

### branch
- 브랜치는 버전 관리 시스템에서 나무 가지(브랜치)처럼 여러 갈래로 퍼지는 데이터 흐름을 말한다.
- branch 명령어는 이러한 분기(브랜치)를 관리하는 역할을 한다.

▶ 저장소에 GFM에 대한 튜토리얼을 추가한다. 해당 작업을 진행할 gfm 브랜치를 생성한다. <br />

$ git branch gfm

<br/>

### checkout
- 브램치를 전환하는 명령어다.<br/><br/>

▶ gfm 브랜치로 전환한다. <br />
$ git checkout gfm

<img width="547" alt="스크린샷 2021-05-08 오후 8 00 24" src="https://user-images.githubusercontent.com/40673012/117536778-08f71600-b038-11eb-92c8-8383efd39f34.png">


▶ GFM-tutorial.md 파일을 생성하고, '오타'라는 내용을 저장한다. <br />
$ touch GFM-tutoral.md 

<img width="535" alt="스크린샷 2021-05-08 오후 8 02 40" src="https://user-images.githubusercontent.com/40673012/117536836-58d5dd00-b038-11eb-9f52-f1db4390cabe.png">

▶ 해당 파일을 스테이징하고, 커밋한다.  <br />
$ git add GFM-tutorial.md <br />
$ git commit -m "GFM 튜토리얼 추가" <br />

<img width="541" alt="스크린샷 2021-05-08 오후 8 04 37" src="https://user-images.githubusercontent.com/40673012/117536887-9f2b3c00-b038-11eb-8253-4e2ca7b0f244.png">

<br/>

### log
- 저장소의 커밋 히스토리를 조회한다. <br/><br/>

▶ 지금까지 커밋 결과가 정상적으로 반영되었는지 확인한다. <br/>
$ git log

<img width="545" alt="스크린샷 2021-05-08 오후 8 07 51" src="https://user-images.githubusercontent.com/40673012/117536968-1234b280-b039-11eb-99ec-43da7917ad4b.png">

<br/>

### reset 
- 커밋 버전을 이전 버전으로 되돌린다. <br/>

▶ 커밋한 GFM-tutorial.md 파일에 오타가 있음을 알았다. 이를 수정하기위해 이전 버전으로 커밋을 되돌리자. 앞서 log 명령어로 확인할 수있는 'Markdown 정리 자료 추가'의 커밋 해시를 이용해서 버전을 되돌리자. <br />

$ git reset --hard c7435854a19a6a48a24188daf6b42a63b197fe65 

<img width="541" alt="스크린샷 2021-05-08 오후 8 16 06" src="https://user-images.githubusercontent.com/40673012/117537162-39d84a80-b03a-11eb-9f85-e7588c060415.png">

▶ 다시 커밋 히스토리를 조회하면, 버전이 되돌려진걸 확인할 수 있다. <br />
$ git log

<img width="539" alt="스크린샷 2021-05-08 오후 8 13 54" src="https://user-images.githubusercontent.com/40673012/117537115-eb2ab080-b039-11eb-8318-d72a66c96661.png">

<br />

▶ 다시 GFM-tutorial.md 파일을 생성하고, 과제1의 GFM 설명 내용을 입력한다.
$ touch GFM-tutorial.md 


<br />
▶ 생성한 파일을 스테이징-커밋한다. <br />
$ git add GFM-tutorial.md  <br />
$ git commit -m "GFM 튜토리얼 추가" <br />

<img width="544" alt="스크린샷 2021-05-08 오후 8 16 36" src="https://user-images.githubusercontent.com/40673012/117537170-4c528400-b03a-11eb-9e74-9ccf4a510697.png">

<br />
▶ 브랜치를 master(기본 브랜치)로 전환한다.<br />
$ git checkout master <br />

<img width="533" alt="스크린샷 2021-05-08 오후 8 20 16" src="https://user-images.githubusercontent.com/40673012/117537275-cedb4380-b03a-11eb-800d-db39014ad04a.png">

<br />

### merge
- 브랜치를 병합하는 명령어다. <br />

▶ gfm 브랜치에서 수정한 내용을 master 브랜치로 병합한다. <br />
$ git merge gfm

<img width="544" alt="스크린샷 2021-05-08 오후 8 22 38" src="https://user-images.githubusercontent.com/40673012/117537332-237ebe80-b03b-11eb-89ae-e86ec6f79e23.png">

<br />
▶ 새로운 버전 표시하는 태그를 추가하고, 커밋 히스토리를 확인한다. 병합이 성공한 걸 확인할 수 있다. <br />
$ git tag -a v1.0.1 -m "version 1.0.1" <br />
$ git log

<img width="535" alt="스크린샷 2021-05-08 오후 8 24 31" src="https://user-images.githubusercontent.com/40673012/117537364-66d92d00-b03b-11eb-8b72-7522cf337bbc.png">

▶ 수정 내용을 원격 저장소에 적용하고, 정상적으로 반영되었는지 확인한다. <br />
$ git push

<img width="546" alt="스크린샷 2021-05-08 오후 8 25 40" src="https://user-images.githubusercontent.com/40673012/117537397-90925400-b03b-11eb-8011-bffea97e57fd.png">

<img width="533" alt="스크린샷 2021-05-08 오후 8 26 10" src="https://user-images.githubusercontent.com/40673012/117537412-a142ca00-b03b-11eb-847e-6806ffed4b82.png">

<br />

### pull
- 원격 저장소의 변경된 데이터를 가져오는 명령어다. <br />

▶ 위에서 개발자 B는 GFM 튜토리얼 내용을 원격 저장소에 업데이트했다. 개발자 A의 저장소에도 해당 내용을 반영해야 추가적인 수정이 가능할 것이다. 개발자 A의 저장소를 최신화하고, 개발자 A의 업무를 시작하자. <br />
$ git pull

<img width="543" alt="스크린샷 2021-05-08 오후 8 43 56" src="https://user-images.githubusercontent.com/40673012/117537772-1ca57b00-b03e-11eb-922c-1f88f6f0568a.png">

<br />

▶ 새로운 브랜치를 만들고, README.md의 내용의 출처를 추가하는 작업을 진행한다. <br />
$ git branch "README.md수정" <br />
$ git checkout README.md수정 <br />
<img width="539" alt="스크린샷 2021-05-08 오후 8 45 41" src="https://user-images.githubusercontent.com/40673012/117537820-5bd3cc00-b03e-11eb-8c62-120f0b50849b.png">

<img width="540" alt="스크린샷 2021-05-08 오후 8 45 54" src="https://user-images.githubusercontent.com/40673012/117537827-63937080-b03e-11eb-89a8-14237e5e1e4c.png">

▶ 수정한 내용을 스테이징 및 커밋한다. <br />
$ git commit -am "Markdown 튜토리얼 출처 추가"

<img width="543" alt="스크린샷 2021-05-08 오후 8 47 05" src="https://user-images.githubusercontent.com/40673012/117537858-8de52e00-b03e-11eb-854b-c9299c18f803.png">

<br />

### rebase
- 저장소 히스토리의 베이스를 재배치하는 명령어다. <br />

▶ 앗! 지금 생각하니 추가할 출처가 한 개 더 있었다. README.md 파일에 새로운 내용을 추가하고, 다시 스테이징 & 커밋 작업을 한다. <br />

<img width="542" alt="스크린샷 2021-05-08 오후 8 51 04" src="https://user-images.githubusercontent.com/40673012/117538002-1f54a000-b03f-11eb-869c-456e4cf6e30e.png">

$ git commit -am "Markdown 튜토리얼 출처 추가" 

<br />

▶ 이렇게 하면 문제점이 있다. 동일한 내용의 커밋이 두 개나 있어서 히스토리가 지저분해보인다. 이럴 때 rebase를 사용해서 히스토리의 베이스를 재배치할 수 있다. 아래 그림처럼 rebase 명령어를 사용하면 커밋 내용을 변경하는 화면이 등장한다. 이때 'pick'이라는 키워드를 s로 지우면 해당 커밋을 삭제할 수 있다. <br />
$ git rebase

<img width="539" alt="스크린샷 2021-05-08 오후 8 53 16" src="https://user-images.githubusercontent.com/40673012/117538069-6a6eb300-b03f-11eb-83e8-2f37c30eee0f.png">

▶ 위에서 수정한 내용을 저장하면, 커밋 메시지를 수정할 수 있는 화면이 등장한다. 이때, 중복되는 커밋 메시지를 한 개만 남기고 저장한다.

<img width="538" alt="스크린샷 2021-05-08 오후 8 55 13" src="https://user-images.githubusercontent.com/40673012/117538131-b15ca880-b03f-11eb-8413-461adf080d9a.png">

▶ 다시 커밋 히스토리를 확인하면 한결 깔끔해진 내용을 볼 수 있다. <br />
$ git log

<img width="539" alt="스크린샷 2021-05-08 오후 8 56 17" src="https://user-images.githubusercontent.com/40673012/117538157-d6511b80-b03f-11eb-8a51-f33c3c80685a.png">

▶ README.md수정 브랜치에서 수정한 내용을 master 브랜치로 이동하여 병합하자. <br />
$ git checkout master <br />
$ git merge README.md수정 <br />

<img width="538" alt="스크린샷 2021-05-08 오후 8 57 53" src="https://user-images.githubusercontent.com/40673012/117538206-11534f00-b040-11eb-9421-145ce1845acb.png">

<br />

▶ 마지막으로 Markdown-tutorial.md 파일을 생성하고,README.md 파일의 내용을 복사한다. 그리고 README.md 파일 내용을 지금까지 작성한 git 명령어에 대한 보고서 내용으로 변경한다. <br />
$ cp README.md Markdown-tutorial.md
$ git add -A
$ git commit -m "최종 커밋"

<img width="701" alt="스크린샷 2021-05-08 오후 9 02 47" src="https://user-images.githubusercontent.com/40673012/117538348-bec66280-b040-11eb-8206-be3d78d126da.png">


<img width="451" alt="스크린샷 2021-05-08 오후 9 05 19" src="https://user-images.githubusercontent.com/40673012/117538423-1a90eb80-b041-11eb-8554-58e63b627021.png">

▶ 이제 변경한 내용에 버전 변경 태그를 붙이고, push하여 원격 저장소를 수정한다. <br />
$ git tag -a v1.0.3 -m "version 1.0.3" <br />
$ git push

<img width="562" alt="스크린샷 2021-05-08 오후 9 04 26" src="https://user-images.githubusercontent.com/40673012/117538405-fa612c80-b040-11eb-922a-162ad269225a.png">


<br />

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
|push|o|[push 사용 위치](#push)|
|clone|o|[clone 사용 위치](#clone)|
|branch|o|[branch 사용 위치](#branch)|
|checkout|o|[checkout 사용 위치](#checkout)|
|log|o|[log 사용 위치](#log)|
|reset|o|[reset 사용 위치](#reset)|
|merge|o|[merge 사용 위치](#merge)|
|pull|o|[pull 사용 위치](#pull)|
|rebase|o|[rebase 사용 위치](#rebase)|

