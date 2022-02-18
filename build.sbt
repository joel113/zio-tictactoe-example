name := "zio-tictactoe-example"

version := "0.1"

scalaVersion := "2.13.6"

libraryDependencies += "dev.zio" % "zio_2.13" % "1.0.11"

libraryDependencies ++= Seq(
  "dev.zio" % "zio-test_2.13" % "1.0.11",
  "dev.zio" % "zio-test-sbt_2.13" % "1.0.11"
)

testFrameworks := Seq(new TestFramework("zio.test.sbt.ZTestFramework"))