package usecase.user

class DeleteUserService(private val userRepository: IUserRepository) {
    fun execute(id: String) {
        userRepository.delete(id)
    }
}