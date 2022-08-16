package com.example.springapi.domain.service;

import com.example.springapi.domain.object.User;
import com.example.springapi.domain.repository.UserRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * ユーザー操作のロジック
 */
@Service
@RequiredArgsConstructor
public class UserService {

    @NonNull
    private final UserRepository userRepository;

    /**
     * ユーザー検索
     *
     * @param id 検索したいユーザーID
     * @return ユーザ
     */
    public Optional<User> findById(String id) {
        return this.userRepository.findById(id);
    }


    /**
     * ユーザ作成、更新
     *
     * @param user　作成、更新したユーザ
     * @return  更新後のユーザ
     */
    public User save(User user) {
        return this.userRepository.save(user);
    }

    /**
     * ユーザ削除
     *
     * @param id 削除したいユーザーID
     */
    public void deleteById(String id) {
        this.userRepository.deleteById(id);
    }
}
