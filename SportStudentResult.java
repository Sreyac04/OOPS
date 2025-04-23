interface Student
{
	 int Score=80;
	 void displayScore();
}
interface Sports
{
	 int Score=90;
	 void displaySportScore();
}
class Result implements Student,Sports
{
	 public void displayScore()
	 {
		 System.out.println("Academic Score is:"+Student.Score);
	 }
	 public void displaySportScore()
	 {
	  System.out.println("Sport Score is:"+Sports.Score);
	 }
}
 public class SportStudentResult
{
	public static void main(String args[])
	{
	  Result r=new Result();
	  r.displayScore();
	  r.displaySportScore();
	}
 }
	
	
Academic Score is:80
Sport Score is:90



