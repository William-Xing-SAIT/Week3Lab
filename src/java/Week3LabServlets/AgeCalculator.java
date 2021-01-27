package Week3LabServlets;

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
public class AgeCalculator extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String currentAge = request.getParameter("currentAge");
        if (currentAge == null || currentAge.equals("")){
            request.setAttribute("nextAge", "Your must give your current age.");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
        }
        if (!isNumber(currentAge)){
            request.setAttribute("nextAge", "You must enter a number.");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
        }
        int nextAge = Integer.parseInt(currentAge) + 1;
        request.setAttribute("nextAge", "Your age next birthday will be " + nextAge);
        request.setAttribute("currentAge", currentAge);
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        
    }

    protected static boolean isNumber(String str){
        try{
            Integer.parseInt(str);
            return true;
            }
        catch(NumberFormatException e)
        {
            return false;
        }
    }

}
