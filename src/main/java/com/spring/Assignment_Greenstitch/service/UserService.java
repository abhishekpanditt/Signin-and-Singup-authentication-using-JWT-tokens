package com.spring.Assignment_Greenstitch.service;

import com.spring.Assignment_Greenstitch.dto.UserDTO;
import com.spring.Assignment_Greenstitch.utils.BaseResponseDTO;

public interface UserService {
    BaseResponseDTO registerAccount(UserDTO userDTO);
}
