package org.sopt.homesool.controller;

import com.sun.net.httpserver.Authenticator;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.sopt.homesool.common.dto.ApiResponse;
import org.sopt.homesool.common.dto.SuccessStatus;
import org.sopt.homesool.controller.dto.response.UserResponseDto;
import org.sopt.homesool.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/user")
@RestController
public class UserController {
    private final UserService userService;

    @GetMapping("{userId}")
    @ResponseStatus(HttpStatus.OK)
    public ApiResponse<UserResponseDto> read(@PathVariable Long userId) {
        return ApiResponse.success(SuccessStatus.USER_FIND_SUCCESS, userService.findUserById(userId));
    }


}
