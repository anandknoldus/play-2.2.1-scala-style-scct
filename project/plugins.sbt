// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository 
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.2.1")

// Scala Style Plugin
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.3.2")

// SCCT Plugin
addSbtPlugin("com.github.scct" %% "sbt-scct" % "0.2.1")
