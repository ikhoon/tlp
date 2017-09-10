name := "tlp"

version := "0.1"

//scalaOrganization := "org.typelevel"
//
//scalaVersion := "2.12.3-bin-typelevel-4"

scalaVersion := "2.12.3"

scalacOptions ++= Seq(
  "-Xfatal-warnings",
  "-language:higherKinds",
  "-language:implicitConversions"
//  "-Yliteral-types"
)

initialCommands in console := """import tlp._"""
