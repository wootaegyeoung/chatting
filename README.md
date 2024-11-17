# chatting
# 채팅 애플리케이션

이 프로젝트는 Spring Boot와 Redis를 사용하여 실시간 채팅 기능을 구현한 애플리케이션입니다. WebSocket을 통해 클라이언트와 서버 간의 실시간 통신을 지원하며, Redis를 사용하여 메시지를 저장하고 관리합니다.

## 기능

- 실시간 메시지 전송
- 메시지 저장 및 조회
- WebSocket을 통한 실시간 통신

## 기술 스택

- Java
- Spring Boot
- Spring WebSocket
- Spring Data Redis
- Redis


## 설치 방법

1. **Redis 설치**: Redis 서버를 설치하고 실행합니다. 로컬에서 Docker를 사용할 수 있습니다.
   ```bash
   docker run --name redis -d -p 6379:6379 redis
프로젝트 클론:

bash


git clone <repository-url>
cd chat-application
Gradle 빌드: 채팅 서비스 디렉토리에서 Gradle을 사용하여 빌드합니다.

bash


cd chat-service
./gradlew build
실행 방법
채팅 서비스를 실행합니다.

채팅 서비스 실행:
bash


./gradlew bootRun

