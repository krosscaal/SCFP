/*
 * Author: Krossby Adhemar Camacho Alviz
 *
 */

package br.com.krossft.SCFP.repository;

import br.com.krossft.SCFP.domain.entity.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {
}
