/*
 * Author: Krossby Adhemar Camacho Alviz
 *
 */

package br.com.krossft.scfp.repository;

import br.com.krossft.scfp.domain.entity.Movimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MovimentoRepository extends JpaRepository<Movimento, Long> {
}
