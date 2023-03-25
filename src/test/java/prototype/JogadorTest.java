package prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JogadorTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Jogador jogador = new Jogador("Jogador Um", "01/01/1990", 20000.0, 24,
                new Time("Críciuma", "Amarelo, branco e preto", "Tigrelino"));
        Jogador jogadorClone = jogador.clone();
        jogadorClone.setNome("Jogador Dois");
        jogadorClone.setDtNascimento("02/02/1992");
        jogadorClone.setSalario(18500.0);
        jogadorClone.setMesesContrato(30);

        assertEquals("Jogador{nome='Jogador Um', dtNascimento='01/01/1990', salario=20000.0, meses de contrato=24 meses, time=Time{nome=Críciuma', cores=Amarelo, branco e preto', mascote=Tigrelino'}}", jogador.toString());

        assertEquals("Jogador{nome='Jogador Dois', dtNascimento='02/02/1992', salario=18500.0, meses de contrato=30 meses, time=Time{nome=Críciuma', cores=Amarelo, branco e preto', mascote=Tigrelino'}}", jogadorClone.toString());
    }

}
