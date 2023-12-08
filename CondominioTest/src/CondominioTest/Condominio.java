package CondominioTest;


public class Condominio {
// Atributos da classe
      
	    public boolean visitanteDesordeiro; // Indica se o visitante é desordeiro
	    public boolean visitanteSupervisionado; // Indica se o visitante está sendo supervisionado
	    public boolean multaEnviada; // Indica se a multa foi enviada para o visitante

	    // Construtor padrão
	    public Condominio() {
	        // Inicialização padrão dos atributos ao criar uma instância de Condominio
	        this.visitanteDesordeiro = false; // Inicialmente nenhum visitante é considerado desordeiro
	        this.visitanteSupervisionado = false; // Inicialmente nenhum visitante é supervisionado
	        this.multaEnviada = false; // Inicialmente nenhuma multa foi enviada
	    }

	    // Método para analisar imagem e tomar ações com base nisso
	    public void analisarImagem(String morador, String visitante, String imagemPath) {
	        // Exemplo simplificado: se o visitante é "Visitante1" e a imagem contém uma face detectada, ele é considerado desordeiro
	        if (visitante.equals("Visitante1") && imagemPath.contains("face_detectada")) {
	            
	   
	this.visitanteDesordeiro = true;
	            this.visitanteSupervisionado = false; // Neste exemplo, se é desordeiro, não está supervisionado
	        }
	        // Outras lógicas podem ser implementadas conforme necessário para o seu sistema
	        // ...
	    }

	    // Método para enviar multa a um morador
	    public void enviarMulta(String morador) {
	        // Exemplo simplificado: se a multa ainda não foi enviada, envie-a ao morador
	        if (!this.multaEnviada) {
	            System.out.println("Multa enviada para: " + morador);
	            this.multaEnviada = true;
	        } else {
	            System.out.println("Visitante reincidênte,Multa enviada para: " + morador);
	        }
	        // Outras lógicas podem ser implementadas conforme necessário para o seu sistema
	        // ...
	    }

	    // Getters e Setters para os atributos, se necessário
	    // Esses métodos são usados para acessar e modificar os atributos da classe
	    // Permitem um controle mais preciso sobre os atributos, se necessário
	    public boolean isVisitanteDesordeiro() {
	        return visitanteDesordeiro;
	    }

	    public void setVisitanteDesordeiro(boolean visitanteDesordeiro) {
	        this.visitanteDesordeiro = visitanteDesordeiro;
	    }

	    public boolean isVisitanteSupervisionado() {
	        return visitanteSupervisionado;
	    }

	    public void setVisitanteSupervisionado(boolean visitanteSupervisionado) {
	        this.visitanteSupervisionado = visitanteSupervisionado;
	    }

	    public boolean isMultaEnviada() {
	        
	       
	return multaEnviada;
	    }

	    public void setMultaEnviada(boolean multaEnviada) {
	        this.multaEnviada = multaEnviada;
	    }

		

		
	}	 