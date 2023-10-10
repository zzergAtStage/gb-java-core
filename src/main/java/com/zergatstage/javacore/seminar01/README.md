### Seminar 01

01. Task 01 HW
    01. [Application](/src/main/java/com/zergatstage/javacore/seminar01) in packages and its compilation  
        Commands: ```tree```
        <details>
            <summary> Tree of the project: </summary>
        <pre>
            C:.
            ├───docs
            │   ├───com
            │   │   └───zergatstage
            │   │       └───javacore
            │   │           └───lesson01
            │   │               └───solutions
            │   ├───legal
            │   ├───resources
            │   └───script-dir
            │       └───images
            ├───out
            │   ├───com
            │   │   └───zergatstage
            │   │       └───javacore
            │   │           └───lesson01
            │   │               └───solutions
            │   └───production
            │       └───gb-java-core
            │           ├───com
            │           │   └───zergatstage
            │           │       └───javacore
            │           │           ├───lesson01
            │           │           │   └───solutions
            │           │           └───seminar01
            │           │               ├───controllers
            │           │               ├───model
            │           │               └───resource
            │           ├───META-INF
            │           └───resource
            ├───resource
            └───src
            └───main
            └───java
            ├───com
            │   └───zergatstage
            │       └───javacore
            │           ├───lesson01
            │           │   └───solutions
            │           └───seminar01
            │               ├───controllers
            │               └───model
            └───META-INF
            </pre>  </details>

        ```shell
        javac -cp ./src/main/java -d ./out/ .\src\main\java\com\zergatstage\javacore\seminar01\Application.java
        
         C:\App\jdk-18.0.2\bin\java -classpath ./out/ com.zergatstage.javacore.seminar01.Application  
        ```
        (some notes: JAVA_HOME is set to Java 1.8 - but project is 18.0)

    02. Javadoc:
    ```shell
    sb@sb-srv-local:~/java-core$ javadoc -d docs -sourcepath ./src/main/java/ -cp ./out/ -subpackages com   
    ```   


02. Task 02 HW:  
    docker-compose-class.yaml:
    ```docker  
    services:
        app:
        image: bellsoft/liberica-openjdk-alpine:11.0.16.1-1
        command: javac -sourcepath ./src -d ./out ./com/zergatstage/javacore/seminar01/Application.java

        volumes:
            - ./bin:/home/sb/java-core/out
            - ./src:/home/sb/java-core/src/main/java
    ```
    docker-compose-exec.yaml:
    ```docker  
    services:
        app:
        image: bellsoft/liberica-openjdk-alpine:11.0.16.1-1
        command: java -classpath /java-core/out ru.gb.jcore.sample.Main
        volumes:
            - ./bin:/java-core/out com.zergatstage.javacore.seminar01.Application

    ```

    ```bash
    sudo docker-compose docker-compose-class.yaml up
    sudo docker-compose docker-compose-exec.yaml up
    
    ```
