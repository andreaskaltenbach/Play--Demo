package controllers {

import model.Employee
import play._
import play.mvc._

  object Application extends Controller {

      import views.Application._

      def index = {
        val erik = new Employee("Erik")
        html.index(erik, 2011)
      }
  }
 }

package model {
  case class Employee(name:String)
}
