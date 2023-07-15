package app.rido.controller;

import lombok.Builder;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
  @GetMapping("/_status")
  Response getStatus() {
    return Response
        .builder()
        .status("OK")
        .message("API is up!")
        .build();

  }

  @Data
  @Builder
  private static class Response {
    private String status;
    private String message;
  }
}
