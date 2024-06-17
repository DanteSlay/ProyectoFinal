package com.traffic.vintrack.pais;

import com.traffic.vintrack.exception.NotFoundException;
import com.traffic.vintrack.model.entity.Pais;
import com.traffic.vintrack.repository.PaisRepository;
import com.traffic.vintrack.service.PaisService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@SpringBootTest
@Transactional
public class PaisServiceImplTest {

    @Autowired
    private PaisService paisService;

    @Autowired
    private PaisRepository paisRepository;

    @Test
    public void testFindById() throws NotFoundException {
        // Given
        Long paisId = 1L;

        // When
        Pais pais = paisService.findById(paisId);

        // Then
        Assertions.assertNotNull(pais);
        Assertions.assertEquals(paisId, pais.getId());
    }

    @Test
    public void testFindByNombre() {
        // Given
        String nombrePais = "ESPAÑA";

        // When
        Pais pais = paisService.findByNombre(nombrePais);

        // Then
        Assertions.assertNotNull(pais);
        Assertions.assertEquals(nombrePais, pais.getNombre());
    }

    @Test
    public void testSave() {
        // Given
        Pais nuevoPais = new Pais();
        nuevoPais.setNombre("PORTUGAL");

        // When
        Pais savedPais = paisService.save(nuevoPais);

        // Then
        Assertions.assertNotNull(savedPais.getId());
        Assertions.assertEquals(nuevoPais.getNombre(), savedPais.getNombre());
    }

    @Test
    public void testDelete() throws NotFoundException {
        // Given
        Pais nuevoPais = new Pais();
        nuevoPais.setNombre("Prueba");

        Pais savedPais = paisService.save(nuevoPais);

        // When
        paisService.delete(savedPais.getId());

        // Then
        Assertions.assertFalse(paisService.existById(savedPais.getId()));
    }

    @Test
    public void testFindAll() throws NotFoundException {
        // When
        Set<Pais> paises = paisService.findAll();

        // Then
        Assertions.assertFalse(paises.isEmpty());
        Assertions.assertEquals(10, paises.size());
    }
}
