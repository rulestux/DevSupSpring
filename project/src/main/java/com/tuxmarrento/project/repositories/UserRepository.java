package com.tuxmarrento.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tuxmarrento.project.entities.User;

/* interface 'JPA Repository' para a entidade 'User', com ID do tipo 'Long',
 * possibilitando instanciar um objeto do tipo 'Repository' que
 * proverá ferramentas à entidade 'User': */
public interface UserRepository extends JpaRepository<User, Long> {
}
