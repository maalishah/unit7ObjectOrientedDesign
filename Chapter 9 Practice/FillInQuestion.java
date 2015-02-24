import java.util.Scanner;
public class FillInQuestion extends Question
{
    // specified text: "The inventor of Java is _James Gosling_ from Sun."
    // convert specified text into the text to display and answer
    // text: "The inventor of Java is _____ from Sun."
    // answer: "James Gosling"
    public FillInQuestion()
    {
    }
    
    public void setText(String questionText)
    {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();
        String answer = parser.next();
        question += "_____" + parser.next();
        
        super.setText(question);
        super.setAnswer(answer);
    }
    
}
