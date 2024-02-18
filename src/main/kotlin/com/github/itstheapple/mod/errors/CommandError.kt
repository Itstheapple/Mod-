package com.github.itstheapple.mod.errors

class CommandError(message: String, cause: Throwable) : Error(message, cause)