import java.util.*;
class Training
{
 int trainingId;
 String trainingName;
 public Training(){}
 public Training(int trainingId,String trainingName)
 {
   this.trainingId=trainingId;
   this.trainingName=trainingName;
  }
 public void setTrainingId(int TrainingId)
 {
   this.trainingId=trainingId;
  }
 public void setTrainingName(int TrainingName)
 {
   this.trainingName=trainingName;
 }
 public int getTrainingId()
 { 
 return trainingId;
 }
 public String getTrainingName()
 {
 return trainingName;
 }
}
 class Student
 {
 String[] sName={"a","b","c"};
 Training t[];
 public Student(){}
 public Student(String sName[],Training t[])
{
 this.sName=sName;
 this.t=t;
}
public void setSName(String SName)
{
 this.sName=sName;
}
public void setTraining(Training t[])
{
 this.t=t;
}
public String getSName()
{ 
return "sName";
}
public Training getTraining()
{
return t;
}
}


class T5
{
 public static void main(String args[])
 {
  Training t1[]={new Training(101,"Nexwave"),
                new Training(103,"Nexwave"),
                new Training(107,"Nexwave")
                };
  Student s[] =new Student[3];
  System.out.println("the student details");
  for(int i=0;i<3;i++)
{
Training t2[]=s[i].getTraining();
for(int j=0;j<t2.length;j++)
{
  System.out.println("training id is"+t2[j].getTrainingId());
  System.out.println(" the training name is"+t2[j].getTrainingName());
  }
}
}
}
