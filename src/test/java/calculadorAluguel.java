import model.CalculadorAluguel;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class calculadorAluguel {
    @ParameterizedTest
    @CsvFileSource(resources = "/valoresParaTestes.csv", delimiter = ',')
    public void testeValor(Double aluguelNominal, int diaMes, Double resultado) {
        CalculadorAluguel ca = new CalculadorAluguel(aluguelNominal);
        double valor = ca.calcAluguel(diaMes);
        assertEquals(resultado,valor,0.01);
    }
}