package et.edu.aait.viewpagerexample

import java.io.Serializable

data class Course(val title:String, val code:String,
                  val ects:Int, val description:String):Serializable
