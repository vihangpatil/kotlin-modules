# Developer guidelines

## Checking for dependency updates

```bash
./gradlew dependencyUpdates -Drevision=release
```

## Checking for dependency resolution

```bash
./gradlew :prime:dependencyInsight --configuration runtimeClasspath --dependency dependency-name
```

