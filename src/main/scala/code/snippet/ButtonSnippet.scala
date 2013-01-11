package code.snippet
import scala.xml.Group
import scala.xml.NodeSeq
import net.liftweb.http.js.JsCmd.unitToJsCmd
import net.liftweb.http.js.JsCmd
import net.liftweb.http.SHtml
import net.liftweb.util.Helpers.bind
import net.liftweb.util.Helpers.strToSuperArrowAssoc
import de.htwg.snake.Snake

class ButtonSnippet {

  def up: JsCmd = {
    Snake.controller.moveUp
  }

  def down: JsCmd = {
    Snake.controller.moveDown
  }

  def left: JsCmd = {
    Snake.controller.moveLeft
  }

  def right: JsCmd = {
    Snake.controller.moveRight
  }

  def newGame: JsCmd = {
    Snake.controller.newGame
  }

  def sizeSmall: JsCmd = {
    Snake.controller.changeSize(10)
  }

  def sizeDefault: JsCmd = {
    Snake.controller.changeSize(30)
  }

  def sizeBig: JsCmd = {
    Snake.controller.changeSize(50)
  }

  def speedSlow: JsCmd = {
    Snake.controller.speed = 1
  }

  def speedDefault: JsCmd = {
    Snake.controller.speed = 2
  }

  def speedFast: JsCmd = {
    Snake.controller.speed = 3
  }

  def render(html: Group): NodeSeq = {
    bind("snakebutton", html,
      "up" -> SHtml.ajaxButton("^", up _),
      "down" -> SHtml.ajaxButton("v", down _),
      "left" -> SHtml.ajaxButton("<", left _),
      "right" -> SHtml.ajaxButton(">", right _),
      "newgame" -> SHtml.ajaxButton("New", newGame _),
      "sizesmall" -> SHtml.ajaxButton("small", sizeSmall _),
      "sizedefault" -> SHtml.ajaxButton("default", sizeDefault _),
      "sizebig" -> SHtml.ajaxButton("big", sizeBig _),
      "speedslow" -> SHtml.ajaxButton("slow", speedSlow _),
      "sizeddefault" -> SHtml.ajaxButton("default", speedDefault _),
      "sizefast" -> SHtml.ajaxButton("fast", speedFast _))
  }

}