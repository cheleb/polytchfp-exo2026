val scala3Version = "3.9.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "polytchfp-exo2026",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
      // Basic Scala tests (phases 1-3)
      "org.scalameta" %% "munit" % "1.3.6" % Test,
      // ZIO runtime + tests (phase 4)
      "dev.zio" %% "zio" % "2.1.26",
      "dev.zio" %% "zio-streams" % "2.1.26",
      "dev.zio" %% "zio-test" % "2.1.26" % Test,
      "dev.zio" %% "zio-test-sbt" % "2.1.26" % Test
    ),

    // Register ZIO Test as a test framework so `sbt test` picks it up
    testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")
  )