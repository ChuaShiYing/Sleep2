package com.vaibhav.healthify.data.remote.auth

import com.vaibhav.healthify.data.models.remote.UserDTO
import com.vaibhav.healthify.util.Resource

interface AuthDataSource {

    suspend fun getUserData(email: String): Resource<UserDTO>

    suspend fun saveUserData(user: UserDTO): Resource<UserDTO>

    suspend fun saveUserName(username: String, email: String): Resource<Unit>

    suspend fun saveUserAgeAndWeight(age: Int, weight: Float, email: String): Resource<Unit>
}