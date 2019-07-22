import scala.io.Source
import scala.io
//def searchFolder()
  class SearchDirectory() {
  def searchDirectory(foldername:String): Unit = {
    import GivenFolder._
    for (foldern <- scala._)
      {
     if (foldern == foldername)
        val lines = Source.fromFile(args(0)).getLines().toList
     }
       }


    }

class Input extends SearchDirectory{

  def inputChoice() {
    case searchDirectory(foldername = "")
  }
}


