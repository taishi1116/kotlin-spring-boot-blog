package usecase.user

import entity.User

class CreateUserService(private val userRepository: IUserRepository) {
    fun execute(user: User) {
        userRepository.create(user)
    }
}


