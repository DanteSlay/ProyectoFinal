package com.traffic.vintrack.tipo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


import com.traffic.vintrack.model.entity.Tipo;
import com.traffic.vintrack.repository.TipoRepository;
import com.traffic.vintrack.service.TipoServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class TipoServiceImplTest {

    @Mock
    private TipoRepository tipoRepositoryMock;

    @InjectMocks
    private TipoServiceImpl tipoService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testFindByNombre() {
        // Datos de prueba
        String nombre = "Tipo1";
        Tipo tipoMock = new Tipo();
        tipoMock.setId(1L);
        tipoMock.setNombre(nombre);

        // Configuración del mock
        when(tipoRepositoryMock.findByNombre(nombre)).thenReturn(tipoMock);

        // Llamada al método del servicio
        Tipo resultado = tipoService.findByNombre(nombre);

        // Verificaciones
        assertNotNull(resultado);
        assertEquals(nombre, resultado.getNombre());
        assertEquals(1L, resultado.getId());

        // Verificar que el método del repositorio se llama una vez con el parámetro correcto
        verify(tipoRepositoryMock, times(1)).findByNombre(nombre);
    }

    // Puedes agregar más pruebas aquí según sea necesario

}
