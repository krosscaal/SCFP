/*
 * Author: Krossby Adhemar Camacho Alviz
 * owned by Krossft.
 */

package br.com.krossft.scfp.domain.mapper;

import br.com.krossft.scfp.domain.converter.AbstractConverter;
import br.com.krossft.scfp.domain.dto.ContaDTO;
import br.com.krossft.scfp.domain.entity.Conta;
import org.springframework.stereotype.Component;

@Component
public class ContaConverter extends AbstractConverter<Conta, ContaDTO> {
    public ContaConverter() {
        super(Conta.class, ContaDTO.class);
    }

    @Override
    protected void configureMapping() {
        modelMapper.createTypeMap(Conta.class, ContaDTO.class)
                .addMappings(mapper -> {
                });

        modelMapper.createTypeMap(ContaDTO.class, Conta.class)
                .addMappings(mapper -> {
                });
    }

}
