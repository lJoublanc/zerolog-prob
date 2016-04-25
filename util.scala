package zerologprob

package object util {
  object Logging {
    implicit val (log,logFormatter,logAppender) = ZeroLoggerFactory.newLogger(this)
  }
}
