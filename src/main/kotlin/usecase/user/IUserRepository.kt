package usecase.user

import entity.User

interface IUserRepository {
    fun find(email: String, password: String)
    fun create(user: User)
    fun update(user: User)
    fun delete(id: String)
}