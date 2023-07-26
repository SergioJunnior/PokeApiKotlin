package com.sergiojunior.poke_api.client

class ErrorResponse(private val code: Int, message: String) : Throwable("($code) $message")