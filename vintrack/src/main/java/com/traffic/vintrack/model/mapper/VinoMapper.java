package com.traffic.vintrack.model.mapper;

import com.traffic.vintrack.base.model.Mapper;
import com.traffic.vintrack.model.dto.VinoDTO;
import com.traffic.vintrack.model.entity.Vino;
import com.traffic.vintrack.service.CrianzaService;
import com.traffic.vintrack.service.PaisService;
import com.traffic.vintrack.service.TipoService;
import com.traffic.vintrack.service.UvaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class VinoMapper implements Mapper<VinoDTO, Vino> {

    @Lazy
    @Autowired
    private PaisService paisService;

    @Lazy
    @Autowired
    private TipoService tipoService;

    @Lazy
    @Autowired
    private UvaService uvaService;

    @Lazy
    @Autowired
    private CrianzaService crianzaService;

    @Override
    public VinoDTO toDTO(Vino entity) {
        return new VinoDTO.Builder()
                .id(entity.getId())
                .nombre(entity.getNombre())
                .descripcion(entity.getDescripcion())
                .añoProduccion(entity.getAñoProduccion())
                .gradosAlcohol(entity.getGradosAlcohol())
                .volumenBotella(entity.getVolumenBotella())
                .cantidad(entity.getCantidad())
                .imagen(entity.getImagen())
                .tipo(entity.getTipoVino().getNombre())
                .crianza(entity.getCrianza().getNombre())
                .pais(entity.getPais().getNombre())
                .uva(entity.getTipoUva().getNombre())
                .bodega(entity.getBodega().getId())
                .precio(entity.getPrecioVenta())
                .build();
    }

    @Override
    public Vino toEntity(VinoDTO dto) {
        return new Vino.Builder()
                .idVino(dto.getId())
                .nombre(dto.getNombre())
                .descripcion(dto.getDescripcion())
                .precioVenta(dto.getPrecio())
                .añoProduccion(dto.getAñoProduccion())
                .gradosAlcohol(dto.getGradosAlcohol())
                .volumenBotella(dto.getVolumenBotella())
                .cantidad(dto.getCantidad())
                .imagen(dto.getImagen())
                .tipoVino(tipoService.findByNombre(dto.getTipo()))
                .pais(paisService.findByNombre(dto.getPais()))
                .tipoUva(uvaService.findByNombre(dto.getUva()))
                .crianza(crianzaService.findByNombre(dto.getCrianza()))
                .build();
    }
}
