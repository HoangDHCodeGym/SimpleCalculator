import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/calc")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstOperandStr = request.getParameter("firstOperand");
        String secondOperandStr = request.getParameter("secondOperand");
        String operatorStr = request.getParameter("operator");
        double firstOperand = Double.parseDouble(firstOperandStr);
        double secondOperand = Double.parseDouble(secondOperandStr);
        PrintWriter writer = response.getWriter();
        String operator = "";
        double result = 0;
        boolean error = false;
        switch (operatorStr) {
            case "addition":
                result = firstOperand + secondOperand;
                operator = "+";
                break;
            case "substraction":
                result = firstOperand - secondOperand;
                operator = "-";
                break;
            case "multiplication":
                result = firstOperand * secondOperand;
                operator = "*";
                break;
            case "division":
                if (secondOperand == 0) {
                    error = true;
                    break;
                } else {
                    result = firstOperand / secondOperand;
                    operator = "/";
                }
        }
        writer.println("<html>");
        if (!error) {
            writer.println("<h1>" + firstOperand + " " + operator + " " + secondOperand + " = " + result + "</h1>");
        } else {
            writer.println("<h1> Division by Zero </h1>");
        }
        writer.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
