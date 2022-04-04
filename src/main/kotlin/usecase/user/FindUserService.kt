package usecase.user

import entity.User

class FindUserService(private val userRepository: IUserRepository) {
    fun execute(id: String): User {
        return userRepository.find(id)
    }
}