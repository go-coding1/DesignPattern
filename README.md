# 디자인 패턴 정리

> IDE : IntelliJ
>
> Java : java 11
>
> 각 패키지 안에 패키지명+Main으로 이루어진 클래스가 있습니다.
>
> Main함수에서 각 패키지에 있는 Main클래스의 객체를 생성해서 main()을 호출해 각 디자인 패턴을 실행 해 볼 수 있습니다.

### Singleton Pattern

Singleton 패턴은 어떠한 클래스(객체)가 유일하게 1개만 존재할 때 사용한다.

이를 주로 사용하는 곳은 서로 자원을 공유 할 때 사용하는데, 실물 세계에서는 프린터가 해당되며, 실제 프로그래밍에서는 TCP Socket 통신에서 서버와 연결된 connect 객체에 주로 사용한다.

예제

어떠한 서버와 통신하는 소켓이 있다고 가정했을 때, 이 소켓이 매번 새로 연결하는게 아니라 계속해서 연결한 상태의 소켓을 예로 든다.

> SocketClient.java
>
> ​	서버와 연결하는 Client 객체를 싱글톤으로 제공해주는 클래스
>
> AClazz.java
>
> ​	SocketClient.java로 부터 Client객체를 제공받아 사용하는 클래스
>
> BClazz.java
>
> ​	SocketClient.java로 부터 Client객체를 제공받아 사용하는 클래스



### Adapter pattern

Adapter는 실생활에서 100v를 220v로 변경해주거나, 그 반대로 해주는 흔히 돼지코 라고 불리는 변환기를 예로 들 수 있다.

호환성이 없는 기존 클래스의 인터페이스를 변환하여 재사용 할 수 있도록 한다.

SOLID중 개방폐쇄 원칙(OCP)를 따른다.

![image](https://user-images.githubusercontent.com/54675591/152748231-2acfe7bb-af7b-4c65-8cd9-6b28cb552cc9.png)

가운데 Adapter라는 클래스를 두고 변환 할 수 있게 한다.

```java
package com.company.design.adapter;

//220v를 110v로 변환해주는 Adapter 클래스 생성
public class SocketAdapter implements Electronic110V{
    private Electronic220V electronic220V;

    public SocketAdapter(Electronic220V electronic220V){
        this.electronic220V = electronic220V;
    }

    @Override
    public void powerOn() {
        electronic220V.connect();
    }
}

```

### Proxy pattern

Proxy는 대리인 이라는 뜻으로써, 뭔가를 대신 처리하는 것

Proxy Class를 통해서 대신 전달 하는 형태로 설계되면, 실제 Client는 Proxy로 부터 결과를 받는다.

Cache의 기능으로도 활용이 가능하다.

SOLID중에서 개방폐쇄원칙(OCP)과 의존 역전 원칙(DIP)를 따른다.

Spring에서 AOP가 이 패턴으로 만들어져 있다.

![image](https://user-images.githubusercontent.com/54675591/152752447-27bfd71f-7415-4f41-8b90-67076d0274e1.png)

### Decorator pattern

데코레이터 패턴은 기존 뼈대(클래스)는 유지하되, 이후 필요한 형태로 꾸밀 때 사용한다. 확장이 필요한 경우 상속의 대안으로도 활용한다. SOLID 중에서 개방폐쇄 원칙(OCP)과 의존 역전 원칙(DIP)를 사용한다.

현실 세계에서는 커피를 예로 들 수 있다. 아메리카노 + (우유)+카라멜 or아메리카노 + 시럽

원본을 유지하되 어떤 것을 첨가하면서 확장해가는 것

![image](https://user-images.githubusercontent.com/54675591/152766547-271ca2c5-f97e-4fe0-8957-3e23c88c0172.png)

### Observer pattern

관찰자 패턴은 변화가 일어 났을 때, 미리 등록된 다른 클래스에 통보해주는 패턴을 구현한 것이다. 많이 보이는 곳은 event listener에서 해당 패턴을 사용하고 있다.

![image-20220207193051506](/Users/ksj/Library/Application Support/typora-user-images/image-20220207193051506.png)

### Facade pattern

Facade는 건물의 앞쪽 정면 이라는 뜻을 가진다. 여러 개의 객체와 실제 사용하는 서브 객체의 사이에 복잡한 의존관계가 있을 때, 중간에 facade 라는 객체를 두고, 여기서 제공하는 interface만을 활용하여 기능을 사용하는 방식이다. Facade는 자신이 가지고 있는 각 클래스의 기능을 명확히 알아야 한다.

![image](https://user-images.githubusercontent.com/54675591/152812336-b40e7aa0-abdb-4992-8b42-d5ae54841fa8.png)