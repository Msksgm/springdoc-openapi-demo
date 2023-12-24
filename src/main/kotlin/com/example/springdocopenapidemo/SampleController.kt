package com.example.springdocopenapidemo

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1")
class SampleController {
    @GetMapping("/{orderId}/orders")
    @Operation(summary = "エンドポイントの説明です")
    fun orders(
        @PathVariable orderId: String,
        @RequestParam("fields") @Parameter(description = "パラメータfieldsの説明です", required = true) fields: String?,
        @RequestParam("limit") @Parameter(description = "パラメータlimitの説明です", required = false) limit: Int?,
    ): ResponseEntity<String> {
        return ResponseEntity.ok("OK")
    }
}
