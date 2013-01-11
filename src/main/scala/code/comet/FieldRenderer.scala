package code.comet

import net.liftweb.http.CometActor
import net.liftweb.common.Full
import net.liftweb.http.js.JsCmds.SetHtml
import java.util.Date
import scala.xml.Text
import net.liftweb.http.CometListener
import scala.swing.Reactor
import de.htwg.util.Observer
import de.htwg.snake.Snake

class FieldRenderer extends CometActor with CometListener with Reactor with Observer {

  private var status: String = "" // private state
  Snake.controller.add(this)

  def registerWith = this

  override def lowPriority: PartialFunction[Any, Unit] = {
    case command: String => reRender()
  }

  def render = {
    "#status *" #> status
  }

  override def update = {
    reRender
  }

}