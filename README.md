# Java Core studying 
## Java Core lessons

## Java Core HomeWorks
### Seminar 01  

01. Task 01 HW
    01. [Application](/src/main/java/com/zergatstage/javacore/seminar01) in packages and its compilation  
    Commands: ```tree```  

        <details xmlns="http://www.w3.org/1999/html">
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
        command: java -classpath /java-core/out com.zergatstage.javacore.seminar01.Application
        volumes:
            - ./bin:/home/sb/java-core/src/main/java

    ```

    ```bash
    sudo docker-compose docker-compose-class.yaml up
    sudo docker-compose docker-compose-exec.yaml up
    
    ```
### Seminar 03
[Lists and solutions](src/main/java/com/zergatstage/javacore/seminar03/README.md)


### Seminar 04 Обработка исключений

1. Задача: Проверка логина и пароля

<details>
    <summary>   Условие    </summary>  
        1 - Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.  

2 - Длина login должна быть меньше 20 символов. Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.  

3 -Длина password должна быть меньше 20 символов. Также password и confirmPassword должны быть равны. Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.  

4 - WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.  

5 - В основном классе программы необходимо по-разному обработать исключения.  

6 - Метод возвращает true, если значения верны или false в другом случае.
</details>

> [Solution](.src/main/java/com/zergatstage/javacore/seminar04/App)  



2. Задача: Эмуляция интернет-магазина  

<details>
    <summary>Условие</summary>
    1 - написать классы покупатель, товар и заказ;</br>  
    2 - создать массив покупателей, массив товаров и массив заказов;</br>
3 - создать статический метод “совершить покупку” со строковыми параметрами, соответствующими полям объекта заказа. Метод должен вернуть объект заказа</br>
4 - Если в метод передан несуществующий покупатель, товар или отрицательное количество, метод должен выбросить соответствующее исключение;</br>
5 - Вызвать метод совершения покупки несколько раз таким образом, чтобы заполнить массив покупок возвращаемыми значениями. Обработать исключения.</br>
6 - Вывести в консоль итоговое количество совершённых покупок после выполнения приложения.</br>
</details>

> [Solution](.src/main/java/com/zergatstage/javacore/seminar04/App)  
