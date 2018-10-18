<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/18/2018
  Time: 11:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method = post action="/calc">
    <div class="calc">
      <h2>Login</h2>
      <label for="firstOperand">First Operand</label>
      <input type="number" name="firstOperand" id="firstOperand" size="30"/>
        <br>
      <label for="operator">Operator</label>
      <select id="operator" name="operator">
        <option value="addition">Addition</option>
        <option value="substraction">Subtraction</option>
        <option value="multiplication">Multiplication</option>
        <option value="division">Division</option>
      </select>
        <br>
      <label for="secondOperand">Second Operand</label>
      <input type="number" name="secondOperand" id="secondOperand" size="30"/>
        <br>
        <button type = "submit" name="Submit">Submit</button>
    </div>
  </form>
  </body>
</html>
