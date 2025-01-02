package QuizApp;
import java.util.Scanner;

public class QuestionProvider {
    int helo;
    int[] selection=new int[5];
    int correct;
Question[] question=new Question[5];
public QuestionProvider(){
question[0]=new Question("what is js","4","java","cpp","csharp","javascript");
question[1]=new Question("what is the file name of java","1","java","class","js","kotlin");
question[2]=new Question("which is platform independent ","1","java","jvm","javascript","cpp");
question[3]=new Question("which is used in web development","4","java","javascript","html","all");
question[4]=new Question("which is not used in frontend","1","python","css","Html","javascript");

}
Scanner scanner=new Scanner(System.in);
public void play(){
    for(int i=0;i<=4;i++){
System.out.println(question[i].getQuestion());
System.out.println(question[i].getOpt1());
System.out.println(question[i].getOpt2());
System.out.println(question[i].getOpt3());
System.out.println(question[i].getOpt4());
selection[i]=scanner.nextInt();

System.out.println("****************************************");
        // System.out.println(question[1].getQuestion());
    }
    scanner.close();

for(int i=0;i<=4;i++){
    if((selection[i])==(Integer.parseInt(question[i].getAnswer())))
    {
        correct++;
    }
}
System.out.println("YOU GOT "+correct+" out of 5");

}





}
