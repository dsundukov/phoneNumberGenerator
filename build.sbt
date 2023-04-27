name := "phoneNumberGenerator"

version := "0.1"

scalaVersion := "2.13.6"

resolvers += MavenCache("local-maven", file("path/to/maven-repo/releases"))

libraryDependencies ++= Seq("com.softwaremill.sttp.client3" % "json-common_sjs1_2.11" % "3.2.3",
                            "com.typesafe" % "config" % "1.2.1","org.scalaj" % "scalaj-http_2.11" % "2.3.0"

)