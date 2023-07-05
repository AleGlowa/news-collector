import sbt.*

object Libs {

  val Zio     = "dev.zio" %% "zio" % Versions.Zio
  val ZioTest = "dev.zio" %% "zio-test" % Versions.Zio % Test
}

object Versions {

  val Zio = "2.0.15"

}
