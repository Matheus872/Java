package com.teste;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class ExceptionTest {

    @Test(expected = IndexOutOfBoundsException.class)
    public void empty(){
        new ArrayList<Object>().get(0);
    }


    @Test(expected = IndexOutOfBoundsException.class)
    public void vazio(){
        List<String> lista = new ArrayList<String>();
        //lista.add("Matheus");
        lista.get(0);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldTestExpceptionMessage(){
        List<Object> list = new ArrayList<Object>();
        thrown.expect(IndexOutOfBoundsException.class);
        thrown.expectMessage("Essa não é a mensagem..");
        list.get(0);
    }


    @Test
    public void testExceptionMessage(){
        try {
            new ArrayList<Object>().get(0);
            fail("Esperado que IndexOutOfBounds seja lançada");
        }catch (IndexOutOfBoundsException ex){
            assertThat(ex.getMessage(), is("Index 0 out of bounds for length 0"));
        }
    }



}
