# prettier-gradle-plugin

![GitHub Release](https://img.shields.io/github/v/release/pierrickrouxel/prettier-gradle-plugin)
![GitHub Actions Workflow Status](https://img.shields.io/github/actions/workflow/status/pierrickrouxel/prettier-gradle-plugin/build.yaml)
[![Donate](https://img.shields.io/badge/donate-buy%20me%20a%20coffee-yellow?logo=buy-me-a-coffee)](https://www.buymeacoffee.com/pierrickrouxel)

Format your java projects with gradle.

## Compatibility

- Java >= 21

## Getting started

The plugin should be added to each project and module.

```groovy
plugins {
  id 'fr.pierrickrouxel.prettier'
  ...
}
```

## Usage

Check your format:

```sh
./gradlew prettier --check
```

Apply your format:

```sh
./gradlew prettier --write
```

## Thanks

This plugins exists thanks to the excellent [Node Gradle plugin](https://github.com/node-gradle/gradle-node-plugin).

Thank you for you job.
