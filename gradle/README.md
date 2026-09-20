# Gradle basics

Status: **IN PROGRESS**

The generated learning project is [Gradle-SampleApp](Gradle-SampleApp). It was
created with:

```text
Project type: Application
Language: Java
Target Java version: 21
Structure: Single application project
Build DSL: Groovy
Testing: JUnit Jupiter
New/incubating APIs: No
```

This Java 21 choice applies only to the learning project. The FMS-GPS work
backend still targets **Java 8**.

## `gradle init`

```bash
gradle init
```

Initialization means Gradle generated the starting build structure: settings,
build scripts, wrapper files, source folders, a sample application, and a test.
It did not merely create one Java class.

Important generated files:

```text
Gradle-SampleApp/
├── settings.gradle
├── gradlew
├── gradlew.bat
├── gradle/wrapper/
└── app/
    ├── build.gradle
    └── src/
```

`settings.gradle` names the build and includes the `app` project.
`app/build.gradle` applies plugins, declares repositories/dependencies, selects
Java 21, and identifies the main class.

## Gradle Daemon

When Gradle printed:

```text
Starting a Gradle Daemon
```

it started a reusable background Gradle process. Keeping a warm JVM and cached
build information makes later builds faster. It is a build tool process—not the
application server and not part of the resulting program.

## Tasks

A Gradle task is one named unit of build work. `gradle tasks` lists tasks made
available by Gradle and the applied plugins.

The useful tasks for now are:

| Task | Purpose |
| --- | --- |
| `run` | compile and run the configured application |
| `build` | compile, test, and assemble the project |
| `assemble` | create build outputs without running all verification |
| `clean` | delete generated `build/` output |
| `jar` | package compiled application classes/resources as a JAR |
| `test` | run automated tests |
| `check` | run verification tasks, including tests |
| `dependencies` | display resolved dependency graphs |
| `tasks` | list available tasks |
| `wrapper` | generate/update Gradle Wrapper files |

Do not memorize every task group. Plugins add tasks, and you can inspect them
when a project needs them.

## What happened during `gradle run`

```text
> Task :app:run
Hello World!
BUILD SUCCESSFUL
```

- `:app:run` means Gradle ran the `run` task belonging to the included `app`
  project.
- `Hello World!` is output from `org.example.App.main()`.
- `BUILD SUCCESSFUL` means every required task completed without failure.

## Installed Gradle vs the Wrapper

```bash
gradle build
```

uses whichever Gradle installation is available on your machine.

```bash
./gradlew build
```

uses the project's Gradle Wrapper. The wrapper downloads/uses the exact Gradle
version recorded in `gradle-wrapper.properties`—currently 9.7.1 in this sample.
It gives developers and CI the same Gradle version, so it is normally preferred.

Run these from `gradle/Gradle-SampleApp`:

```bash
./gradlew tasks
./gradlew run
./gradlew test
./gradlew build
./gradlew dependencies
```

## macOS/Linux vs Windows

On macOS or Linux:

```bash
./gradlew run
```

On Windows Command Prompt/PowerShell:

```text
gradlew.bat run
```

`gradlew.bat run` failed in macOS/zsh because `.bat` is a Windows batch file.
Typing only `gradlew` may also fail on Unix because the current directory is not
normally searched for executables. `./gradlew` explicitly means “run the file
named `gradlew` from this directory.”

## Modern Gradle vs the work repository

This learning sample uses modern Gradle 9.x conventions:

```groovy
dependencies {
    implementation libs.guava
    testImplementation libs.junit.jupiter
}
```

The older Spring Boot 2.1.2 work repository may contain configurations such as:

```groovy
dependencies {
    compile 'some:production:dependency:version'
    testCompile 'some:test:dependency:version'
}
```

Understand both when reading code:

- `implementation` and `testImplementation` are modern configuration names.
- `compile` and `testCompile` are older syntax seen in legacy builds.
- Do not blindly modernize the work build while merely trying to understand it;
  upgrading Gradle/Spring is a separate, potentially breaking project.

## Scope for this phase

Focus on:

- `settings.gradle` and `build.gradle`;
- plugins;
- repositories and dependencies;
- wrapper usage;
- modern versus legacy dependency configurations; and
- running `build`, `test`, `run`, and `dependencies`.

Advanced custom task authoring can wait.

