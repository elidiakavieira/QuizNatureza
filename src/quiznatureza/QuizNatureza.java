package quiznatureza;
import Forms.Quiz;
import java.awt.Color;

public class QuizNatureza 
{
    public static void main(String[] args) 
    {
        Quiz quiz = new Quiz();
        quiz.setVisible(true);
        quiz.getContentPane().setBackground(new Color (19,98,43));//altera cor do form
        quiz.setExtendedState(Quiz.MAXIMIZED_BOTH);// deixalo maximizado
        quiz.setTitle("Vamos aprender a cuidar da Natureza");//nome do form
        quiz.setResizable(false); //bloquear o botão restaurar
    }
    
}
