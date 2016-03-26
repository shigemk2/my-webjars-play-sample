package controllers

import play.api.mvc.{Action, Controller}
import javax.inject.{Singleton, Inject}
import org.webjars.play.RequireJS

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject() (webJarAssets: WebJarAssets, requireJS: RequireJS) extends Controller {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index = Action {
    Ok(views.html.index(webJarAssets, requireJS))
  }

}
