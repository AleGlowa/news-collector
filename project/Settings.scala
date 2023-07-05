import sbt.*
import sbt.Keys.*

object Settings {

  val commonSettings =
    Seq(
      scalacOptions    :=
        Seq(
          "-unchecked",
          "-deprecation",
          "-feature"
        ),
      run / cancelable := true, // https://github.com/sbt/sbt/issues/2274
    )

  val domainDependencies = Nil
}
