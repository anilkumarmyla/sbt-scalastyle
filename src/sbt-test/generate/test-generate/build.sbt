scalastyleConfig := file("scalastyle-config.xml")

(scalastyleConfig in Test) := file("test-scalastyle-config.xml")

version := "0.1"
 
scalaVersion := "2.12.8"
