package controllers

import play.mvc.Controller
import play.api.db._
import play.api.Play.current

class PatientController extends Controller{

    val ds = DB.getDataSource()

    def createPatient = {
        println(ds.getConnection.createStatement().execute("select * from patient"))
    }
}
