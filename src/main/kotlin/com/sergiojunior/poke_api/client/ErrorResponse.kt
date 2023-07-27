package com.sergiojunior.poke_api.client

class ErrorResponse(code: Int, message: String) : Throwable("($code) $message")