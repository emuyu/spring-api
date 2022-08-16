package com.example.springapi.domain.repository;
import com.example.springapi.domain.object.User;
import java.util.Optional;

/**
 * インフラ層とのインターフェース
 */

public interface UserRepository {
    /**
     * ユーザー検索
     *
     * @param id 検索したいユーザID
     * @return ユーザー
     */
    Optional<User> findById(String id);

    /**
     * ユーザー作成、更新
     *
     * @param user 作成、更新したユーザー
     * @return 更新後のユーザ
     */
    User save(User user);

    /**
     * ユーザ削除
     *
     * @param id 削除したいユーザID
     */
    void deleteById(String id);
}
