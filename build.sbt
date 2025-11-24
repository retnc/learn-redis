import scala.collection.Seq

Global / onChangedBuildSource := ReloadOnSourceChanges

name := "scala-template"
version := "0.0.1"

scalaVersion := "2.13.17"

javacOptions := Seq("-source", "17", "-target", "17")

scalacOptions ++= Seq(
  "-encoding",
  "UTF-8",
  "-feature",
  "-deprecation",
  "-unchecked",
  "-language:postfixOps",
  "-language:higherKinds",
  "-language:existentials",
  "-Wconf:cat=other-match-analysis:error",
  "-Wunused",
  "-Ymacro-annotations",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Ywarn-dead-code",
  "-Yrepl-class-based"
)

libraryDependencies ++= Seq(
  /** some useful plugin things */
  compilerPlugin("org.typelevel" %% "kind-projector"     % "0.13.4" cross CrossVersion.full),
  compilerPlugin("com.olegpy"    %% "better-monadic-for" % "0.3.1"),
  "io.lettuce"         % "lettuce-core"                    % "6.8.1.RELEASE",
  "io.netty"           % "netty-resolver-dns-native-macos" % "4.1.118.Final" classifier "osx-aarch_64", // should correspond to lettuce transitive
  "ch.qos.logback"     % "logback-classic"                 % "1.5.21",
  "co.fs2"            %% "fs2-io"                          % "3.12.2",
  "io.circe"          %% "circe-parser"                    % "0.14.15",
  "io.circe"          %% "circe-generic-extras"            % "0.14.4",
  "org.http4s"        %% "http4s-dsl"                      % "0.23.33",
  "org.http4s"        %% "http4s-circe"                    % "0.23.33",
  "org.http4s"        %% "http4s-blaze-server"             % "0.23.17",
  "org.http4s"        %% "http4s-blaze-client"             % "0.23.17",
  "org.scalatest"     %% "scalatest"                       % "3.2.19",
  "org.scalacheck"    %% "scalacheck"                      % "1.19.0",
  "org.scalatestplus" %% "scalacheck-1-18"                 % "3.2.19.0",
  "org.mockito"       %% "mockito-scala-scalatest"         % "2.0.0",
  "com.lihaoyi"       %% "pprint"                          % "0.9.5"
)
