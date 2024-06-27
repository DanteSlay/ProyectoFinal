package com.traffic.vintrack.uva;

import com.traffic.vintrack.model.entity.Uva;
import com.traffic.vintrack.repository.UvaRepository;
import com.traffic.vintrack.service.UvaService;
import com.traffic.vintrack.service.UvaServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UvaServiceTest {
    @Mock
    private UvaRepository uvaRepository;

    @InjectMocks
    private UvaServiceImpl uvaService;

    @Test
    void testFindByNombre() {
        String nombre = "TEMPRANILLO";
        Uva uva = new Uva(1L, nombre);

        when(uvaRepository.findByNombre(nombre)).thenReturn(uva);

        Uva uvaFindByNombre = uvaService.findByNombre(nombre);

        verify(uvaRepository, times(1)).findByNombre(nombre);

        assertEquals(uva, uvaFindByNombre);

    }

    @Test
    void testSave(){
        Uva uva = new Uva(null, "TEMPRANILLO");
        Uva uvaSaved = new Uva(1L, "TEMPRANILLO");

        when(uvaRepository.save(uva)).thenReturn(uvaSaved);

        Uva result = uvaService.save(uva);

        verify(uvaRepository, times(1)).save(uva);

        assertNotEquals(result, uva);
        assertEquals(result, uvaSaved);
    }
}
