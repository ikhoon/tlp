name := "tlp"

version := "0.1"

scalaOrganization := "org.typelevel"

scalaVersion := "2.12.3-bin-typelevel-4"


scalacOptions ++= Seq(
//  "-Yinduction-heuristics",       // speeds up the compilation of inductive implicit resolution
//  "-Ykind-polymorphism",          // type and method definitions with type parameters of arbitrary kinds
  "-Yliteral-types",              // literals can appear in type position
//  "-Xstrict-patmat-analysis",     // more accurate reporting of failures of match exhaustivity
//  "-Xlint:strict-unsealed-patmat" // warn on inexhaustive matches against unsealed traits
)