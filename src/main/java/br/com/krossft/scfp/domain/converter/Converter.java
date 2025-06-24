/*
 * Author: Krossby Adhemar Camacho Alviz
 * owned by Krossft.
 */

package br.com.krossft.scfp.domain.converter;


public interface Converter <E, D>{
    D toDTO(E entity);
    E toEntity(D dto);
}
