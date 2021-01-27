
package Week3LabServlets;

import static Week3LabServlets.AgeCalculator.isNumber;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 814545
 */
public class ArithmeticCalculator extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result", "Result:---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstInput = request.getParameter("firstNumber");
        String secondInput = request.getParameter("secondNumber");
        if(!isNumber(firstInput)||!isNumber(secondInput))
        {
            request.setAttribute("result", "Result: Invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
        
        int firstNumber = Integer.parseInt(firstInput);
        int secondNumber = Integer.parseInt(secondInput);
        int result;
        String symbol =request.getParameter("symbol");
        
        
        switch(symbol){
            case "+":
            {
                result = firstNumber + secondNumber;
            }
            break;
            case "-":
            {
                result = firstNumber - secondNumber;
            }
            break;
            case "*":
            {
                result = firstNumber * secondNumber;
            }
            break;
            case "%":
            {
                result = firstNumber % secondNumber;
            }
            break;
            default:
            {
                result = 0;
            }
        }
            
        request.setAttribute("result", "Result: "+ result);
        request.setAttribute("firstNumber", firstNumber);
        request.setAttribute("secondNumber", secondNumber);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
    
    
}

    
