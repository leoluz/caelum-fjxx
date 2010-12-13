<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Testando parametros</title>
</head>
<body>
    Digite a sua idade:<br>
    <form action="testaparametro.jsp">
        Idade <input name="idade" type="text" /><input type="submit" value="testar!"/>
    </form>
    
    A idade é: ${param.idade}
</body>
</html>