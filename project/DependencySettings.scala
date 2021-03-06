import sbt.Keys.libraryDependencies
import sbt._
import sbt.librarymanagement.{CrossVersion, ModuleID}

object DependencySettings {

  val commonDependencies: Seq[Def.Setting[Seq[ModuleID]]] = Seq(
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test,
    libraryDependencies += "com.github.ghik" % "silencer-lib" % "1.4.4" % Provided cross CrossVersion.full,
    libraryDependencies += compilerPlugin("com.github.ghik" % "silencer-plugin" % "1.4.4" cross CrossVersion.full),
  )

  val catsDependency = libraryDependencies += "org.typelevel" %% "cats-core" % "2.0.0"

  val catsEffectDependency = libraryDependencies += "org.typelevel" %% "cats-effect" % "2.0.0"

  val circeDependency = libraryDependencies += "io.circe" %% "circe-core" % "0.12.2"

  val argonautDependency = libraryDependencies += "io.argonaut" %% "argonaut" % "6.2.3"

  val spireDependency = libraryDependencies += "org.typelevel" %% "spire" % "0.17.0-M1"

  val catsTestKitDependency = libraryDependencies ++= List(
    "org.typelevel" %% "cats-testkit" % "2.0.0-M4" % Test,
  )

  val scalacheckDependency = libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.14.2"

}
