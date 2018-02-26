
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[models.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.62*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add Product",user)/*4.26*/ {_display_(Seq[Any](format.raw/*4.28*/("""
    """),format.raw/*5.5*/("""<p class="lead">Add a new product</p>
    """),_display_(/*6.6*/form(action=routes.HomeController.addProductSubmit(), 'class -> "form-horizontal", 'role -> "form")/*6.105*/ {_display_(Seq[Any](format.raw/*6.107*/("""
        """),format.raw/*7.37*/("""
        """),_display_(/*8.10*/CSRF/*8.14*/.formField),format.raw/*8.24*/("""

        """),_display_(/*10.10*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*10.85*/("""
        """),_display_(/*11.10*/select(
            productForm("category.id"),
            options(Category.options),
            '_label -> "Category", '_default -> "-- Choose a category --",
            '_showConstraints -> false, 'class -> "form-control"
        )),format.raw/*16.10*/("""
        """),_display_(/*17.10*/inputText(productForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*17.99*/("""
        """),_display_(/*18.10*/inputText(productForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*18.87*/("""
        """),_display_(/*19.10*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*19.87*/("""

        """),_display_(/*21.10*/inputText(productForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*21.74*/("""

        """),format.raw/*23.9*/("""<div class="actions">
            <input type="submit" value="Add/Update Product" class="btn btn-primary">
            <a href=""""),_display_(/*25.23*/routes/*25.29*/.HomeController.index(0)),format.raw/*25.53*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*29.6*/("""
""")))}))
      }
    }
  }

  def render(productForm:Form[models.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(productForm,user)

  def f:((Form[models.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (productForm,user) => apply(productForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Feb 22 18:48:46 GMT 2018
                  SOURCE: /home/wdd/webapps/lab1/app/views/addProduct.scala.html
                  HASH: bfe9b1ab843316dfd70316eb73046562eae6b5ff
                  MATRIX: 985->1|1118->63|1163->61|1190->79|1217->81|1249->105|1288->107|1319->112|1387->155|1495->254|1535->256|1571->293|1607->303|1619->307|1649->317|1687->328|1783->403|1820->413|2077->649|2114->659|2224->748|2261->758|2359->835|2396->845|2494->922|2532->933|2617->997|2654->1007|2810->1136|2825->1142|2870->1166|3018->1284
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|38->6|38->6|38->6|39->7|40->8|40->8|40->8|42->10|42->10|43->11|48->16|49->17|49->17|50->18|50->18|51->19|51->19|53->21|53->21|55->23|57->25|57->25|57->25|61->29
                  -- GENERATED --
              */
          