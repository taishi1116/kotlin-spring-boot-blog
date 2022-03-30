package entity

class User(var name: String, val email: String, val password: String) {
    fun isProfileFilled(): Boolean = name.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty()
}