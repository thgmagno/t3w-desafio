package io.t3w.desafio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class UtilsTest {

    @Test
    public void testToString(){
        Assertions.assertEquals(BigDecimal.valueOf(100),  T3WUtils.calcularValorTotal(10, BigDecimal.TEN));
    }

}