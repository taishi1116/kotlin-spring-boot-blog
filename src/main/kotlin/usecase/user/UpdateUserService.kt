package usecase.user

import entity.User

class UpdateUserService(private val userRepository: IUserRepository) {
    fun execute(user: User) {
        userRepository.update(user)
    }
}