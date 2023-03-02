![Spring](https://upload.wikimedia.org/wikipedia/commons/thumb/4/44/Spring_Framework_Logo_2018.svg/200px-Spring_Framework_Logo_2018.svg.png)
# Spring-Custom-Annotation
Let's learn java Spring's Annotation concept by making custom annotation

# What is Annotation ?
- Annotation(어노테이션)은 자바의 유용한 구문중 하나이며, 사용자가 직접 만들어 낼 수도 있다.
- 소스 코드에 metadata를 표현한다는 것에 본질적인 목적이 있으며, Reflection(리플렉션)을 이용하면 어노테이션 지정만으로도 원하는 클래스를 주입할 수 있다. 스프링은 이를 이용하여 의존성 주입(DI: Dependency Injection)을 구현한다.

# Built-in Annotation 
###### 자바에서 기본적으로 제공하는 어노테이션들이 존재한다.
- @Override : 메소드가 잘 오버라이드 되었는지 확인한다. 부모 클래스의 구현해야할 메소드를 모두 구현했는지 확인한다.
- @Deprecated : 메소드를 사용하지 않도록 유도하고, 만약 사용했다면 컴파일 경고를 일으킨다.
- @SuppressWarnings : 컴파일 경고를 무시하도록 한다.
- @SafeVarargs : Generic 같은 가변인자 매개변수를 사용할 때 경고를 무시하도록 한다.
- @FunctionalInterface : Lambda 함수 등을 위한 인터페이스를 지정한다. 메소드가 없거나 두 개 이상이면 에러가 난다.

# Imported interface
- java.lang.Annotation

# Component Annotation
### @Target : 적용 대상
- ElementType.TYPE : Class, Interface, Enum
- ElementType.FIELD : instance variable (멤버 변수: 클래스에 정의된 변수)
- ElementType.METHOD : 메서드
- ElementType.PARAMETER : 파라미터
- ElementType.CONSTRUCTOR : 생성자
- ElementType.LOCAL_VARIABLE : 지역변수
- ElementType.ANNOTATION_TYPE : 어노테이션
- ElementType.PACKAGE : 패키지
### @Retention : 지속 시간
- @RetentionPolicy.SOURCE : compile 후 정보가 사라진다.
- @RetentionPolicy.CLASS : (default) compile 타임 때만 .class 정보가 존재한다.
- @RetentionPolicy.RUNTIME : compile 이후 runtime 시에도 .class 파일에 존재한다.
###### ![@Retention](https://github.com/DaeAkin/java-custom-annotation/blob/master/docs/javacompiler.png?raw=true)
###### [이미지 및 참조BLOG](https://donghyeon.dev/spring/2020/08/18/Spring-Annotation%EC%9D%98-%EC%9B%90%EB%A6%AC%EC%99%80-Custom-Annotation-%EB%A7%8C%EB%93%A4%EC%96%B4%EB%B3%B4%EA%B8%B0/)
### @interface : 어노테이션 명
