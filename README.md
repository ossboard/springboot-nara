# 빌드방법

### 개발툴 설정방법
``` 
설정 > Build,Execution,Deployment > Build Tools > Gradle > 
  * Build and run using: "Gradle(Default)" -> "Intellij IDEA" 로 변경
  * Run tests using: "Gradle(Default)" -> "Intellij IDEA" 로 변경
    "Apply" & "OK" 버튼
```

### 오라클데이타 테이블생성및 추가
``` 
DROP TABLE demo_table ;
CREATE TABLE demo_table
(
    idx     int default 0,
    title   varchar(255),
    content varchar(4000)
);
INSERT INTO demo_table(idx, title, content) VALUES (1, 'title1', 'content1');
INSERT INTO demo_table(idx, title, content) VALUES (2, 'title2', 'content2');
INSERT INTO demo_table(idx, title, content) VALUES (3, 'title3', 'content3');
INSERT INTO demo_table(idx, title, content) VALUES (4, 'title4', 'content4');
INSERT INTO demo_table(idx, title, content) VALUES (5, 'title5', 'content5');
commit;
```

### 콘솔 빌드밋 테스트 방법
```
$ java -version (자버버전 확인, 1.8이상)

$ ./gradlew clean build  (맥)
$ gradlew.bat clean build (윈도우)

$ java -jar build/libs/demo-1.0.war <--소스안에 내장tomcat을 이용해서 명령어로 웹서버 구동가능  
http://127.0.0.1:9090/nara

```

### 참고사이트
``` 
https://getbootstrap.com/docs/4.0/components/modal/
jsp문법아님!, Thymeleaf 문법임 ( 스프링 버전이 올라면서, 보안취약으로 jsp를 지원안함,쓰려면 억지로 사용할수는 있음 )
** 참고로, 코난에서 개발할때는 Thymeleaf + mustache 구조로 작업합니다. 좀더 복잡해서 데모는 간단하게만 작성했습니다.
https://chung-develop.tistory.com/5
```
