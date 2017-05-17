package utils;

public class Calculadora {
	// atributos da classe
	private double valor1;
	private double valor2;
	private String operacao;

	// variavel para guardar mensagem de erro, caso haja um erro.

	private String mensagem = "";

	// atribui e verifica se há erros na informação dos dados para o valor 1
	/**
	* @param v1 recebe o valor 1 para realizar o calculo tipo(String)
	*/

	
	public void setValor1(String v1) {
		// tratamento de erro para verificacao de um numero valido
		try {
			// se estiver correto atribui valor a variavel
			this.valor1 = Double.parseDouble(v1);
		} catch (NumberFormatException e) {
			// se der erro armazena mensagem na variavel mensagem
			this.mensagem += "<br>O valor 1 parece não ser um numero válido! ";
		}

		this.valor1 = valor1;
	}

	// atribui e verifica se há erros na informação dos dados para o valor 2
	public void setValor2(String v2) {
		// tratamento de erro para verificacao de um numero valido
		try {
			// se estiver correto atribui valor a variavel
			this.valor2 = Double.parseDouble(v2);
		} catch (NumberFormatException e) {
			// se der erro armazena mensagem na variavel mensagem
			this.mensagem += "<br>O valor 2 parece não ser um numero válido! ";
		}

		this.valor2 = valor2;
	}

	// atribui o valor para a operação solicitada.
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	// retorna mensagem de erro.
	public String getMensagem() {
		return mensagem;
	}

	// metodo que verifica se existe um valor na variavel mensagen
	// obs: vai ser utilizada lá no arquivo de saida.jsp afim de verificar erros
	// retorna true se a variavel mensagem não for vazia.

	public boolean validar() {
		return !mensagem.equals("");
	}

	// metodo que efetua a operação desejada e retorna o valor(double)

	public double calcular() {
		double resultado = 0.0;
		
		switch (operacao) {
		case "adicao":
			resultado = (valor1 + valor2);
			break;
		
		case "subtracao":
			resultado = (valor1 - valor2);
			break;
		
		case "multiplicacao":
			resultado = (valor1 * valor2);
			break;
		
		case "divisao":
			resultado = (valor1 / valor2);
			break;
		}
		// retorna o valor calculado
		return resultado;
	}
}