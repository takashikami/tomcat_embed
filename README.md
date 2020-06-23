# Tomcat-9 組み込みプログラムサンプル

## 実行方法
```bash
kami@SN11755W:~/workspace/tomcat_embed$ ./gradlew jar
Starting a Gradle Daemon (subsequent builds will be faster)

Deprecated Gradle features were used in this build, making it incompatible with Gradle 7.0.
Use '--warning-mode all' to show the individual deprecation warnings.
See https://docs.gradle.org/6.1.1/userguide/command_line_interface.html#sec:command_line_warnings

BUILD SUCCESSFUL in 7s
2 actionable tasks: 2 executed
kami@SN11755W:~/workspace/tomcat_embed$ java -jar build/libs/tomcat_embed-1.0-SNAPSHOT.jar
org.example.HelloServlet
/tmp/tomcatBase
Jun 23, 2020 7:15:37 AM org.apache.coyote.AbstractProtocol init
INFO: Initializing ProtocolHandler ["http-nio-8080"]
Jun 23, 2020 7:15:37 AM org.apache.catalina.core.StandardService startInternal
INFO: Starting service [Tomcat]
Jun 23, 2020 7:15:37 AM org.apache.catalina.core.StandardEngine startInternal
INFO: Starting Servlet engine: [Apache Tomcat/9.0.36]
Jun 23, 2020 7:15:37 AM org.apache.coyote.AbstractProtocol start
INFO: Starting ProtocolHandler ["http-nio-8080"]
```

```bash
kami@SN11755W:~$ curl localhost:8080/hello/Hello
Served at: /hello

```

## 参考
https://github.com/jyeary/tomcat-9-embedded/blob/master/src/main/java/com/bluelotussoftware/tomcat/embedded/Main.java
