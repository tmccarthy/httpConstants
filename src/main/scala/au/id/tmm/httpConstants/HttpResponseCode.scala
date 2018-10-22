package au.id.tmm.httpConstants

sealed trait HttpResponseCode {
  val code: Int
}

object HttpResponseCode {

  sealed trait Information extends HttpResponseCode

  case object Continue          extends Information { override val code: Int = 100 }
  case object SwitchingProtocol extends Information { override val code: Int = 101 }
  case object Processing        extends Information { override val code: Int = 102 }

  sealed trait Successful extends HttpResponseCode

  case object OK                          extends Successful { override val code: Int = 200 }
  case object Created                     extends Successful { override val code: Int = 201 }
  case object Accepted                    extends Successful { override val code: Int = 202 }
  case object NonAuthoritativeInformation extends Successful { override val code: Int = 203 }
  case object NoContent                   extends Successful { override val code: Int = 204 }
  case object ResetContent                extends Successful { override val code: Int = 205 }
  case object PartialContent              extends Successful { override val code: Int = 206 }
  case object MultiStatus207              extends Successful { override val code: Int = 207 }
  case object MultiStatus208              extends Successful { override val code: Int = 208 }
  case object ImUsed                      extends Successful { override val code: Int = 226 }

  sealed trait Redirection extends HttpResponseCode

  case object MultipleChoice    extends Redirection { override val code: Int = 300 }
  case object MovedPermanently  extends Redirection { override val code: Int = 301 }
  case object Found             extends Redirection { override val code: Int = 302 }
  case object SeeOther          extends Redirection { override val code: Int = 303 }
  case object NotModified       extends Redirection { override val code: Int = 304 }
  case object UseProxy          extends Redirection { override val code: Int = 305 }
  case object `306`             extends Redirection { override val code: Int = 306 }
  case object TemporaryRedirect extends Redirection { override val code: Int = 307 }
  case object PermanentRedirect extends Redirection { override val code: Int = 308 }

  sealed trait ClientError extends HttpResponseCode

  case object BadRequest                   extends ClientError { override val code: Int = 400 }
  case object Unauthorized                 extends ClientError { override val code: Int = 401 }
  case object PaymentRequired              extends ClientError { override val code: Int = 402 }
  case object Forbidden                    extends ClientError { override val code: Int = 403 }
  case object NotFound                     extends ClientError { override val code: Int = 404 }
  case object MethodNotAllowed             extends ClientError { override val code: Int = 405 }
  case object NotAcceptable                extends ClientError { override val code: Int = 406 }
  case object ProxyAuthenticationRequired  extends ClientError { override val code: Int = 407 }
  case object RequestTimeout               extends ClientError { override val code: Int = 408 }
  case object Conflict                     extends ClientError { override val code: Int = 409 }
  case object Gone                         extends ClientError { override val code: Int = 410 }
  case object LengthRequired               extends ClientError { override val code: Int = 411 }
  case object PreconditionFailed           extends ClientError { override val code: Int = 412 }
  case object PayloadTooLarge              extends ClientError { override val code: Int = 413 }
  case object URITooLong                   extends ClientError { override val code: Int = 414 }
  case object UnsupportedMediaType         extends ClientError { override val code: Int = 415 }
  case object RequestedRangeNotSatisfiable extends ClientError { override val code: Int = 416 }
  case object ExpectationFailed            extends ClientError { override val code: Int = 417 }
  case object ImATeapot                    extends ClientError { override val code: Int = 418 }
  case object MisdirectedRequest           extends ClientError { override val code: Int = 421 }
  case object UnprocessableEntity          extends ClientError { override val code: Int = 422 }
  case object Locked                       extends ClientError { override val code: Int = 423 }
  case object FailedDependency             extends ClientError { override val code: Int = 424 }
  case object TooEarly                     extends ClientError { override val code: Int = 425 }
  case object UpgradeRequired              extends ClientError { override val code: Int = 426 }
  case object PreconditionRequired         extends ClientError { override val code: Int = 428 }
  case object TooManyRequests              extends ClientError { override val code: Int = 429 }
  case object RequestHeaderFieldsTooLarge  extends ClientError { override val code: Int = 431 }
  case object UnavailableForLegalReasons   extends ClientError { override val code: Int = 451 }

  sealed trait ServerError extends HttpResponseCode

  case object InternalServerError           extends ServerError { override val code: Int = 500 }
  case object NotImplemented                extends ServerError { override val code: Int = 501 }
  case object BadGateway                    extends ServerError { override val code: Int = 502 }
  case object ServiceUnavailable            extends ServerError { override val code: Int = 503 }
  case object GatewayTimeout                extends ServerError { override val code: Int = 504 }
  case object HTTPVersionNotSupported       extends ServerError { override val code: Int = 505 }
  case object VariantAlsoNegotiates         extends ServerError { override val code: Int = 506 }
  case object InsufficientStorage           extends ServerError { override val code: Int = 507 }
  case object LoopDetected                  extends ServerError { override val code: Int = 508 }
  case object NotExtended                   extends ServerError { override val code: Int = 510 }
  case object NetworkAuthenticationRequired extends ServerError { override val code: Int = 511 }

  def fromCode(code: Int): Option[HttpResponseCode] = code match {
    case 100 => Some(Continue)
    case 101 => Some(SwitchingProtocol)
    case 102 => Some(Processing)
    case 200 => Some(OK)
    case 201 => Some(Created)
    case 202 => Some(Accepted)
    case 203 => Some(NonAuthoritativeInformation)
    case 204 => Some(NoContent)
    case 205 => Some(ResetContent)
    case 206 => Some(PartialContent)
    case 207 => Some(MultiStatus207)
    case 208 => Some(MultiStatus208)
    case 226 => Some(ImUsed)
    case 300 => Some(MultipleChoice)
    case 301 => Some(MovedPermanently)
    case 302 => Some(Found)
    case 303 => Some(SeeOther)
    case 304 => Some(NotModified)
    case 305 => Some(UseProxy)
    case 306 => Some(`306`)
    case 307 => Some(TemporaryRedirect)
    case 308 => Some(PermanentRedirect)
    case 400 => Some(BadRequest)
    case 401 => Some(Unauthorized)
    case 402 => Some(PaymentRequired)
    case 403 => Some(Forbidden)
    case 404 => Some(NotFound)
    case 405 => Some(MethodNotAllowed)
    case 406 => Some(NotAcceptable)
    case 407 => Some(ProxyAuthenticationRequired)
    case 408 => Some(RequestTimeout)
    case 409 => Some(Conflict)
    case 410 => Some(Gone)
    case 411 => Some(LengthRequired)
    case 412 => Some(PreconditionFailed)
    case 413 => Some(PayloadTooLarge)
    case 414 => Some(URITooLong)
    case 415 => Some(UnsupportedMediaType)
    case 416 => Some(RequestedRangeNotSatisfiable)
    case 417 => Some(ExpectationFailed)
    case 418 => Some(ImATeapot)
    case 421 => Some(MisdirectedRequest)
    case 422 => Some(UnprocessableEntity)
    case 423 => Some(Locked)
    case 424 => Some(FailedDependency)
    case 425 => Some(TooEarly)
    case 426 => Some(UpgradeRequired)
    case 428 => Some(PreconditionRequired)
    case 429 => Some(TooManyRequests)
    case 431 => Some(RequestHeaderFieldsTooLarge)
    case 451 => Some(UnavailableForLegalReasons)
    case 500 => Some(InternalServerError)
    case 501 => Some(NotImplemented)
    case 502 => Some(BadGateway)
    case 503 => Some(ServiceUnavailable)
    case 504 => Some(GatewayTimeout)
    case 505 => Some(HTTPVersionNotSupported)
    case 506 => Some(VariantAlsoNegotiates)
    case 507 => Some(InsufficientStorage)
    case 508 => Some(LoopDetected)
    case 510 => Some(NotExtended)
    case 511 => Some(NetworkAuthenticationRequired)
    case _ => None
  }

}
