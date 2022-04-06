# Appium Java Selenium framework
## Programs needed to be installed

```sh
1. Android studio SDK
2. Appium server
3. Java 
4. JDK
```
### For the installation of the needed programs you can use this links (commands)
| Program | cmd or download link                                            |
|---------|-----------------------------------------------------------------|
| Android | [Download Android Studio and SDK](https://developer.android.com/studio) |
| Appium  | `npm install -g appium`                                         |
| Java    | [Java Download](https://www.java.com/en/download/windows_offline.jsp) |
| JDK     | [JDK Download](https://www.oracle.com/java/technologies/downloads/) |
### You can use these commands to check is the programs installed successfully 

| Program | commands line            |
|---------|--------------------------|
| Android | `avdmanager list target` |
| Appium  | `appium-doctor`          |
| Java    | `java -version`          |
| JDK     | ` javac -version`        |



## How to run the tests
Open android studio, select appropriate emulator. Open project in editor, in the terminal enter the command `appium --relaxed-security`, 
click on the run button in the editor.

