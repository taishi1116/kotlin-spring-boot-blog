package usecase.user

import entity.User

interface IUserRepository {
    fun find(id: String): User
    fun create(user: User)
    fun update(user: User)
    fun delete(id: String)
}