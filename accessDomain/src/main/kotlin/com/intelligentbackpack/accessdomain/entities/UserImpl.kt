package com.intelligentbackpack.accessdomain.entities

internal data class UserImpl(
    override val email: String,
    override val name: String,
    override val surname: String,
    override val password: String,
    override val role: Role
) : User
