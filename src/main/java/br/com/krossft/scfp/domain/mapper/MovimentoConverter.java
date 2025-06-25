/*
 * Author: Krossby Adhemar Camacho Alviz
 * owned by Krossft.
 */

package br.com.krossft.scfp.domain.mapper;

import br.com.krossft.scfp.domain.converter.AbstractConverter;
import br.com.krossft.scfp.domain.dto.MovimentoDTO;
import br.com.krossft.scfp.domain.entity.Movimento;
import org.springframework.stereotype.Component;

@Component
public class MovimentoConverter extends AbstractConverter<Movimento, MovimentoDTO> {
    public MovimentoConverter() {
        super(Movimento.class, MovimentoDTO.class);
    }

    @Override
    protected void configureMapping() {
        modelMapper.createTypeMap(Movimento.class, MovimentoDTO.class)
                .addMappings(mapper -> {
                });

        modelMapper.createTypeMap(MovimentoDTO.class, Movimento.class)
                .addMappings(mapper -> {
                });
    }
}
