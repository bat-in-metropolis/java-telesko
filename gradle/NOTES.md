# My Gradle notes

These are my notes for the Gradle project I generated while learning Java. I
selected:

```text
Project type: Application
Language: Java
Target Java version: 21
Structure: Single application project
Build DSL: Groovy
Testing: JUnit Jupiter
New/incubating APIs: No
```

My work backend and this learning project are not identical. I use Java 21 and
modern Gradle here, while the FMS-GPS work backend uses Java 8 and an older
Gradle setup.

## My actual project structure

```text
gradle/                              <- root of my Gradle learning project
├── settings.gradle                 <- names the build and includes app
├── gradle.properties               <- build-wide Gradle settings
├── gradlew                          <- wrapper command for macOS/Linux
├── gradlew.bat                      <- wrapper command for Windows
│
├── gradle/                          <- Gradle support files, not Java source
│   ├── libs.versions.toml           <- dependency names and versions
│   └── wrapper/
│       ├── gradle-wrapper.jar       <- program that starts the wrapper
│       └── gradle-wrapper.properties<- Gradle version and download location
│
└── app/                             <- my Java application subproject
    ├── build.gradle                 <- instructions for building my app
    └── src/
        ├── main/
        │   ├── java/
        │   │   └── org/example/App.java
        │   └── resources/           <- app configuration and other resources
        └── test/
            ├── java/
            │   └── org/example/AppTest.java
            └── resources/           <- files used only by tests
```

I have two folders named `gradle`, but they have different jobs:

```text
repository/gradle/           = my complete Gradle learning project
repository/gradle/gradle/    = Gradle's conventional support directory
```

The inner `gradle/` directory is not another application. It contains the
version catalog and wrapper files used by my build.

## Why my layout differs from the screenshot

The screenshot shows this simpler layout:

```text
my-project/
├── build.gradle
├── settings.gradle
└── src/
```

My generated project uses a root build containing one `app` subproject:

```text
Gradle-SampleApp/             <- root build
├── settings.gradle
└── app/                      <- subproject
    ├── build.gradle
    └── src/
```

Both layouts are valid. Although I selected a single application project,
Gradle generated one root build plus one application subproject. This is why my
Java source code and application build file are inside `app/`.

## Root build and `app` subproject

My `settings.gradle` contains:

```groovy
rootProject.name = 'Gradle-SampleApp'
include('app')
```

I read this as:

- `Gradle-SampleApp` is the name of my complete build.
- `app` is the Java application included in that build.
- `app/build.gradle` contains the build instructions for that application.

When Gradle prints:

```text
> Task :app:run
```

I read it as:

```text
:app       -> the project/subproject named app
:run       -> the task named run inside app
```

## I am using the Groovy DSL

My current files are:

```text
settings.gradle
app/build.gradle
```

The `.gradle` extension means I am using Gradle's **Groovy DSL**. My previous
project used the Kotlin DSL, whose files ended in `.gradle.kts`.

The same dependency looks slightly different in the two DSLs:

```groovy
// Groovy DSL: build.gradle
implementation 'group:name:version'
```

```kotlin
// Kotlin DSL: build.gradle.kts
implementation("group:name:version")
```

I now write Groovy syntax in this learning project. I do not add `.kts` or copy
Kotlin-DSL syntax into these files.

## What each file means to me

| File or folder | How I understand it | What I normally do with it |
| --- | --- | --- |
| `settings.gradle` | Defines the build name and included projects | I edit it when projects or build-wide settings change |
| `app/build.gradle` | Defines plugins, repositories, dependencies, Java version, tests, and the main class | This is my main Gradle file to learn and edit |
| `gradle.properties` | Stores settings that affect Gradle itself | I usually leave it alone while learning the basics |
| `gradle/libs.versions.toml` | Stores reusable dependency names and versions | I edit it when changing catalog-managed dependencies |
| `gradlew` | Starts the project-selected Gradle version on macOS/Linux | I run it but normally do not edit it |
| `gradlew.bat` | Windows version of the wrapper command | I do not use it on macOS |
| `gradle/wrapper/gradle-wrapper.properties` | Declares the Gradle distribution/version | I read it and update it deliberately through Gradle |
| `gradle/wrapper/gradle-wrapper.jar` | Bootstrap program used by the wrapper | I commit it but do not manually edit it |
| `app/src/main/java` | My application Java source code | I write application classes here |
| `app/src/main/resources` | Configuration and files needed by the running app | I add resources here when required |
| `app/src/test/java` | My automated test source code | I write tests here |
| `app/src/test/resources` | Configuration and files needed only by tests | I add test-only resources here |
| `.gradle/` | Local Gradle cache and state | Generated: I do not edit or commit it |
| `build/` and `app/build/` | Compiled classes, JARs, reports, and test results | Generated: I do not edit or commit them |

## What my `app/build.gradle` currently says

### Plugins

```groovy
plugins {
    id 'application'
}
```

The `application` plugin tells Gradle that this project is a runnable Java
application. It adds useful tasks such as `run` and distribution tasks.

### Repositories

```groovy
repositories {
    mavenCentral()
}
```

This tells Gradle where it can download external libraries. Maven Central is a
public repository containing Java libraries; it is unrelated to whether I use
Gradle or Maven as my build tool.

### Dependencies

```groovy
dependencies {
    testImplementation libs.junit.jupiter
    testRuntimeOnly 'org.junit.platform:junit-platform-launcher'
    implementation libs.guava
}
```

I read these configurations as:

- `implementation`: the application needs this library to compile and run.
- `testImplementation`: my test code needs this library to compile and run.
- `testRuntimeOnly`: tests need this component only while executing.
- `libs.guava` and `libs.junit.jupiter`: aliases declared in
  `gradle/libs.versions.toml`.

The version catalog turns a long coordinate such as a group, artifact, and
version into a shorter reusable name.

### Java toolchain

```groovy
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}
```

This asks Gradle to build the learning application with Java 21. It does not
mean the FMS-GPS work backend has changed from Java 8.

### Main class

```groovy
application {
    mainClass = 'org.example.App'
}
```

This tells the `run` task which class contains the application's `main()`
method.

### Tests

```groovy
tasks.named('test') {
    useJUnitPlatform()
}
```

This configures Gradle's `test` task to run JUnit Jupiter tests through the
JUnit Platform.

## What happens when I run the application

I first move into the Gradle project directory:

```bash
cd gradle
```

Then I run:

```bash
./gradlew run
```

The approximate flow is:

```text
I execute ./gradlew
        |
        v
the wrapper reads gradle/wrapper/gradle-wrapper.properties
        |
        v
it obtains and starts Gradle 9.7.1
        |
        v
Gradle reads settings.gradle and discovers app
        |
        v
Gradle reads app/build.gradle
        |
        v
Gradle compiles app/src/main/java
        |
        v
Gradle runs org.example.App
        |
        v
I see Hello World! and BUILD SUCCESSFUL
```

`BUILD SUCCESSFUL` means all tasks required by that command completed. It does
not necessarily mean every possible project task was run.

## What the Gradle Wrapper is

The wrapper consists of:

```text
gradlew
gradlew.bat
gradle/wrapper/gradle-wrapper.jar
gradle/wrapper/gradle-wrapper.properties
```

It lets this project choose a specific Gradle version. I do not need to
manually install that exact Gradle version before working with the project.

On macOS/Linux I use:

```bash
./gradlew build
```

On Windows I would use:

```text
gradlew.bat build
```

On macOS, `gradlew.bat` fails because `.bat` is a Windows batch file. I also use
`./gradlew`, not just `gradlew`, because Unix shells normally do not search the
current directory for executable files. The `./` explicitly means "use the
file in my current directory."

## `gradle` versus `./gradlew`

```bash
gradle build
```

This uses the Gradle version installed globally on my computer.

```bash
./gradlew build
```

This uses the version declared by the project wrapper. I normally prefer the
wrapper because everyone working on the repository gets a consistent Gradle
version.

I needed a globally installed `gradle` command to initially run `gradle init`.
After the wrapper exists, I normally use `./gradlew` for project commands.

## Tasks I will use most often

A Gradle task is a named unit of work. I can see available tasks with:

```bash
./gradlew tasks
```

The main tasks I care about are:

| Task | What I use it for |
| --- | --- |
| `run` | Compile and run my application |
| `build` | Compile, test, check, and package the project |
| `assemble` | Create build outputs without running the full verification lifecycle |
| `clean` | Delete generated build output |
| `jar` | Create the application's JAR file |
| `test` | Compile and run automated tests |
| `check` | Run verification tasks, including tests |
| `dependencies` | Display the dependency tree |
| `tasks` | Display available tasks |
| `wrapper` | Generate or update Gradle Wrapper files |

Examples:

```bash
./gradlew run
./gradlew test
./gradlew build
./gradlew clean
./gradlew dependencies
```

## Where I go when I want to change something

```text
Add or change a dependency       -> app/build.gradle or gradle/libs.versions.toml
Change the Java version          -> app/build.gradle
Change the main class            -> app/build.gradle
Add Java application code        -> app/src/main/java
Add a unit test                  -> app/src/test/java
Change the project name          -> settings.gradle
See dependency aliases/versions  -> gradle/libs.versions.toml
See the Gradle version           -> gradle/wrapper/gradle-wrapper.properties
Delete generated output          -> ./gradlew clean
```

## My learning project versus my work backend

| | My learning project | FMS-GPS work backend |
| --- | --- | --- |
| Java | 21 | 8 |
| Gradle | Modern Gradle 9.7.1 | Older Gradle generation |
| DSL | Modern Groovy (`.gradle`) | Groovy (`.gradle`) |
| Dependency syntax | `implementation`, `testImplementation` | May use `compile`, `testCompile` |

Both projects use the Groovy DSL now, but their Gradle versions still matter.
Modern Gradle generally uses:

```groovy
implementation 'group:name:version'
testImplementation 'group:name:version'
```

The older work build may contain:

```groovy
compile 'group:name:version'
testCompile 'group:name:version'
```

I need to recognize the old syntax to read the work repository. I should not
copy `compile` into the modern learning project, and I should not upgrade the
work build casually because old Spring Boot and Gradle versions can be tightly
coupled.

## My memory shortcut

```text
settings.gradle              = What projects belong to my build?
app/build.gradle             = How is my app built?
app/src/main                 = My application code and resources
app/src/test                 = My test code and resources
gradlew + gradle/wrapper     = Which Gradle version runs?
build directories           = Generated results
```
