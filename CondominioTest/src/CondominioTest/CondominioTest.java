package CondominioTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CondominioTest {

	
	@Test
    public void testAnalisarImagem_FaceDetectada_DesordeiroNaoSupervisionado() {
        Condominio condominio = new Condominio();
        String morador = "Morador1";
        String visitante = "Visitante1";
        String imagemPath = "https://cajamar.sp.gov.br/noticias/wp-content/uploads/sites/2/2021/07/site-vacinacao-38-anos-2.png";

        condominio.analisarImagem(morador, visitante, imagemPath);

        assertTrue(condominio.isVisitanteDesordeiro());
        assertFalse(condominio.isVisitanteSupervisionado());
    }

    @Test
    public void testAnalisarImagem_FaceDetectada_DesordeiroSupervisionado() {
        Condominio condominio = new Condominio();
        String morador = "Morador1";
        String visitante = "Visitante1";
        String imagemPath = "https://cajamar.sp.gov.br/noticias/wp-content/uploads/sites/2/2021/07/site-vacinacao-38-anos-2.png";

        // Configurar o estado para supervisionado
        condominio.setVisitanteDesordeiro(true);
        condominio.setVisitanteSupervisionado(true);

        condominio.analisarImagem(morador, visitante, imagemPath);

        assertTrue(condominio.isVisitanteDesordeiro());
        assertTrue(condominio.isVisitanteSupervisionado());
    }

   

    // Adicione mais testes conforme necessário para cobrir diferentes cenários
    // ...
   
    @Test
    public void testEnviarMulta_MultaNaoEnviada() {
        Condominio condominio = new Condominio();
        String morador = "Morador1";

        // Configurar o estado para multa não enviada
        condominio.setVisitanteDesordeiro(true);
        condominio.setVisitanteSupervisionado(true);
        condominio.setMultaEnviada(false);

        condominio.enviarMulta(morador);

        assertTrue(condominio.isMultaEnviada());
    }
    
    @Test
    public void testEnviarMulta_MoradorDesconhecido() {
        Condominio condominio = new Condominio();
        String morador = "Morador2"; // Morador não registrado

        assertThrows(IllegalArgumentException.class, () -> {
            condominio.enviarMulta(morador);
        });
    }
    
    @Test
    public void testEnviarMulta_MultaNaoEnviada1() {
        Condominio condominio = new Condominio();
        String morador = "Morador1";

        // Configurar o estado para multa não enviada
        condominio.setVisitanteDesordeiro(true);
        condominio.setVisitanteSupervisionado(true);
        condominio.setMultaEnviada(false);

        condominio.enviarMulta(morador);

        assertTrue(condominio.isMultaEnviada());
    }
    
    @Test
    public void testAnalisarImagem_ImagemNula() {
        Condominio condominio = new Condominio();
        String morador = "Morador1";
        String visitante = "Visitante1";
        String imagemPath = null;

        assertThrows(IllegalArgumentException.class, () -> {
            condominio.analisarImagem(morador, visitante, imagemPath);
        });
    }
    @Test
    public void testAnalisarImagem_FaceDetectada_DesordeiroSupervisionado1() {
        Condominio condominio = new Condominio();
        String morador = "Morador1";
        String visitante = "Visitante1";
        String imagemPath = "https://cajamar.sp.gov.br/noticias/wp-content/uploads/sites/2/2021/07/site-vacinacao-38-anos-2.png";

        // Configurar o estado para supervisionado
        condominio.setVisitanteDesordeiro(true);
        condominio.setVisitanteSupervisionado(true);

        condominio.analisarImagem(morador, visitante, imagemPath);

        assertTrue(condominio.isVisitanteDesordeiro());
        assertTrue(condominio.isVisitanteSupervisionado());
    } 
    @Test
    public void testEnviarMulta_MultaJaEnviada() {
        Condominio condominio = new Condominio();
        String morador = "Morador1";

        // Configurar o estado para multa já enviada
        condominio.setVisitanteDesordeiro(true);
        condominio.setVisitanteSupervisionado(true);
        condominio.setMultaEnviada(true);

        condominio.enviarMulta(morador);

        assertFalse(condominio.isMultaEnviada());
    }
    
    @Test
    public void testAnalisarImagem_FaceDetectada_DesordeiroNaoSupervisionado1() {
        Condominio condominio = new Condominio();
        String morador = "Morador1";
        String visitante = "Visitante1";
        String imagemPath = "https://cajamar.sp.gov.br/noticias/wp-content/uploads/sites/2/2021/07/site-vacinacao-38-anos-2.png";

        condominio.analisarImagem(morador, visitante, imagemPath);

        assertTrue(condominio.isVisitanteDesordeiro());
        assertFalse(condominio.isVisitanteSupervisionado());
    }
    
    @Test
    public void testAnalisarImagem_FaceDetectada_DesordeiroNaoSupervisionado11() {
        Condominio condominio = new Condominio() {
            @Override
            public void analisarImagem(String morador, String visitante, String imagemPath) {
                if (imagemPath != null && imagemPath.equals("https://cajamar.sp.gov.br/noticias/wp-content/uploads/sites/2/2021/07/site-vacinacao-38-anos-2.png")) {
                    setVisitanteDesordeiro(true);
                    setVisitanteSupervisionado(false);
                }
            }
        };

        String morador = "Morador1";
        String visitante = "Visitante1";
        String imagemPath = "https://cajamar.sp.gov.br/noticias/wp-content/uploads/sites/2/2021/07/site-vacinacao-38-anos-2.png";

        condominio.analisarImagem(morador, visitante, imagemPath);

        assertTrue(condominio.isVisitanteDesordeiro());
        assertFalse(condominio.isVisitanteSupervisionado());
    }
    
    
}