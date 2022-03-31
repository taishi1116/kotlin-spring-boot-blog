package entity;

data class Comment(
    val articleId: String,
    val userId: String,
    val content: String,
    val createdAt: String,
    val updatedAt: String
)