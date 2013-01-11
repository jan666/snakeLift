package code
package snippet

import net.liftweb._
import http._
import js._
import JsCmds._
import JE._
import de.htwg.snake.Snake
import net.liftweb.actor.LiftActor

object ChangeNameSnippet {

  def render = SHtml.onSubmit(s => {
    Snake.controller.changeName(s)
    SetValById("chat_in", "")
  })

}