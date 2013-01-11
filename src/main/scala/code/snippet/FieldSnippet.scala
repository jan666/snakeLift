package code.snippet

import de.htwg.snake._
import de.htwg.snake.model.CellType
import de.htwg.snake.model.SnakePosition

class FieldSnippet {

  def render = {

    if (!Snake.controller.model.dead) {
      <table class="field">
        {
          for (y <- 0 to Snake.controller.model.field.y) yield {
            <tr>
              {
                for (x <- 0 to Snake.controller.model.field.x) yield {
                  var cellClass = ""
                  Snake.controller.model.field.cells(x)(y) match {
                    case CellType.BARRICADE => cellClass = "BARRICADE"
                    case CellType.EMPTY => if (Snake.controller.model.snake.contains(new SnakePosition(x, y))) cellClass = "SNAKE"
                    case CellType.FOOD => cellClass = "FOOD"
                    case CellType.EXTRAFOOD => cellClass = "EXTRAFOOD"
                  }
                  <td class={ "cell " + cellClass }></td>
                }

              }
            </tr>
          }
        }
      </table>
    } else {
      <h1>Game Over!</h1>
      <span>Your Score: { Snake.controller.score.get } </span><br/>
      <span>Highscores:</span>
      <ol>
        {
          val highscores = Snake.controller.getHighscores
          for (i <- 0 until highscores.size) yield {
            <li>{ highscores(i)._1 + ": " + highscores(i)._2 }</li>
          }
        }
      </ol>
    }
  }

}