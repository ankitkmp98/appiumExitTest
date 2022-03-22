
## Testing ApiDemos-debug ApplicationTesting features of ApiDemos-debug.apk mobile application using Appium.
## DescriptionIt is a BDD based framework using Cucumber. For testing mobile application using Appium, Java, TestNg, Cucumber etc.We are written some test cases for testing some of the features of the application.

### All the test cases are written in Feature File and its crossponding Step Defination. Then we run the the code through TestRunner and Maven.Here is some exmaple of Feature File test cases.

#### TestCase 1 – Verify operation of hiding numbers
 given tag = @hide

#### TestCase 2 – Verify operation of showing numbers
given tag = @show

#### TestCase 3 – Verify cloning operation
given tag = @cloning

#### TestCase 3 – Verify Custom evaluator operation
given tag = @custom

#### TestCase 3 – Verify loading operation
given tag = @loading

#### TestCase 3 – Verify multiple properties operation
given tag = @multiple



### Dependencies
We are using maven dependencies in our [pom.xml](https://github.com/ankitkmp98/appiumExitTest/blob/d624a0a644bacd210a810d8c72b6689f67af3f52/pom.xml) file. Please refer this link for all the POM dependencies are needed.### Built With* [Appium](https://github.com/appium/appium-desktop/releases/tag/v1.18.0-1)

* [TestNG](https://mvnrepository.com/artifact/org.testng/testng)
* [Maven](https://maven.apache.org/download.cgi )
* [Java](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html )
* [Cucumber](https://cucumber.io/docs/installation/java/)

### Executing program

###* To run the program```

Click src/test/java --> TestRunner --> TestRunner.java
#### ** To run single feature file
#####* Use tags = @tag_name
* e.g @hide, @show, @cloning, @custom, @multiple and @loading


####* To run all feature file
#####* Use tag = @flag


### Contact Ankit Kumar Pandey -
#### [@GitUb](https://github.com/ankitkmp98) - [@Gmail](ankitkmp1998@gmail.com@gmial.com) 
#### Project Link(https://github.com/ankitkmp98/appiumExitTest.git)
#### Application[ApiDemos-debug.apk](https://github.com/ankitkmp98/appiumExitTest/blob/d624a0a644bacd210a810d8c72b6689f67af3f52/Test%20app/ApiDemos-debug.apk)
#### Acknowledgments[Youtube](https://www.youtube.com/c/pavanoltraining)[Stackoverfow](https://stackoverflow.com/)[Toolsqa](https://www.toolsqa.com/extent-report/extent-report-for-cucumber-testng-project/)






