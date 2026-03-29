package com.crio.rent_video.controller.exchanges.response;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class AuthResponse {
  private final String message = "Success";
}