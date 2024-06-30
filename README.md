# Gateway Server

## 📖 Description
- MSA로 구성된 BE 프로젝트의 API 호출 영역을 단일화 하기 위한 Gateway Server <br>
- 프로젝트에 적용된 JWT Token을 인증하기 위한 인증 서버로의 역할 <br>
- Spring Cloud Eureka Server와 연동되어, 각 요청별 적합한 서비스로의 로드밸렁싱 및 라우팅 처리. <br>
- 클라이언트에 직접적인 기능 Server 노출을 피하기 위한 프록시 서버로써의 역할. <br>
- 구성된 Server 별 API Test를 위한 공통 Swagger 설정 역할 <br>

## ⚙ Function
1. Eureka Server와 연동하여, Service Discovery 기능을 수행, 요청에 알맞은 각 서버로 라우팅
2. 라운드 로빈 전략을 사용하여, Gateway의 로드밸런싱 기능 수행.
3. 인증 필터를 사용하여, JWT Token 검증 기능 수행.
4. 기능 서버에 진입하는 단일 진입점으로써의 역할 수행 및 정책 관리 역할 수행.

## 🏴󠁧󠁢󠁥󠁮󠁧󠁿 Running
<p float="left">
    <img src="https://i.ibb.co/12dxbpH/3.png" width=500 />
</p>
   
## 🔧 Stack
 - **Language** : Java 17
 - **Library & Framework** : Spring Boot 3.2.5
 - **Database** : N/A
 - **ORM** : N/A
 - **Deploy** : AWS EC2 / Jenkins
 - **Dependencies** : Springdoc(Swagger), Spring Gateway  

## 🔧 Architecture
- **Design Patter** : N/A
- **Micro Service Architecture** : Spring Cloud
- **Event-Driven Architecture** : N/A

## 👨‍👩‍👧‍👦 Developer
*  **강성욱** ([KangBaekGwa](https://github.com/KangBaekGwa))
*  **김도형** ([ddohyeong](https://github.com/ddohyeong))
*  **박태훈** ([hoontaepark](https://github.com/hoontaepark))
