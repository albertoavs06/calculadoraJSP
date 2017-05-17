<%@page import="utils.Calculadora"%>
<%
// cria o objeto calculadora instancia o objeto

	Calculadora c = new Calculadora();

// pega os valores do fomulário (postados), utilizando os metodos da classe

	c.setValor1(request.getParameter("valor1"));
	c.setValor2(request.getParameter("valor2"));

	c.setOperacao(request.getParameter("operacao"));
	
	if (c.validar()){
		// se for verdadeiro true, mostra a mensagem
		out.print(c.getMensagem());
	}else{
		// senão mostra o calculo realizado	
		out.print("Resultado: " + c.calcular());
	}
	
	
%>

<br><br><a href="index.html">Voltar</a>