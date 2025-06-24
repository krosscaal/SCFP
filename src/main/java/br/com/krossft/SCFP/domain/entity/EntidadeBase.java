/*
 * Author: Krossby Adhemar Camacho Alviz
 * owned by Krossft.
 */

package br.com.krossft.SCFP.domain.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.proxy.HibernateProxy;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
@MappedSuperclass
@Getter
@Setter
public abstract class EntidadeBase {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idgenerator")
    @SequenceGenerator(name = "idgenerator", initialValue = 10)
    private Long id;

    @CreationTimestamp
    private LocalDateTime dataCriacao;

    @CreationTimestamp
    private LocalDateTime dataAtualizacao;

    @PrePersist
    protected void prePersist() {
        this.dataCriacao = LocalDateTime.now();
    }
    @PreUpdate
    protected void preUpdate() {
        this.dataAtualizacao = LocalDateTime.now();
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        EntidadeBase that = (EntidadeBase) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }


}
