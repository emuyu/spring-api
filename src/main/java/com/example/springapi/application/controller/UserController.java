package com.example.springapi.application.controller;

import com.example.springapi.application.resource.UserBody;
import com.example.springapi.domain.object.User;
import com.example.springapi.domain.service.UserService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * ユーザ操作のコントローラ
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/v1/users")
public class UserController {
    @NonNull
    private final UserService userService;

    /**
     * ユーザ検索
     * @param id　検索したいユーザーID
     * @return　ユーザ
     */
    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public User findById(@PathVariable("id") String id) {
        return this.userService.findById(id).orElseThrow(RuntimeException::new);
    }

    /**
     * ユーザ作成、更新
     * @param userBody　リクエストボディ
     * @return　更新後のユーザ
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User save(@RequestBody @Validated UserBody userBody) {
        return this.userService.save(userBody.toDomainUser());
    }

    /**
     * ユーザー削除
     *
     * @param id　削除したいユーザー
     */
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable("id") String id) {
        this.userService.deleteById(id);
    }
}
