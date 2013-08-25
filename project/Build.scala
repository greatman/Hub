import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

    val appName         = "Hub"
    val appVersion      = "1.0.0-SNAPSHOT"

    val appDependencies = Seq(
      javaCore,
      javaJdbc,
      javaEbean,
      "be.objectify"  %%  "deadbolt-java"     % "2.1-RC2",
      "com.feth"      %%  "play-authenticate" % "0.3.0-SNAPSHOT",
      "org.xerial" % "sqlite-jdbc" % "3.7.2",
      "mysql" % "mysql-connector-java" % "5.1.18"
    )

    val main = play.Project(appName, appVersion, appDependencies).settings(

      resolvers += Resolver.url("Objectify Play Repository (release)", url("http://schaloner.github.com/releases/"))(Resolver.ivyStylePatterns),
      resolvers += Resolver.url("Objectify Play Repository (snapshot)", url("http://schaloner.github.com/snapshots/"))(Resolver.ivyStylePatterns),

      resolvers += Resolver.url("play-easymail (release)", url("http://joscha.github.com/play-easymail/repo/releases/"))(Resolver.ivyStylePatterns),
      resolvers += Resolver.url("play-easymail (snapshot)", url("http://joscha.github.com/play-easymail/repo/snapshots/"))(Resolver.ivyStylePatterns),

      resolvers += Resolver.url("play-authenticate (release)", url("http://joscha.github.com/play-authenticate/repo/releases/"))(Resolver.ivyStylePatterns),
      resolvers += Resolver.url("play-authenticate (snapshot)", url("http://joscha.github.com/play-authenticate/repo/snapshots/"))(Resolver.ivyStylePatterns)
    )
}
