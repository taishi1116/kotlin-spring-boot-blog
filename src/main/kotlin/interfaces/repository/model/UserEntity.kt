package interfaces.repository.model

import javax.persistence.*

@Entity
@Table(name = "user")
data class UserEntity(
    @Id
    val id: Long,
    val name: String,
    val email: String,
    val password: String
)
