package com.example.springapi.infrastructure.repository;

import com.example.springapi.infrastructure.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JPAを利用するためのインターフェース
 */
public interface UserJpaRepository extends JpaRepository<UserEntity, String> {
}
