# Tap
[![Build Status](https://travis-ci.org/noonmaru/tap.svg?branch=master)](https://travis-ci.org/noonmaru/tap)
[![JitPack](https://jitpack.io/v/noonmaru/tap.svg)](https://jitpack.io/#noonmaru/tap)

## Kotlin으로 작성된 Paper 라이브러리
#### 지원 기능
 * 개체 패킷
 * 가상 개체
 * 가상 발사체
 * 모장 프로필
 * 개체별 이벤트 리스너
 * YamlConfiguration을 이용한 문자열 템플릿
 * 추가적인 인벤토리 함수
 * GitHub를 통한 업데이트 (BETA)
 
### Gradle
```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}

...
dependencies {
    implementation 'com.github.noonmaru:tap:Tag'
}
```
### NOTE
* Tap의 Packet 패키지를 이용하기 위해선 [ProtocolLib](https://github.com/dmulloy2/ProtocolLib/releases) 을 필요로 합니다.
* ~~내부 코드 변경이 잦아 3.0.0 버전 이후로는 독립형을 지향하기 위해 플러그인이 아닌 라이브러리로만 지원할 예정입니다.~~
    * 빌드 버전이 필요하신 분들이 계셔서 플러그인 아티팩트도 빌드 할 수 있는 개발환경을 구축했습니다.
    * 플러그인 구현체가 필요하신분은 ./gradlew paperJar 태스크를 이용해 빌드하세요.
    * 하지만 가능하다면 [ShadowJar](https://github.com/johnrengelman/shadow) 플러그인을 사용해 FatJar로 빌드하세요.

* Tap의 개발환경 구축을 위해선 spigot 1.13.2-1.16.2 가 필요합니다. [BuildTools](https://www.spigotmc.org/wiki/buildtools/) 를 이용해 로컬 메이븐 저장소에 spigot을 배포하세요.
* 터미널에서 docker-compose up --build \[-d] 명령으로 docker를 구성 할 수 있습니다.
    * 컨테이너의 볼륨은 `./docker/`에 위치합니다.
    * 컨테이너 생성 후 플러그인을 ./gradlew copyPaperJarToDocker 태스크로 볼륨에 복사할 수 있습니다.