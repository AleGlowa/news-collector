import Settings.*

ThisBuild / name         := "news-collector"
ThisBuild / version      := "0.1"
ThisBuild / scalaVersion := "3.3.0"

lazy val domain =
  project
    .settings(commonSettings)
    .settings(libraryDependencies ++= domainDependencies)

lazy val root =
  (project in file("."))
    .aggregate(domain)
