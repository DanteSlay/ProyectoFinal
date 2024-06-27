package com.traffic.vintrack.tipo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


import com.traffic.vintrack.model.entity.Tipo;
import com.traffic.vintrack.repository.TipoRepository;
import com.traffic.vintrack.service.TipoServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TipoServiceImplTest {

    @Mock
    private TipoRepository tipoRepository;

    @InjectMocks
    private TipoServiceImpl tipoService;

    @Test
    public void testFindByNombre() {
        // Datos de prueba
        String nombre = "TINTO";

        // Configuración del mock
        when(tipoRepository.findByNombre(nombre)).thenReturn(TiposEjemplos.tipo1);

        // Llamada al método del servicio
        Tipo resultado = tipoService.findByNombre(nombre);

        // Verificaciones
        assertNotNull(resultado);
        assertEquals(nombre, resultado.getNombre());
        assertEquals(1L, resultado.getId());

        // Verificar que el método del repositorio se llama una vez con el parámetro correcto
        verify(tipoRepository, times(1)).findByNombre(nombre);
    }

    @Test
    public void testSave() {
        Tipo entityBeforeSave = TiposEjemplos.tipoDTO1;

        when(tipoRepository.save(entityBeforeSave)).thenReturn(TiposEjemplos.tipo1);

        Tipo entitySaved = tipoService.save(entityBeforeSave);

        assertNull(entityBeforeSave.getId());
        assertNotNull(entitySaved.getId());
        assertNotEquals(entitySaved, entityBeforeSave);

        verify(tipoRepository).save(entityBeforeSave);
    }



}
