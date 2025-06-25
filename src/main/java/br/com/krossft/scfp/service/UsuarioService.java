/*
 * Author: Krossby Adhemar Camacho Alviz
 * owned by Krossft.
 */
 
package br.com.krossft.scfp.service;

import br.com.krossft.scfp.domain.entity.Usuario;
import br.com.krossft.scfp.exception.BusinessException;
import br.com.krossft.scfp.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario buscarPorId(Long id) throws BusinessException {
        return usuarioRepository.findById(id).orElseThrow(() -> new BusinessException("Usuário não encontrado"));
    }
}
