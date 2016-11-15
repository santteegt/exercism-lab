/**
  * Created by santteegt on 14/11/2016.
  */
class Bob {

  private val nothing = "\\s*".r
  private val yell = "[0-9, ]*[A-Z ]{2,}[\\.\\!\\?]?$".r
  private val question = ".*[\\w\\d]+\\?$".r



  def hey(speech: String) = speech match {
    case nothing() => "Fine. Be that way!"
    case yell() => "Whoa, chill out!"
    case question()  => "Sure."
    case _ => "Whatever."
  }

}
